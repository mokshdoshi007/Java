package com.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Subject")
public class Subject {
private int subid;
private String duration,subname;
Collection<Student> student;
@Id
@GenericGenerator(name="increment", strategy="increment")
@GeneratedValue(generator="increment")
public int getSubid() {
	return subid;
}
public void setSubid(int subid) {
	this.subid = subid;
}
public String getDuration() {
	return duration;
}
public void setDuration(String duration) {
	this.duration = duration;
}
public String getSubname() {
	return subname;
}
public void setSubname(String subname) {
	this.subname = subname;
}
@ManyToMany(mappedBy = "subject")

public Collection<Student> getStudent() {
	return student;
}
public void setStudent(Collection<Student> student) {
	this.student = student;
}

}
