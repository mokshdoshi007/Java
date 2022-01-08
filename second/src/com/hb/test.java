package com.hb;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class test 
{
	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory fact=cfg.buildSessionFactory();
		Session session=fact.openSession();
		Transaction tx=session.beginTransaction();
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter value");
		int no=sc.nextInt();
		for(int i=1;i<=no;i++)
		{
			Employee e1=new Employee();
			System.out.println("enter emp_id");
			e1.setEmp_id(sc.nextInt());
			System.out.println("enter emp_name");
			e1.setEmp_name(sc1.nextLine());
			System.out.println("enter dept");
			e1.setDept(sc1.nextLine());
			System.out.println("enter salary");
			e1.setSalary(sc.nextInt());
			session.save(e1);
		}
		tx.commit();
		session.close();		
	}
}
