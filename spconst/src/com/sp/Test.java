package com.sp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
public static void main(String[] args) 
{
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	Student s2 = (Student)context.getBean("s2");
	Student s1 = (Student)context.getBean("s1");
	s1.show();
}
}
