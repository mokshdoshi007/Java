package com.servletjsp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servletjsp")
public class servletjsp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		System.out.println("In Servlet");
		//response.sendRedirect("login.jsp");//data not send+url jsp name show
		request.getRequestDispatcher("login.jsp").include(request, response);
		//request.getRequestDispatcher("login.jsp").forward(request, response);
	}

}
