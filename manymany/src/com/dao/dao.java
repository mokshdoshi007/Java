package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Student;
import com.model.Subject;
import com.util.util;

public class dao {
	Session session = null;
	Transaction tx = null;
	public void insertStudent(Student s1) 
	{
		session = new util().getSessionData();
		tx = session.beginTransaction();
		session.save(s1);
		tx.commit();
		session.close();
		System.out.println("Student Record Inserted");
	}
	public void insertSubject(Subject sb1) 
	{
		session = new util().getSessionData();
		tx = session.beginTransaction();
		session.save(sb1);
		tx.commit();
		session.close();
		System.out.println("Subject Record Inserted");
	}
}
