package com.sp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	Message m1 = (Message)context.getBean("m1");
	m1.setMsg("Hello Moksh");
	System.out.println("Message is "+m1.getMsg());
	
	Message m2 = (Message)context.getBean("m1");
	m2.setMsg("Hello Tops");
	System.out.println("Message is "+m2.getMsg());
}
}
