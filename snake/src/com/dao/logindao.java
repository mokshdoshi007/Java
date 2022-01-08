package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.model;

public class logindao {
	Connection cn=null;
	public logindao(Connection cn) {
		this.cn = cn;
	}

	public model getlogin(model l) 
	{
		model u1 = null;
		try
		{
			PreparedStatement pst = cn.prepareStatement("select * from user where uname=? and pass=?");
			pst.setString(1, l.getUname());
			pst.setString(2, l.getPass());
			ResultSet rs = pst.executeQuery();
			if(rs.next())
			{
				u1 = new model();
				u1.setUid(rs.getInt(1));
				u1.setFname(rs.getString(2));
				u1.setLname(rs.getString(3));
				u1.setUname(rs.getString(4));
				u1.setPass(rs.getString(5));
			}
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return u1;
	}

}
