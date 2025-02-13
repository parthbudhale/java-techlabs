package com.auriomproTest;
import java.util.Scanner;

import com.auriomproModel.Employee;
import com.auriomproModel.Roles;

public class PayrollObjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Payroll payroll = new Payroll(5); // Creating Payroll system with 5 slots

        // Adding employees dynamically
        payroll.addEmployee(new Employee(101, "Alice", 80000, Roles.MANAGER));
        payroll.addEmployee(new Employee(102, "Bob", 60000,  Roles.DEVELOPER));
        payroll.addEmployee(new Employee(103, "Charlie", 55000 ,Roles.DESIGNER));
        payroll.addEmployee(new Employee(104, "David", 50000, Roles.TESTER));
        payroll.addEmployee(new Employee(105, "Eve", 48000,Roles.HR));

        // Display all employees
        System.out.println("\nAll Employees and their Bonuses:");
        payroll.displayEmployees();

        // Search employees by role
        System.out.print("\nEnter Job Role to search (MANAGER, DEVELOPER, DESIGNER, TESTER, HR): ");
        String roleInput = scanner.next().toUpperCase();

        try {
            Roles role = Roles.valueOf(roleInput);
            payroll.searchByRole(role);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid role entered.");
        }

        scanner.close();
    }
}