<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="contact.js"></script>
<body>
<form name="updateform" action="log1" method="post" onsubmit="return validateform()">
<table>
<tr><td><input value="<c:out value="${contact.getId()}" />" type="hidden" name="id"/></td></tr>
<tr><td>Fistname</td><td><input value="<c:out value="${contact.getFirstname()}" />" type="text" name="firstname"/></td></tr>
<tr><td>Lastname</td><td><input value="<c:out value="${contact.getLastname()}" />" type="text" name="lastname"/></td></tr>
<tr><td>Home_Phone</td><td><input value="<c:out value="${contact.getHome_phone()}" />" type="number" name="home_phone"/></td></tr>
<tr><td>Work_Phone</td><td><input value="<c:out value="${contact.getWork_phone()}" />" type="number" name="work_phone"/></td></tr>
<tr><td>Additional_Phone</td><td><input value="<c:out value="${contact.getAdditional_phone()}" />" type="number" name="additional_phone"/></td></tr>
<tr><td>Personal_Email</td><td><input  value="<c:out value="${contact.getPersonal_email()}" />" type="email" name="personal_email"/></td></tr>
<tr><td>Work_Email</td><td><input value="<c:out value="${contact.getWork_email()}" />" type="email" name="work_email"/></td></tr>

<tr><td><input type="submit" value="Update Contact"/></td></tr>
</table>
</form>
</body>
</html>