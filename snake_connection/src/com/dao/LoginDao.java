package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.model.UserModel;
//import com.util.DBConnection;

public class LoginDao 
{
	Connection cn=null;
	public LoginDao(Connection cn)
	{
		this.cn=cn;
	}
	public UserModel getLogin(UserModel lmodel)
	{
		UserModel user1=null;
		try 
		{
			PreparedStatement st=cn.prepareStatement("select * from user where uname=? and pass=?");
			st.setString(1, lmodel.getUname());
			st.setString(2, lmodel.getPass());
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				user1=new UserModel();
				user1.setUid(rs.getInt(1));
				user1.setFname(rs.getString(2));
				user1.setLname(rs.getString(3));
				user1.setUname(rs.getString(4));
				user1.setPass(rs.getString(5));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user1;
	}
}
