package com.test;

import java.util.Collection;
import java.util.HashSet;

import com.dao.dao;
import com.model.Student;
import com.model.Subject;

public class test 
{
	public static void main(String[] args) 
	{
		dao d = new dao();
		Collection<Subject> subject = new HashSet<Subject>();
		Subject sb1 = new Subject();
		sb1.setSubname("Java");
		sb1.setDuration("5");
		d.insertSubject(sb1);
		Subject sb2 = new Subject();
		sb2.setSubname("Python");
		sb2.setDuration("4");
		d.insertSubject(sb2);
		subject.add(sb1);
		subject.add(sb2);
		Student s1 = new Student();
		s1.setSname("Moksh");
		s1.setCity("Abad");
		s1.setSubject(subject);
		d.insertStudent(s1);
		
		Student s2 = new Student();
		s2.setSname("Nidhi");
		s2.setCity("Abad2");
		s2.setSubject(subject);
		d.insertStudent(s2);
	}
}