package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.bean;
import com.dao.dao;
@WebServlet("/servlet")
public class servlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
   	{
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("insert"))
		{
			bean ob = new bean();
			ob.setName(request.getParameter("name"));
			ob.setAge(Integer.parseInt(request.getParameter("age")));
			ob.setGender(request.getParameter("gender"));
			dao.insertdata(ob);
			response.sendRedirect("show.jsp");
		}
		else if (action.equalsIgnoreCase("edit")) {
			bean ob = new bean();
			ob.setId(Integer.parseInt(request.getParameter("id")));
			bean b = dao.getdatabyid(ob);
			request.setAttribute("b", b);
			request.getRequestDispatcher("update.jsp").forward(request, response);
		}
		else if (action.equalsIgnoreCase("delete")) {
			bean ob = new bean();
			ob.setId(Integer.parseInt(request.getParameter("id")));
			dao.deletedata(ob);
			response.sendRedirect("show.jsp");
		}
		else if(action.equalsIgnoreCase("update"))
		{
		bean ob = new bean();
		ob.setId(Integer.parseInt(request.getParameter("id")));
		ob.setName(request.getParameter("name"));
		ob.setAge(Integer.parseInt(request.getParameter("age")));
		ob.setGender(request.getParameter("gender"));
		dao.updatedata(ob);
			response.sendRedirect("show.jsp");
		}
	}

}
