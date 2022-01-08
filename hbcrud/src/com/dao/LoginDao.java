package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.UserModel;
import com.util.util;

public class LoginDao 
{
	Session session = null;
	Transaction tx = null;
	UserModel umodel=null;
	
	public UserModel getLogin(UserModel lmodel)
	{
		try 
		{
		session = new util().getSessionData();
		tx = session.beginTransaction();
		Query q = session.createQuery("from UserModel u where u.username=:username and u.password=:password");
		q.setParameter("username", lmodel.getUsername());
		q.setParameter("password", lmodel.getPassword());
		List<UserModel> lists = q.list();
		umodel = lists.get(0);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return umodel;
	}
}
