package com.hm.addressbook;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	ContactDao contactDao=new ContactDao();
	
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("delete"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			contactDao.deleteContact(id);
			getListOfContacts(request, response);
		}
		else if(action.equalsIgnoreCase("edit"))
		{
			int id=Integer.parseInt(request.getParameter("id"));
			Contact contact=contactDao.getContact(id);
			request.setAttribute("contact", contact);
			 RequestDispatcher dispatcher = request
	                 .getRequestDispatcher("/contact.jsp");  
	if (dispatcher != null){  
	dispatcher.forward(request, response);  
	}
		}
		else
		getListOfContacts(request, response);
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		Integer home_phone=Integer.parseInt(request.getParameter("home_phone"));
		Integer work_phone=Integer.parseInt(request.getParameter("work_phone"));
		Integer additional_phone=Integer.parseInt(request.getParameter("additional_phone"));
		String personal_email=request.getParameter("personal_email");
		String work_email=request.getParameter("work_email");
		String id = request.getParameter("id");
        if(id == null || id.isEmpty())
        {
        	contactDao.addContact(new Contact(firstname,lastname,personal_email,work_email,home_phone,work_phone,additional_phone));
        }
        else
        {
            int Id=Integer.parseInt(id);
            contactDao.updateContact(new Contact(Id,firstname,lastname,personal_email,work_email,home_phone,work_phone,additional_phone));
       
        }
		
		
		getListOfContacts(request, response);
		

	}

	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id=Integer.parseInt(request.getParameter("id"));
		contactDao.deleteContact(id);
		getListOfContacts(request, response);
	}

	@Override
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("id"));
	
		
		
		
		
	}
	
	
	void getListOfContacts(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		List<Contact> contacts=contactDao.getAllContacts();
		request.setAttribute("contacts", contacts);
		 RequestDispatcher dispatcher = request
                 .getRequestDispatcher("/ContactList.jsp");  
if (dispatcher != null){  
dispatcher.forward(request, response);  
}
	}
	

}
