<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%out.println("Testing Message1");
out.println("Testing Message2");%><!-- scriplet tag -->
<%!int a = 5; %><!-- declaration tag -->
<%=a%><!-- expression tag -->
<%out.print(a);%>
</body>
</html>