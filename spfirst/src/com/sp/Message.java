package com.sp;

public class Message 
{
	String msg;
	public String getMsg()
	{
		return msg;
	}
	public void setMsg(String msg)
	{
		this.msg=msg;
	}
	public void initialised()
	{
		System.out.println("Method Initialised");
	}
	public void destroyed()
	{
		System.out.println("Method Destroyed");
	}
}
