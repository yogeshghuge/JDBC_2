package com.demo;

import com.dao.EmployeeDao;
import com.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	EmployeeDao ed=new EmployeeDao();
    	/*Employee e=new Employee();
    	e.setEname("kunal sharma");
    	e.setEdesignation("Java developer");
    	e.setEcompany("Tcs");
    	e.setEsalary(42500);
    	System.out.println(ed.insertEmployee(e));*/
    	
    	/*System.out.println(ed.deleteEmployeeById(8));*/
    	
    	Employee e=ed.findEmployeeById(5);
    	System.out.println(e);
    	

    }
}
