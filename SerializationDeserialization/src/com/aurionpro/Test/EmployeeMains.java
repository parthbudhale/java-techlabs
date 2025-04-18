package com.aurionpro.Test;

import java.util.Scanner;

import com.aurionpro.Model.Employee1;
import com.aurionpro.Model.FullTimeEmployee;
import com.aurionpro.Model.PartTimeEmployee;

public class EmployeeMains {
	public static void main(String[] args) throws InValidSalaryException {
		System.out.println("Enter number of employees: ");
		Scanner scanner = new Scanner(System.in);
		int noOfEmployees = scanner.nextInt();
		Employee1[] emps = new Employee1[noOfEmployees];

		for (int i = 0; i < emps.length; i++) {

			boolean flag = false;
			System.out.println("Enter employee id:");
			int id = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter employee name:");
			String name = scanner.nextLine();
			System.out.println("Enter base salary:");
			double salary = scanner.nextDouble();
			scanner.nextLine();
			if(!checkSalary(salary))
			{
				System.out.println("Salary cannot be negative");
			}
			else
			{
			while (true) {
				boolean check = false;
				System.out.println("Employee is: ");
				System.out.println("1.PartialEmpoyee");
				System.out.println("2.FullTimeEmpoyee");
				int choice = scanner.nextInt();

				if (choice == 1) {
					System.out.println("Enter hours worked:");
					double hours = scanner.nextDouble();
					Employee1 e = new PartTimeEmployee(name, id, salary,hours);
					double totalsalary=e.calculateSalary(hours);
					e.baseSalary=totalsalary;
					emps[i]=e;
					System.out.println("Partial Employee Added Successfully");
					check = true;
					flag = true;
				} else if (choice == 2) {
					System.out.println("Enter bonus amount:");
					double bonus = scanner.nextDouble();
					Employee1 e2 = new FullTimeEmployee(name, id, salary,bonus);
					double totalsalary = e2.calculateSalary(bonus);
					e2.baseSalary=totalsalary;
					emps[i]=e2;
					System.out.println("Full Time Employee Added Successfully");
					check = true;
					flag = true;
				} else {
					System.out.println("Please enter 1 for Partial Employee");
					System.out.println("Please enter 2 for Fulltime Employee");
				}
				if (check) {
					break;
				}
			}
		}
			
		}

		for (Employee1 e : emps) {
			System.out.println(e.toString());
		}
			
	}
	public static boolean checkSalary(double salary) throws InValidSalaryException
	{
		if(salary<=0) 
			{
			throw new  InValidSalaryException("Salary cannot be negative Or Zero");
			}
		return true;
	}

}



