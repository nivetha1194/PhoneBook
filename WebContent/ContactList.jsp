<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contact List</title>
</head>
<body>
<form >
<table>
<tr><th>Firstname</th><th>Lastname</th><th>Home_Phone</th><th>Work_Phone</th><th>Additional_Phone</th><th>Personal_Email</th><th>Work_Email</th><th>Update</th><th>Delete</th></tr>

<c:forEach items="${contacts}" var="contact">    
  <tr>
    <td>${contact.getFirstname()}</td>
    <td>${contact.getLastname()}</td>
    <td>${contact.getHome_phone()}</td>
    <td>${contact.getWork_phone()}</td>
    <td>${contact.getAdditional_phone()}</td>
    <td>${contact.getPersonal_email() }</td>
    <td>${contact.getWork_email() }</td>
    <td><a href="log1?action=edit&id=<c:out value="${contact.getId()}"/>">Update</a></td>
    <td><a href="log1?action=delete&id=<c:out value="${contact.getId()}"/>">Delete</a></td>
  </tr>
</c:forEach>
</table></form>
<a href="ContactPage.jsp">Add Contact</a>
</body>
</html>