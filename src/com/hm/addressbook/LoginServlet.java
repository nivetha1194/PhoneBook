package com.hm.addressbook;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("get method");
		
	}
*/	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String n=req.getParameter("uname");
		String p=req.getParameter("pass");
		
		if(n.equals("t")&&p.equals("t"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("log1?action=list");
			
			rd.forward(req, resp);
		}
		else
		{
			out.print("Password do not match");
			RequestDispatcher rd=req.getRequestDispatcher("/index.html");
			rd.forward(req, resp);
		}
		
	}
	
}
