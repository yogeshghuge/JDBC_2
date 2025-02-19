package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.model.Employee;
import com.util.MyDatabase;

public class EmployeeDao {
	
	public int insertEmployee(Employee s)
	{
		int check=0;
		String sql="insert into Employee(ename,edesignation,ecompany,esalary)values(?,?,?,?)";
		try(Connection con=MyDatabase.myConnection();
				PreparedStatement pst=con.prepareStatement(sql);){
			pst.setString(1, s.getEname());
			pst.setString(2, s.getEdesignation());
			pst.setString(3, s.getEcompany());
			pst.setDouble(4, s.getEsalary());
			check=pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return check;
	}
	public int deleteEmployeeById(int id)
	{
		int check=0;
		String sql="delete from Employee where eid=?";
		try(Connection con=MyDatabase.myConnection();
				PreparedStatement pst=con.prepareStatement(sql);){
			pst.setInt(1, id);
			check=pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return check;
	}
	public Employee findEmployeeById(int id)
	{
		Employee e=null;
		String sql="select eid, ename,edesignation,ecompany,esalary from Employee where eid=?";
		try(Connection con=MyDatabase.myConnection();
				PreparedStatement pst=con.prepareStatement(sql);){
			pst.setInt(1, id);
			ResultSet rs=pst.executeQuery();
			List<Employee> list=MyDatabase.employeeRowMapper(rs);
			e=list.get(0);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return e;
	}
}
