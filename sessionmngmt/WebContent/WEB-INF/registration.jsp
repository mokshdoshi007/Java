<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="reg_form" action="servlet" method="post">
Name
<input type="text" name="name">
<br>
Mobile
<input type="text" name="mobile">
<br>
Email
<input type="email" id="Email" name="email" onblur="searchInfo()">
<span id="Email"></span>
<br>
Password
<input type="password" name="password">
<br>
<input type="submit" value="Register" name="action" id="register-submit">
</form>
<a href="login.jsp">Already have an Account</a>
<!-- Ajax script -->
	<script>
	var request=new XMLHttpRequest();  
	function searchInfo()
	{  
		var Email=document.reg_form.Email.value;  
		var url="Emailcheck.jsp?val="+Email; 
	  	try
	  	{  
			request.onreadystatechange=function()
			{  
				if(request.readyState==4)
				{  
					
					var val=request.responseText;
					
					document.getElementById('Email').innerHTML=val; 
					if(val.trim()=="false")
					{ 
						document.getElementById('register-submit').disabled="";	
					}
					else
					{
						alert("Email is already registered \n please enter other valid Email ");
						document.getElementById('register-submit').disabled=true;
					}
				}  
			}  
			request.open("GET",url,true);  
			request.send();  
		}
	  	catch(e)
	  	{
	  		alert("Unable to connect to server");
	  	}  
	}
	

	</script>
</body>
</html> 