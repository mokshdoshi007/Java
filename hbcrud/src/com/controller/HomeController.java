package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.HomeDao;
import com.model.UserModel;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public HomeController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action.equals("editdata"))
		{
			int uid = Integer.parseInt(request.getParameter("uid"));
			UserModel hmodel = new HomeDao().getLogin(uid);
			request.setAttribute("hmodel", hmodel);
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}
		if(action.equals("deletedata"))
		{
			int uid = Integer.parseInt(request.getParameter("uid"));
			int x = new HomeDao().deleteuser(uid);
			if(x>0)
			{
				request.setAttribute("msg", "Record Deleted");
				request.getRequestDispatcher("registration.jsp").forward(request, response);
			}
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		UserModel homemodel = new UserModel();
		homemodel.setUid(Integer.parseInt(request.getParameter("uid")));
		homemodel.setFname(request.getParameter("fname"));
		homemodel.setLname(request.getParameter("lname"));
		homemodel.setUsername(request.getParameter("username"));
		homemodel.setPassword(request.getParameter("password"));
		int x = new HomeDao().updateuser(homemodel);
		if(x>0)
		{
			request.setAttribute("msg", "Record Updated");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}

	}

}
