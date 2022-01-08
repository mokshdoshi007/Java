package com.sp;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class InetAddress implements MethodBeforeAdvice, AfterReturningAdvice, MethodInterceptor
{
	CustomerOwner custowner;

	public void setCustowner(CustomerOwner custowner) {
		this.custowner = custowner;
	}
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable
	{
		System.out.println("This is before method");
		custowner.loginmethod();
	}
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable 
	{
		System.out.println("This is after returning advice");
		custowner.logoutmethod();
	}
	@Override
	public Object invoke(MethodInvocation m) throws Throwable {
		System.out.println("Now Start Execution");
		m.proceed();
		System.out.println("Now Stop Execution");
		return null;
	}
	
}

