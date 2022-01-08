package com.sp;

public class Person {
int pid;
String pname,city,mob;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getMob() {
	return mob;
}
public void setMob(String mob) {
	this.mob = mob;
}
@Override
	public String toString() {
		return "person[pid="+pid+", pname="+pname+", city="+city+"]";
	}
}
