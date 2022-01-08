package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		String action = request.getParameter("action");
		response.setContentType("text/html");
		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
		PrintWriter pw = response.getWriter();
		if(action.equalsIgnoreCase("Addition"))
		{
		pw.println(n1+n2);
		}
		else if(action.equalsIgnoreCase("Subtraction"))
		{
		pw.println(n1-n2);
		}
		else if(action.equalsIgnoreCase("Multiplication"))
		{
		pw.println(n1*n2);
		}
		else if(action.equalsIgnoreCase("Division"))
		{
		pw.println(n1/n2);
		}
	}

}
