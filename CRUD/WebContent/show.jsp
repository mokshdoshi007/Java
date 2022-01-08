<%@page import="com.dao.dao"%>
<%@page import="com.bean.bean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
Data Inserted Successfully
<br>
<%List <bean> list = dao.getAllStudent(); %>
<table border="1" cellpadding="5" cellspacing="5" width="100%">
	<tr>
		<th>ID</th>
		<th>NAME</th>
		<th>AGE</th>
		<th>GENDER</th>
		<th></th>
		<th></th>
	</tr>
	<%
		for(bean s:list)
		{
	%>
	<tr>
		<td><%=s.getId() %></td>
		<td><%=s.getName() %></td>
		<td><%=s.getAge() %></td>
		<td><%=s.getGender() %></td>
		<td>
		<form action="servlet" method="post">
		<input type="hidden" name="id" value="<%=s.getId() %>">
		<input type="submit" name="action" value="Edit">
		</form>
		</td>
		<td>
		<form action="servlet" method="post">
		<input type="hidden" name="id" value="<%=s.getId() %>">
		<input type="submit" name="action" value="Delete">
		</form>
		</td>
	</tr>
	<%		
		}
	%>
</table>
<a href=index.jsp>Add Data</a>
</body>
</html>