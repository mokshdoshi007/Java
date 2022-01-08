<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="servletjsp" method="post">
<fieldset>
<legend>Personal Information</legend>
<label>Name &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: </label>
<input type=text>
<br>
<label>Age &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :</label>
<input type=number>
<br>
<label>Address &nbsp;: </label>
<input type=text>
<br>
</fieldset>
<fieldset>
<legend>Academic Information</legend>
<label>Email&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; : </label>
<input type=email>
<br>
<label>Password : </label>
<input type=password>
<br>
<label>Subject &nbsp;&nbsp;&nbsp;: </label>
<select name="Subject">
  <option>Physics</option>
  <option>Chemistry</option>
  <option>Maths</option>
  <option>Computer</option>
</select>
<br>
</fieldset>
<input type="submit" value="Register">
</form>
</body>
</html>