package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Student;
import com.util.util;

public class dao {
	Session session = null;
	Transaction tx = null;
	public void insertstudent(Student s1) 
	{
		session = new util().getSessionData();
		tx = session.beginTransaction();
		session.save(s1);
		tx.commit();
		session.close();
		System.out.println("record inserted..");
	}

	public void updatestudent(Student s1) 
	{
		session = new util().getSessionData();
		tx = session.beginTransaction();
		session.update(s1);
		tx.commit();
		session.close();
		System.out.println("record updated..");
	}

	public void deletestudent(Student s1) 
	{
		session = new util().getSessionData();
		tx = session.beginTransaction();
		session.delete(s1);
		tx.commit();
		session.close();
		System.out.println("record updated..");
	}

}
