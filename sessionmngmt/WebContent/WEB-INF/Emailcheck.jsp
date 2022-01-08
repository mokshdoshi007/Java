<%@ page import="java.sql.*" %>  
    <%  
    String Email=request.getParameter("val");  
    if(Email==null||Email.trim().equals(""))
    {  
    	out.print("<p>Please enter Email!</p>");  
    }
    else
    {  
    	try
    	{  
    		Class.forName("com.mysql.jdbc.Driver");
    		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql","root","");  
    		PreparedStatement ps=con.prepareStatement("select * from sessionmgt where email=?");  
    		ps.setString(1, Email);
    		ResultSet rs=ps.executeQuery();  
      		if(rs.next()) 
      		{      
     			out.println("true");   
    		}
      		else
      		{  
    			out.println("false"); 
    		}  
    		con.close();  
    	}
    	catch(Exception e)
    	{
    		out.print(e);
    	}  
    }  
    %>  