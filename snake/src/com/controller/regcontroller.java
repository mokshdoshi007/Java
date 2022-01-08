package com.controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.regdao;
import com.model.model;

@WebServlet("/regcontroller")
public class regcontroller extends HttpServlet {
	regdao rdao = null;
	private static final long serialVersionUID = 1L;
    public regcontroller() {
        super();
    }
    public void init(ServletConfig config) throws ServletException 
    {
    	ServletContext context=config.getServletContext();
    	rdao=new regdao((Connection)context.getAttribute("cn"));
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		request.getRequestDispatcher("/WEB-INF/view/registration.jsp").forward(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		model u = new model();
		u.setFname(request.getParameter("fname"));
		u.setLname(request.getParameter("lname"));
		u.setUname(request.getParameter("uname"));
		u.setPass(request.getParameter("pass"));
		int x=rdao.registerdata(u);
		if(x>0)
		{
			request.setAttribute("msg", "Record Inserted");
			request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request,response);
		}
		else
		{
			request.setAttribute("msg", "Record Not Inserted");
			request.getRequestDispatcher("/WEB-INF/view/registration.jsp").forward(request,response);
		}
	}

}
