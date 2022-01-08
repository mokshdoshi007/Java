package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class util 
{
	public Connection getconnection()
	{
		Connection cn=null;
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql", "root", "");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return cn;
	}
}
