<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%if(request.getAttribute("Otpmatch")!=null) {%>
<form action="ForgotController" method="post">
<input type="password" name="newpassword">
<input type="password" name="Cpassword">

<input type="submit" name="action"  value="Confirm">
</form>
<%}
else
{
	response.sendRedirect("SendOTP.jsp");
}
%>
</body>
</html>