package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.bean.bean;
import com.util.util;

public class dao 
{
	public static void insertdata(bean ob) 
	{
		try 
		{
			Connection conn=util.getconnection();
			String sql = "insert into student(name,age,gender) values (?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1,ob.getName());
			pst.setInt(2,ob.getAge());
			pst.setString(3,ob.getGender());
			pst.executeUpdate();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	public static List<bean> getAllStudent()
	{
		ArrayList<bean> list=new ArrayList<>();
		try
		{
			Connection conn=util.getconnection();
			String sql="select * from student";
			PreparedStatement pst=conn.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				bean s=new bean();
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setAge(rs.getInt("age"));
				s.setGender(rs.getString("gender"));
				list.add(s);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public static void deletedata(bean ob) {
		try 
		{
			Connection conn=util.getconnection();
			String sql = "delete from student where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1,ob.getId());
			pst.executeUpdate();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	public static void updatedata(bean ob) {
		try 
		{
			Connection conn=util.getconnection();
			String sql = "update student set name=?, age=?, gender=? where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1,ob.getName());
			pst.setInt(2,ob.getAge());
			pst.setString(3,ob.getGender());
			pst.setInt(4,ob.getId());
			pst.executeUpdate();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	public static bean getdatabyid (bean ob) 
	{
		bean s=new bean();
		try
		{
			Connection conn=util.getconnection();
			String sql="select * from student where id=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, ob.getId());
			ResultSet rs=pst.executeQuery();
			while (rs.next())
			{
			s.setId(rs.getInt("id"));
			s.setName(rs.getString("name"));
			s.setAge(rs.getInt("age"));
			s.setGender(rs.getString("gender"));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return s;	
	}
}
