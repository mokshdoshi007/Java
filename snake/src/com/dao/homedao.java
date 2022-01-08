package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.model;


public class homedao {
	Connection cn = null;
	public homedao(Connection cn) {
		this.cn=cn;
	}
	public model getshowdata(int uid) {
		model u1=null;
		try 
		{
			PreparedStatement pst=cn.prepareStatement("select * from user where uid=?");
			pst.setInt(1, uid);
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
				u1=new model();
				u1.setUid(rs.getInt(1));
				u1.setFname(rs.getString(2));
				u1.setLname(rs.getString(3));
				u1.setUname(rs.getString(4));
				u1.setPass(rs.getString(5));
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return u1;
	}
	public int dodeletedata(int uid) 
	{		
		int x=0;
		try 
		{
			PreparedStatement pst=cn.prepareStatement("delete from user where uid=?");
			pst.setInt(1, uid);
			x=pst.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return x;
	}
	public int doupdatedata(model model) 
	{
		int x=0;
		try 
		{
			PreparedStatement pst=cn.prepareStatement("update user set fname=?,lname=?,uname=?,pass=? where uid=?");
			pst.setString(1, model.getFname());
			pst.setString(2, model.getLname());
			pst.setString(3, model.getUname());
			pst.setString(4, model.getPass());
			pst.setInt(5, model.getUid());
			x=pst.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return x;
	}
	public List<model> getalldata() 
	{
		List<model> lists = null;
		model mod = null;
		try 
		{
			lists=new ArrayList<model>();
			PreparedStatement pst = cn.prepareStatement("select * from user");
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				mod = new model();
				mod.setUid(rs.getInt(1));
				mod.setFname(rs.getString(2));
				mod.setLname(rs.getString(3));
				mod.setUname(rs.getString(4));
				mod.setPass(rs.getString(5));
				lists.add(mod);
			}		
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return lists;
	}
}
