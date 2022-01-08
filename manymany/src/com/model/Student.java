package com.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="Student")
public class Student {
	private int sid;
	private String sname,city;
	Collection<Subject> subject;
	
	@Id
	@GenericGenerator(name="increment", strategy="increment")
	@GeneratedValue(generator="increment")
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@ManyToMany
	@JoinTable (name="merge", joinColumns = @JoinColumn(name="subid"), inverseJoinColumns=@JoinColumn(name="sid"))
	public Collection<Subject> getSubject() {
		return subject;
	}
	public void setSubject(Collection<Subject> subject) {
		this.subject = subject;
	}
}
