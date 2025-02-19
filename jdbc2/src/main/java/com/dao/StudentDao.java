package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Student1;

public class StudentDao {
	
	public int insertStudent(Student1 s)
	{
		int check=0;
		Connection con=null;
		PreparedStatement pst=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jap70","root","yogesh@22");
			String sql="insert into student1(name,city,percetnage)values(?,?,?)";
			pst=con.prepareStatement(sql);
			pst.setString(1, s.getName());
			pst.setString(2, s.getCity());
			pst.setDouble(3, s.getPercentage());
			check=pst.executeUpdate();	
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally{
			
				try {
					pst.close();
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}	
		}
		return check;	
	}
	
	public int deleteStudentById(int id)
	{
		int check=0;
		Connection con=null;
		PreparedStatement pst=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jap70","root","yogesh@22");
			String sql="delete from student where id=?";
			pst=con.prepareStatement(sql);
			pst.setInt(1, id);
			check =pst.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return check;	
	}
	
	public Student1 findStudentByid(int id)
	{
		Student1 s=null;
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jap70","root","yogesh@22");
            String sql="select id,name,city,percetnage from student1 where id=?";
            pst=con.prepareStatement(sql);
            pst.setInt(1, id);
            rs=pst.executeQuery();
            while(rs.next())
            {
            	s=new Student1();
            	s.setId(rs.getInt("id"));
            	s.setName(rs.getString("Name"));
            	s.setCity(rs.getString("city"));
            	s.setPercentage(rs.getDouble("percetnage"));
            }
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pst.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return s;	
	}
	
	public List<Student1> findAllStudent()
	{
		List<Student1> list=new ArrayList();
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jap70","root","yogesh@22");
			String sql="select id,name,city,percetnage from student1";
			pst=con.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next())
			{
				Student1 s=new Student1();
				s.setId(rs.getInt("id"));
            	s.setName(rs.getString("Name"));
            	s.setCity(rs.getString("city"));
            	s.setPercentage(rs.getDouble("percetnage"));
            	list.add(s);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally
		{
			try {
				rs.close();
				pst.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
	
	public int updateStudent(Student1 s)
	{
		int check=0;
		Connection con=null;
		PreparedStatement pst=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jap70","root","yogesh@22");
			String sql="update Student1 set name=?,city=?,percetneage=? where id=?";
			pst=con.prepareStatement(sql);
			pst.setString(1, s.getName());
			pst.setString(2, s.getCity());
			pst.setDouble(3, s.getPercentage());
			pst.setInt(4, s.getId());
			check=pst.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pst.close();
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return check;
	}
}
