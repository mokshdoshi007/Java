package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.model.UserModel;

public class HomeDao 
{
	Connection cn=null;
	int x=0;
	public HomeDao(Connection cn) 
	{
		this.cn=cn;
	}
	public UserModel getShowData(int uid)
	{
		UserModel user1=null;
		try 
		{
			PreparedStatement st=cn.prepareStatement("select * from user where uid=?");
			st.setInt(1, uid);
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
	public int doUpdateData(UserModel model)
	{
		try 
		{
			PreparedStatement st=cn.prepareStatement("update user set fname=?,lname=?,uname=?,pass=? where uid=?");
			st.setString(1, model.getFname());
			st.setString(2, model.getLname());
			st.setString(3, model.getUname());
			st.setString(4, model.getPass());
			st.setInt(5, model.getUid());
			x=st.executeUpdate();
			//cn.close();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}
	public int doDeleteData(int uid)
	{
		try 
		{
			PreparedStatement st=cn.prepareStatement("delete from user where uid=?");
			st.setInt(1, uid);
			x=st.executeUpdate();
			//cn.close();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}
}