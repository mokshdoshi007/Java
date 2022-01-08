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
import javax.servlet.http.HttpSession;

import com.dao.logindao;
import com.model.model;
@WebServlet("/logcontroller")

public class logcontroller extends HttpServlet {
	logindao ldao = null;
	public void init(ServletConfig conf) throws ServletException
	{
		ServletContext cont=conf.getServletContext();
		ldao = new logindao((Connection)cont.getAttribute("cn"));
	}
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		model l = new model();
		l.setUname(request.getParameter("uname"));
		l.setPass(request.getParameter("pass"));
		model u1 = ldao.getlogin(l);
		if(u1!=null)
		{
			HttpSession session = request.getSession(true);
			session.setAttribute("uid", u1.getUid());
			session.setAttribute("fname", u1.getFname());
			session.setAttribute("lname", u1.getLname());
			session.setAttribute("uname", u1.getUname());
			session.setAttribute("pass", u1.getPass());
			session.setMaxInactiveInterval(120);
			response.sendRedirect("homecontroller.do?action=showdata&uid="+u1.getUid());
		}
		else
		{
			request.setAttribute("msg","Invalid Username and Password");
			request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);
		}
	}

}
