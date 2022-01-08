package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.homedao;
import com.model.model;

@WebServlet("/homecontroller.do")
public class homecontroller extends HttpServlet {
	homedao hdao = null;
	private static final long serialVersionUID = 1L;
    public homecontroller() 
    {
        super();
    }
    public void init(ServletConfig config)
    {
    	ServletContext context = config.getServletContext();
    	hdao = new homedao((Connection)context.getAttribute("cn"));
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action = request.getParameter("action");
		if(action.equalsIgnoreCase("showdata"))
		{
			int uid = Integer.parseInt(request.getParameter("uid"));
			model h = hdao.getshowdata(uid);
			if(h!=null)
			{
				request.setAttribute("h", h);
				request.getRequestDispatcher("/WEB-INF/view/home.jsp").forward(request,response);				
			}
		}
		else if(action.equalsIgnoreCase("alldata"))
		{
			List <model> lists = hdao.getalldata();
			for(int i=0; i<lists.size(); i++)
				System.out.println(lists.get(i).getUid());
			request.setAttribute("lists", lists);
			request.getRequestDispatcher("/WEB-INF/view/home.jsp").forward(request,response);				
		}
		else if(action.equalsIgnoreCase("editdata"))
		{
			int uid = Integer.parseInt(request.getParameter("uid"));
			model h = hdao.getshowdata(uid);
			if(h!=null)
			{
				request.setAttribute("editmodel", h);
				request.getRequestDispatcher("/WEB-INF/view/home.jsp").forward(request,response);				
			}
		}
		else if(action.equalsIgnoreCase("deletedata"))
		{
			int uid = Integer.parseInt(request.getParameter("uid"));
			int x=hdao.dodeletedata(uid);
			if(x>0)
			{
				request.setAttribute("msg", "Record Deleted");
				request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);
			}
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		model model=new model();
		model.setUid(Integer.parseInt(request.getParameter("uid")));
		model.setFname(request.getParameter("fname"));
		model.setLname(request.getParameter("lname"));
		model.setUname(request.getParameter("uname"));
		model.setPass(request.getParameter("pass"));
		int x=hdao.doupdatedata(model);
		if(x>0)
		{
			response.sendRedirect("homecontroller.do?action=showdata&uid="+model.getUid());
		}
	}

}
