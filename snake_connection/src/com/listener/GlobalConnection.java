package com.listener;

import java.sql.Connection;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.util.DBConnection;
@WebListener
public class GlobalConnection implements ServletContextListener {
    public GlobalConnection() {
        // TODO Auto-generated constructor stub
    }
    public void contextDestroyed(ServletContextEvent arg0) 
    {
    	System.out.println("Server Destroyed....");
    }
    public void contextInitialized(ServletContextEvent e)  
    {
    	System.out.println("Servlet Listener is Started....");
    	Connection cn=new DBConnection().getConnectionData();
    	ServletContext context=e.getServletContext();
    	context.setAttribute("cn", cn);
    }	
}
