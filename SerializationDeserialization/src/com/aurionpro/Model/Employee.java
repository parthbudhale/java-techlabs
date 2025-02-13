package com.aurionpro.Model;

import java.io.Serializable;

public class Employee implements Serializable{
	public String name;
	public int employeeid ;
	public double employeeSalary;
	
    public Employee(String name,int employeeid,double employeeSalary)
    {
    	this.name=name;
    	this.employeeid=employeeid;
    	this.employeeSalary=employeeSalary;
    	
    }

	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeid=" + employeeid + ", employeeSalary=" + employeeSalary + "]";
	}

}

