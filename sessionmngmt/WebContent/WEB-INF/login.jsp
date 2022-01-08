<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="servlet" method="post">
Email
<input type="email" name="email">
<br>
Password
<input type="password" name="password">
<br>
<input type="submit" value="Login" name="action">
</form>
<a href="registration.jsp">New User</a>
<a href="forgotpassword.jsp">Forgot Password</a>
</body>
</html>