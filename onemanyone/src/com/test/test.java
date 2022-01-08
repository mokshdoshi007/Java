package com.test;

import com.dao.dao;
import com.model.Department;
import com.model.Employee;

public class test 
{
	public static void main(String[] args) 
	{
		dao d = new dao();
		Department d1 = new Department();
		d1.setDname("IT");
		d1.setDeg("Manager");
		d.insertDepartment(d1);
		
		Employee e1 = new Employee();
		e1.setEname("Moksh");
		e1.setCity("Abad");
		e1.setDept(d1);
		d.insertEmployee(e1);
		
		Employee e2 = new Employee();
		e2.setEname("Nidhi");
		e2.setCity("Abad2");
		e2.setDept(d1);
		d.insertEmployee(e2);
	}
}