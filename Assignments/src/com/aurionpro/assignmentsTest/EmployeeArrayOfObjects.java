package com.aurionpro.assignmentsTest;

import java.util.Scanner;

import com.aurionpro.assignments.Employee;

public class EmployeeArrayOfObjects {
	public static void main(String[] args) {
		System.out.println("Enter number of employees:");
		Scanner scanner = new Scanner(System.in);
		int numberofemployees=scanner.nextInt();
		scanner.nextLine();
		Employee[] employees = new Employee[numberofemployees];
		
		for(int i=0;i<numberofemployees;i++)
		{
			System.out.println("Enter details for employee: "+(i+1)+";");
			System.out.println("Enter the employee Id:");
			int id=scanner.nextInt();
			scanner.nextLine();
			
			for(int j=0; j<numberofemployees;j++)
			{
				if(employees[j].getEmployeeId()==id) {
					System.out.println("Employee with this Id already Exsist");
					id=scanner.nextInt();
					j=-1;
					
				}
					
					
			}
			
			System.out.println("Enter the employee name:");
			String name=scanner.nextLine();
			System.out.println("Enter the employee salary:");
			double salary=scanner.nextDouble();
			scanner.nextLine();
			System.out.println("Enter the employee bonus percentage:");
			double bonus=scanner.nextDouble();
			scanner.nextLine();
			
			employees[i] = new Employee(id,name,salary,bonus);
			employees[i].setName(name);
			employees[i].setEmployeeId(id);
			employees[i].setSalary(salary);
			employees[i].setBonusPercentage(employees[i].calculateSalary());
		}
		
		for(Employee emp:employees)
		{
			emp.printdetails();
			System.out.println();
		}
	}


	}


