package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.UserModel;
import com.util.util;

public class HomeDao {
	Session session = null;
	Transaction tx = null;
	public UserModel getLogin(int uid)
	{
		session = new util().getSessionData();
		tx = session.beginTransaction();
		Query q = session.createQuery("from UserModel u where u.uid=:uid");
		q.setParameter("uid", uid);
		List<UserModel> lists = q.list();
		UserModel umodel = lists.get(0);
		tx.commit();
		session.close();
		return umodel;
	}
	public int deleteuser(int uid) 
	{
		int x=0;
		session = new util().getSessionData();
		tx = session.beginTransaction();
		Query q = session.createQuery("delete from UserModel u where u.uid=?");
		q.setParameter(0, uid);
		x=q.executeUpdate();
		tx.commit();
		session.close();
		return x;
	}
	public int updateuser(UserModel homemodel) 
	{
		int x=0;
		session = new util().getSessionData();
		tx = session.beginTransaction();
		Query q = session.createQuery("update UserModel u set u.fname=?, u.lname=?, u.username=?, u.password=? where u.uid=?");
		q.setString(0, homemodel.getFname());
		q.setString(1, homemodel.getLname());
		q.setString(2, homemodel.getUsername());
		q.setString(3, homemodel.getPassword());
		q.setInteger(4, homemodel.getUid());
		x=q.executeUpdate();
		tx.commit();
		session.close();
		return x;
	}
}
