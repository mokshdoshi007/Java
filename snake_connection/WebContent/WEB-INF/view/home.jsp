<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="">
<tr>
<th>UID</th><th>Fname</th><th>Lname</th><th>Uname</th><th>Pass</th>
</tr>
<tr>
<td>${hmodel.uid }</td>
<td>${hmodel.fname }</td>
<td>${hmodel.lname }</td>
<td>${hmodel.uname }</td>
<td>${hmodel.pass }</td>
<td><a href="HomeController.do?action=editdata&uid=${hmodel.uid }">Edit</a></td>
<td><a href="HomeController.do?action=deletedata&uid=${hmodel.uid }">Delete</a></td>
</tr>
</table>

<br>
<br>
<br>

//<c:if test="${editmodel.uid > 0 }">
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
<td><input type="password" name="pass" value="${editmodel.pass }"><input type="hidden" name="uid" value="${editmodel.uid }"></td>
</tr>
<tr>
<td><input type="submit" value="Update"></td>
</tr>
</table>
</form>
</c:if>
</body>
</html>