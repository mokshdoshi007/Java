package com.sp;

public class CustomerImpl implements Customer
{

	@Override
	public void browser() {
		System.out.println("This is targeted method in Spring AOP");
	}
	
}
