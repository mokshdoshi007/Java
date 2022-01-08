<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${msg} 
<form method="post" action="RegistrationController">
<table>
<tr>
<td>
Fname
</td>
<td>
<input type="text" name="fname">
</td>
</tr>
<tr>
<td>
Lname
</td>
<td>
<input type="text" name="lname">
</td>
</tr>

<tr>
<td>
Username
</td>
<td>
<input type="text" name="username">
</td>
</tr>
<tr>
<td>
Password
</td>
<td>
<input type="password" name="password">
</td>
</tr>
<tr>
<td>
<input type="submit" name="Register">
</td>
<tr>
</table>
</form>
</body>
</html>