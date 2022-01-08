<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="">
<tr>
<th>UserId</th>
<th>Fname</th>
<th>Lname</th>
<th>Username</th>
<th>Password</th>
</tr>
<tr>
<td><%=session.getAttribute("uid") %></td>
<td><%=session.getAttribute("fname") %></td>
<td><%=session.getAttribute("lname") %></td>
<td><%=session.getAttribute("username") %></td>
<td><%=session.getAttribute("password") %></td>
<td><a href="HomeController?action=editdata&uid=<%=session.getAttribute("uid")%>">Edit</a></td>
<td><a href="HomeController?action=deletedata&uid=<%=session.getAttribute("uid")%>">Delete</a></td>
</tr>
</table>
<br>
<c:if test="${hmodel.uid>0}">
<form method="post" action="HomeController">
<table>
<tr>
<td>
Fname
</td>
<td>
<input type="text" name="fname" value="${hmodel.fname}">
</td>
</tr>
<tr>
<td>
Lname
</td>
<td>
<input type="text" name="lname" value="${hmodel.lname}">
</td>
</tr>

<tr>
<td>
Username
</td>
<td>
<input type="text" name="username" value="${hmodel.username}">
</td>
</tr>
<tr>
<td>
Password
</td>
<td>
<input type="password" name="password" value="${hmodel.password}"><input type="hidden" name="uid" value="${hmodel.uid}">
</td>
</tr>
<tr>
<td>
<input type="submit" value="Update">
</td>
<tr>
</table>
</form>
</c:if>
</body>
</html>