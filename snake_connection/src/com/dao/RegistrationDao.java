package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.SQLException;
import com.model.UserModel;
//import com.util.DBConnection;

public class RegistrationDao 
{
	Connection cn=null;
	int x=0;
	public RegistrationDao(Connection cn)
	{
		this.cn=cn;
	}
	public int doRegisterData(UserModel umodel)
	{
		try 
		{
			PreparedStatement st=cn.prepareStatement("insert into user(fname,lname,uname,pass) values(?,?,?,?)");
			st.setString(1, umodel.getFname());
			st.setString(2, umodel.getLname());
			st.setString(3, umodel.getUname());
			st.setString(4, umodel.getPass());
			x=st.executeUpdate();
			//cn.close();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}
}
