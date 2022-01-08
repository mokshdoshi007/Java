package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Department;
import com.model.Employee;
import com.util.util;

public class dao {
	Session session = null;
	Transaction tx = null;
	public void insertEmployee(Employee e) 
	{
		session = new util().getSessionData();
		tx = session.beginTransaction();
		session.save(e);
		tx.commit();
		session.close();
		System.out.println("Employee Record Inserted");
	}
	public void insertDepartment(Department d1) 
	{
		session = new util().getSessionData();
		tx = session.beginTransaction();
		session.save(d1);
		tx.commit();
		session.close();
		System.out.println("Department Record Inserted");
	}
}
