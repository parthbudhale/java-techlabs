package com.aurionproTest;

import java.util.Scanner;


	class Person {
		String name;
		int age;

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public void displayPerson() {
			System.out.println("Name: " + name + ", Age: " + age);
		}
	}

	class Employee extends Person {
		int employeeId;
		double salary;

		public Employee(String name, int age, int employeeId, double salary) {
			super(name, age);
			this.employeeId = employeeId;
			this.salary = salary;
		}

		public void displayEmployee() {
			displayPerson();
			System.out.println("Employee ID: " + employeeId + ", Salary: " + salary);
		}
	}

	class Manager extends Employee {
		String departmentName;

		public Manager(String name, int age, int employeeId, double salary, String departmentName) {
			super(name, age, employeeId, salary);
			this.departmentName = departmentName;
		}

		public void displayManager() {
			displayEmployee();
			System.out.println("Department: " + departmentName);
		}

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			System.out.print("Enter Name: ");
			String name = scanner.nextLine();

			System.out.print("Enter Age: ");
			int age = scanner.nextInt();

			System.out.print("Enter Employee ID: ");
			int employeeId = scanner.nextInt();

			System.out.print("Enter Salary: ");
			double salary = scanner.nextDouble();
			scanner.nextLine();

			System.out.print("Enter Department Name: ");
			String departmentName = scanner.nextLine();

			Manager mgr = new Manager(name, age, employeeId, salary, departmentName);

			System.out.println("Manager Details");
			mgr.displayManager();

				}
	}


