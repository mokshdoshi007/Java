<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Login Successful
<table>
<tr>
<th>UID</th><th>First Name</th><th>Last Name</th><th>User Name</th><th>Password</th>
</tr>
<tr>
<td>${h.uid}</td>
<td>${h.fname}</td>
<td>${h.lname}</td>
<td>${h.uname}</td>
<td>${h.pass}</td>
<td><a href="homecontroller.do?action=editdata&uid=${h.uid }">Edit</a></td>
<td><a href="homecontroller.do?action=deletedata&uid=${h.uid }">Delete</a></td>
<td><a href="homecontroller.do?action=alldata">All Data</a></td>
</tr>
</table>
<c:if test="${editmodel.uid > 0 }">
<form method="post" action="homecontroller.do">
<table>
<tr>
<td>First Name :</td>
<td><input type="text" name="fname" value="${editmodel.fname }"></td>
</tr>
<tr>
<td>Last Name :</td>
<td><input type="text" name="lname" value="${editmodel.lname }"></td>
</tr>
<tr>
<td>User Name :</td>
<td><input type="text" name="uname" value="${editmodel.uname }"></td>
</tr>
<tr>
<td>Password :</td>
<td><input type="password" name="pass" value="${editmodel.pass }">
<input type="hidden" name="uid" value="${editmodel.uid}"></td>
</tr>
<tr>
<td><input type="submit" value="Update"></td>
</tr>
</table>
</form>
</c:if>
<table border="">
<tr>
<th>UserId</th><th>Fname</th><th>Lname</th><th>Username</th><th>Password</th>
</tr>
<c:forEach var="lists" items="${lists }">
<tr>
<td>${lists.uid}</td>
<td>${lists.fname}</td>
<td>${lists.lname}</td>
<td>${lists.uname}</td>
<td>${lists.pass}</td><%-- 
<td><a href="HomeController.do?action=editdata&uid=${hmodel.userid }">Edit</a></td>
<td><a href="HomeController.do?action=deletedata&uid=${hmodel.userid }">Delete</a></td> --%>
</tr>
</c:forEach>
</table>
</body>
</html>