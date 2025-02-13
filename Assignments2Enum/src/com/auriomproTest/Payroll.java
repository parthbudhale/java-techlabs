package com.auriomproTest;

import com.auriomproModel.Employee;
import com.auriomproModel.Employee.Roles;

public class Payroll {
    private Employee[] employees;
    private int count;

    // Constructor to initialize array size
    public Payroll(int size) {
        employees = new Employee[size];
        count = 0;
    }

    // Method to add an employee
    public void addEmployee(Employee emp) {
        if (count < employees.length) {
            employees[count++] = emp;
        } else {
            System.out.println("Payroll is full. Cannot add more employees.");
        }
    }

    // Method to display all employees
    public void displayEmployees() {
        if (count == 0) {
            System.out.println("No employees in the system.");
            return;
        }
        for (int i = 0; i < count; i++) {
            employees[i].displayEmployee();
        }
    }

    // Method to search employees by role
    public void searchByRole(Roles role) {
        boolean found = false;
        System.out.println("Employees with role " + role + ":");
        for (int i = 0; i < count; i++) {
            if (employees[i].getRole() == role) {
                employees[i].displayEmployee();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found with role: " + role);
        }
    }
}