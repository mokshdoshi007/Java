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

import com.dao.HomeDao;
import com.model.UserModel;
@WebServlet("/HomeController.do")
public class HomeController extends HttpServlet {
	HomeDao hdao=null;
	private static final long serialVersionUID = 1L;
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init(ServletConfig config) throws ServletException 
    {
    	ServletContext context=config.getServletContext();
    	hdao=new HomeDao((Connection)context.getAttribute("cn"));
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action=request.getParameter("action");
		int uid=Integer.parseInt(request.getParameter("uid"));
		if(action.equalsIgnoreCase("showdata"))
		{
			UserModel hmodel=hdao.getShowData(uid);
			if(hmodel != null)
			{
				request.setAttribute("hmodel", hmodel);
				request.getRequestDispatcher("/WEB-INF/view/home.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("editdata"))
		{
			UserModel hmodel=hdao.getShowData(uid);
			if(hmodel != null)
			{
				request.setAttribute("editmodel", hmodel);
				request.getRequestDispatcher("/WEB-INF/view/home.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("deletedata"))
		{
			int x=hdao.doDeleteData(uid);
			if(x>0)
			{
				request.setAttribute("msg", "record Deleted...");
				request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);
			}
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		UserModel model=new UserModel();
		model.setUid(Integer.parseInt(request.getParameter("uid")));
		model.setFname(request.getParameter("fname"));
		model.setLname(request.getParameter("lname"));
		model.setUname(request.getParameter("uname"));
		model.setPass(request.getParameter("pass"));
		int x=hdao.doUpdateData(model);
		if(x>0)
		{
			response.sendRedirect("HomeController.do?action=showdata&uid="+model.getUid());
		}
	}

}
