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

import com.dao.LoginDao;
import com.model.UserModel;
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	LoginDao ldao=null;
	private static final long serialVersionUID = 1L;
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init(ServletConfig config) throws ServletException
    {
    	ServletContext context=config.getServletContext();
    	ldao=new LoginDao((Connection)context.getAttribute("cn"));
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		UserModel lmodel=new UserModel();
		lmodel.setUname(request.getParameter("uname"));
		lmodel.setPass(request.getParameter("pass"));
		
		UserModel user1=ldao.getLogin(lmodel);
		if(user1 != null)
		{
			HttpSession session=request.getSession(true);
			session.setAttribute("uid", user1.getUid());
			session.setAttribute("fname", user1.getFname());
			session.setAttribute("lname", user1.getLname());
			session.setAttribute("uname", user1.getUname());
			session.setAttribute("pass", user1.getPass());
			session.setMaxInactiveInterval(120);
			
			response.sendRedirect("HomeController.do?action=showdata&uid="+user1.getUid());
		}
		else
		{
			request.setAttribute("msg", "Invalid USername and Password....");
			request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);
		}
	}
}