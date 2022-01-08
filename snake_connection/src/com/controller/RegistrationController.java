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

import com.dao.RegistrationDao;
import com.model.UserModel;
@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	RegistrationDao rdao=null;
	private static final long serialVersionUID = 1L;
    public RegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init(ServletConfig config) throws ServletException 
    {
    	ServletContext context=config.getServletContext();
    	rdao=new RegistrationDao((Connection)context.getAttribute("cn"));
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		request.getRequestDispatcher("/WEB-INF/view/registration.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		UserModel umodel=new UserModel();
		umodel.setFname(request.getParameter("fname"));
		umodel.setLname(request.getParameter("lname"));
		umodel.setUname(request.getParameter("uname"));
		umodel.setPass(request.getParameter("pass"));
		
		int x=rdao.doRegisterData(umodel);
		if(x>0)
		{
			request.setAttribute("msg", "Record inserted...");
			request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);
		}
		else
		{
			request.setAttribute("msg", "Record not inserted...");
			request.getRequestDispatcher("/WEB-INF/view/registration.jsp").forward(request, response);
		}

	}

}
