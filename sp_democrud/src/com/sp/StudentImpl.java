package com.sp;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

public class StudentImpl {
	DataSource datasource;
	int x=0;
	public DataSource getDatasource() {
		return datasource;
	}
	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}
	public int insertData(Student student)
	{
		String sql = "insert into student values(?,?,?)";
	
	try
	{
		Connection cn = datasource.getConnection();
		PreparedStatement st = cn.prepareStatement(sql);
		st.setInt(1, student.getId());
		st.setString(2, student.getName());
		st.setString(3, student.getCity());
		x=st.executeUpdate();
		cn.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return x;
	
	}
}