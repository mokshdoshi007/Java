<%@page import="com.bean.bean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%bean b=(bean)request.getAttribute("b"); %>
<body>
<form action="servlet" method="post">
<input type="hidden" name="id" value="<%=b.getId()%>"> 
<label>Name</label>
<input type="text" name="name" value="<%=b.getName()%>">
<br>
<label>Age</label>
<input type="text" name="age" value="<%=b.getAge()%>">
<br>
<label>Gender</label>
<input type="radio" value="Male" name="gender">
Male
<input type="radio" value="Female" name="gender">
Female
<br>
<input type="submit" value="update" name="action">
</form>
</body>
</html>