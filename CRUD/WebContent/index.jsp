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
<label>Name</label>
<input type="text" name="name">
<br>
<label>Age</label>
<input type="text" name="age">
<br>
<label>Gender</label>
<input type="radio" value="Male" name="gender">
Male
<input type="radio" value="Female" name="gender">
Female
<br>
<input type="submit" value="insert" name="action">
</form>
<a href=show.jsp>Show Data</a>
</body>
</html>