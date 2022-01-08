package com.sp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Message m1 = (Message)context.getBean("m1");
		System.out.println("Message is "+m1.getMsg());
		context.registerShutdownHook();
	}
}
