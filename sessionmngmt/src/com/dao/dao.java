package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bean.bean;
import com.util.util;

public class dao
{

	public static void insertdata(bean ob) 
	{
		try 
		{
			Connection conn = util.getconnection();
			String sql = "insert into sessionmgt (name,mobile,email,password) values(?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, ob.getName());
			pst.setString(2, ob.getMobile());
			pst.setString(3, ob.getEmail());
			pst.setString(4, ob.getPassword());
			pst.executeUpdate();
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		

	}
	public static bean checkEmail(String email)
	{
		bean f=new bean();
		try {
		
			Connection conn=util.getconnection();
			String sql="select * from  sessionmgt where email=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
				f.setId(rs.getInt("id"));
				f.setEmail(rs.getString("email"));
				f.setName(rs.getString("name"));
				f.setMobile(rs.getString("mobile"));
			}
			else

			{
				f=null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
		
	}

	public static bean checklogin(bean ob) 
	{
		Connection conn = util.getconnection();
		String sql = "select * from sessionmgt where email=? and password=?";
		bean b = null;
		try 
		{
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, ob.getEmail());
			pst.setString(2, ob.getPassword());
			ResultSet rs = pst.executeQuery();
			if(rs.next())
			{
				b=new bean();
				b.setId(rs.getInt("id"));
				b.setName(rs.getString("name"));
				b.setMobile(rs.getString("mobile"));
				b.setEmail(rs.getString("email"));
				b.setPassword(rs.getString("password"));
			}
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return b;
	}
	public int resetPassword(bean f) {
		int r=0;
		try {
			Connection conn=util.getconnection();
			String sql="update  sessionmgt set password=? where id=?";
			PreparedStatement stmt=conn.prepareStatement(sql);
			stmt.setString(1, f.getPassword());
			stmt.setInt(2, f.getId());
			r=stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return r;

	}
}
