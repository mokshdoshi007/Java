package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.UserModel;
import com.util.util;

public class RegistrationDao {
	Session session=null;
	Transaction tx=null;
	String msg="";
	public String doRegister(UserModel rmodel) {
		try {
			session = new util().getSessionData();
			tx=session.beginTransaction();
			session.save(rmodel);
			tx.commit();
			session.close();
			msg="Record Inserted";
		}
		catch(Exception e)
		{
			msg="error";
			e.printStackTrace();
		}
		return msg;
	}

}
