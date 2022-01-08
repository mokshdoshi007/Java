<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ForgotController" method="post">
<label>Email
</label>
<input type="email" name="email">
<font color="red">${invalidemail}</font>
<font color="red">${SendOtpError}</font>
<input  type="submit" value="Submit" name="action">
</form>
<div style="color: red; background-color: gray;"></div>
</body>
</html>	