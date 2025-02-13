package com.aurionpro.Model;

import java.io.Serializable;

public class Student implements Serializable {
	public int id;
	public String Firstname;
	public String LastName;
	public double grade;
	
	public Student(int id,String fname,String lname,double grade)
	{
		this.id=id;
		this.Firstname=fname;
		this.LastName=lname;
		this.grade=grade;
		
	}
	
	

}
