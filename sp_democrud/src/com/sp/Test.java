package com.sp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) 
{

	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	StudentImpl student = (StudentImpl)context.getBean("student");
	
	Student s1 = new Student();
	
	s1.setId(123);
	s1.setName("Moksh");
	s1.setCity("Ahmedabad");
	
	int x=student.insertData(s1);
	
	if(x>0)
		System.out.println("Record Inserted");
	else
		System.out.println("Record not Inserted");
}
}
