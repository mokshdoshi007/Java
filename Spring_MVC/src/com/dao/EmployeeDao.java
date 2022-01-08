package com.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.model.Employee;
import com.mysql.jdbc.ResultSet;

public class EmployeeDao {
	JdbcTemplate template;
	int x=0;
	public int save(Employee e1) {
		x=template.update("insert into employee(name,salary,designation) values('"+e1.getName()+"','"+e1.getSalary()+"','"+e1.getDesignation()+"')");
		return x;
	}
	public JdbcTemplate getTemplate() {
		return template;
	}
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	public List<Employee> getAllEmployees()
	{
		return template.query("select * from employee", new RowMapper<Employee>() {
			

			@Override
			public Employee mapRow(java.sql.ResultSet rs, int row) throws SQLException {
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getString(3));
				e.setDesignation(rs.getString(4));
				return e;
			}
		});
	}
}
