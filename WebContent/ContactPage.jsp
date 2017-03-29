<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of Contact</title>
</head>
<script type="text/javascript" src="contact.js"></script>
<body>
<form name="myform" action="log1" method="post" onsubmit="return validateform()">
<center>Contact List</center>
<table>
<tr><td>Fistname</td><td><input type="text" name="firstname"/></td></tr>
<tr><td>Lastname</td><td><input type="text" name="lastname"/></td></tr>
<tr><td>Home_Phone</td><td><input type="number" name="home_phone"/></td></tr>
<tr><td>Work_Phone</td><td><input type="number" name="work_phone"/></td></tr>
<tr><td>Additional_Phone</td><td><input type="number" name="additional_phone"/></td></tr>
<tr><td>Personal_Email</td><td><input type="email" name="personal_email"/></td></tr>
<tr><td>Work_Email</td><td><input type="email" name="work_email"/></td></tr>

<tr><td><input type="submit" value="Add Contact"/></td></tr>
</table>
</form>
</body>
</html>