package com.sp;

public class Student 
{
	int sno;
	String sname,city;
	public Student()
	{
		System.out.println("Default Constructor");
	}
	public Student(int sno, String sname, String city)
	{
		System.out.println("Parameterised Constructor");
		this.sno=sno;
		this.sname=sname;
		this.city=city;
	}
	public void show()
	{
		System.out.println("sno is "+sno);
		System.out.println("sname is "+sname);
		System.out.println("city is "+city);
	}
}
