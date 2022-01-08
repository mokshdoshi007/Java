package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.EmployeeDao;
import com.model.Employee;

@Controller
public class EmployeeController 
{
@Autowired
EmployeeDao dao;
@RequestMapping("/addemployee")
public String addemployee(Model m)
{
	m.addAttribute("command", new Employee());
	return "addemployee";
	}
@RequestMapping(value="/save", method=RequestMethod.POST)
public String save(@ModelAttribute ("emp")Employee emp)
{
	int x=dao.save(emp);
	if(x>0)
		System.out.println("Record Inserted");
	else
		System.out.println("Record Not Inserted");
	return "redirect:/viewemployee";
}
@RequestMapping("/viewemployee")
public String viewemployee(Model m)
{
	List<Employee> lists = dao.getAllEmployees();
	m.addAttribute("lists", lists);
	return "viewemployee";
}
}