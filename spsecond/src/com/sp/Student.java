package com.sp;

public class Student 
{
	private int sid;
	private String sname,address,city,state,degree;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public void display()
	{
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(degree);
		System.out.println(address);
		System.out.println(city);
		System.out.println(state);
	}
}
