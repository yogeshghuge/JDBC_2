package com.demo;

import java.util.List;

import com.dao.StudentDao;
import com.model.Student1;

public class App 
{
    public static void main( String[] args )
    {
    	StudentDao sd=new StudentDao();
    	/*Student1 s1=new Student1(); //insert student
    	s1.setName("Nayan");
    	s1.setCity("JadGav");
    	s1.setPercentage(72.76);
    	System.out.println(sd.insertStudent(s1));*/
    	
    	//System.out.println(sd.deleteStudentById(1));
    	
    	/*Student1 s1=sd.findStudentByid(9);
    	System.out.println(s1);*/
    	
    	/*List<Student1> list=sd.findAllStudent(); //list of multiple student
    	for(Student1 s:list)
    		System.out.println(s);*/
    	
    	Student1 s1=sd.findStudentByid(6);
    	s1.setName("jatin");
    	System.out.println(sd.updateStudent(s1));
    	
    }
}
