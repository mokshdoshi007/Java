package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.RegistrationDao;
import com.model.UserModel;

/**
 * Servlet implementation class RegistrationController
 */
@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegistrationController() {
        super();
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		UserModel rmodel = new UserModel();
		rmodel.setFname(request.getParameter("fname"));
		rmodel.setLname(request.getParameter("lname"));
		rmodel.setUsername(request.getParameter("username"));
		rmodel.setPassword(request.getParameter("password"));
		String msg=new RegistrationDao().doRegister(rmodel);
		if(!msg.equals("error"))
		{
			request.setAttribute("msg", msg);
			request.getRequestDispatcher("login.jsp").forward(request,response);
		}
		else
		{
			request.setAttribute("msg", "404-Record Not Inserted");
			request.getRequestDispatcher("registration.jsp").forward(request,response);
		}
	}

}
