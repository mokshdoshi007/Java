package com.controller;

import java.io.IOException;
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
	private static final long serialVersionUID = 1L;
    public LoginController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserModel lmodel = new UserModel();
		lmodel.setUsername(request.getParameter("username"));
		lmodel.setPassword(request.getParameter("password"));
		UserModel umodel = new LoginDao().getLogin(lmodel);
		if(umodel!=null)
		{
			HttpSession sess = request.getSession(true);
			sess.setAttribute("uid", umodel.getUid());
			sess.setAttribute("fname", umodel.getFname());
			sess.setAttribute("lname", umodel.getLname());
			sess.setAttribute("username", umodel.getUsername());
			sess.setAttribute("password", umodel.getPassword());
			response.sendRedirect("home.jsp");
		}
		else
		{
			request.setAttribute("msg","Invalid Username and Password");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
