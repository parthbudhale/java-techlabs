package com.SRP.violation.model;

public class Employee {
	private String name;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double calculateBonus()
	{
		double amount = salary *0.10;
		System.out.println("Bonus amount is"+amount);
		return amount;
	}
	
	public void addtodatabase()
	{
		System.out.println("added to database");
	}

}
