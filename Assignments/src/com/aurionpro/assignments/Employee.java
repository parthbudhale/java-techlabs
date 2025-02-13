package com.aurionpro.assignments;

public class Employee {
	private int employeeId;
	private String name;
	private double salary;
	private double bonusPercentage;

	public Employee() {

		employeeId = 0;
		name = "unknown";
		salary = 0.0;
		bonusPercentage = 0;
	}

	public Employee(int employeeId, String name, double salary, double bonusPercentage) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.bonusPercentage = bonusPercentage;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

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

	public double getBonusPercentage() {
		return bonusPercentage;
	}

	public void setBonusPercentage(double bonusPercentage) {
		this.bonusPercentage = bonusPercentage;
	}

	public double calculateSalary() {
		return salary * (bonusPercentage / 100);
	}

	public void printdetails() {
		System.out.println("Name: " + name);
		System.out.println("Id: " + employeeId);
		System.out.println("Salary: " + salary);
		System.out.println("Salary after bonus: " + (bonusPercentage + salary));  //method
	}
}
