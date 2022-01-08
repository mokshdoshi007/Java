package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.model;

public class regdao 
{
	Connection cn=null;
	int x=0;
	public regdao(Connection cn)
	{
		this.cn=cn;
	}
	public int registerdata(model u) 
	{
		try 
		{
			PreparedStatement pst=cn.prepareStatement("insert into user(fname,lname,uname,pass) values(?,?,?,?)");
			pst.setString(1, u.getFname());
			pst.setString(2, u.getLname());
			pst.setString(3, u.getUname());
			pst.setString(4, u.getPass());
			x=pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return x;
	}
}
