package com.auriomproModel;

public class Employee {
	
	
	

	private int employeeId;
	private String name;
	private double salary;
	private Roles role;

	public Employee() {
		this.employeeId = 0;
		this.name = "unknown";
		this.salary = 0.0;
		this.role = Roles.NONE;
	}

	public Employee(int employeeId, String name, double salary, Roles role) {
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.role = role;
	}

	// Getters and Setters
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setRole(Roles role) {
		this.role = role;
	}

	public Roles getRole() {
		return this.role;
	}

	// Method to calculate bonus
	public double calculateBonus() {
		switch (role) {
		case MANAGER:
			return salary * 0.20;
		case DEVELOPER:
		case DESIGNER:
			return salary * 0.15;
		default:
			return salary * 0.10;
		}
	}

	public void displayEmployee() {
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Name: " + name);
		System.out.println("Role: " + role);
		System.out.println("Salary: $" + salary);
		System.out.println("Bonus: $" + calculateBonus());
		System.out.println("---------------------------");

	}
}