<%@page import="com.bean.bean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String email=null;
if(session.getAttribute("otp")==null) 
{
response.sendRedirect("forgotpassword.jsp");
}
else	
{
	bean o=(bean)session.getAttribute("UserData");
	email=o.getEmail();
}
%>
<form action="ForgotController" method="post">
<label>Email Send On Email Address &emsp;<%=email%></label>
<br>
<input type="text" name="EnterOTP" >
<input type="submit" name="action" value="Verify">
${notmatch}
</form>
</body>
</html>