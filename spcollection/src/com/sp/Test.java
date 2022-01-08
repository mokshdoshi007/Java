package com.sp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) {
		
	
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	Customer c1 = (Customer)context.getBean("c1");
	System.out.println("list is "+c1.getLists());
	System.out.println("\nset is  "+c1.getSets());
	}
}
