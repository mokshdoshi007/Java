package com.test;

import com.dao.dao;
import com.model.Employee;
import com.model.ProfileDetails;

public class test 
{
	public static void main(String[] args) 
	{
		dao d = new dao();
		ProfileDetails p1 = new ProfileDetails();
		p1.setCity("Abad");
		p1.setState("Gujarat");
		d.insertProfile(p1);
		Employee e1 = new Employee();
		e1.setEname("Moksh");
		e1.setDept("IT");
		e1.setProfile(p1);
		d.insertEmployee(e1);
	}
}