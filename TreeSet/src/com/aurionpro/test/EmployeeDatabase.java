package com.aurionpro.test;
import com.aurionpro.model.*;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeDatabase {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Set<Employee> employees = new TreeSet<Employee>(); 
        
        employees.add(new Employee(101, "PARTH",200));
        employees.add(new Employee(102, "BobBY", 600));
        employees.add(new Employee(103, "yoyo", 4500));
        
        System.out.println("Employees sorted by salary (default):");
        for (Employee e : employees) {
            System.out.println(e);
        }
        
        System.out.println("Do you want to sort by name? (yes/no)");
        String choice = scanner.next();
        
        if (choice.equalsIgnoreCase("yes")) {
            TreeSet<Employee> nameSortedEmployees = new TreeSet<>(new NameComparator());
            nameSortedEmployees.addAll(employees);
            System.out.println("Employees sorted by name:");
            for (Employee e : nameSortedEmployees) {
                System.out.println(e);
            }
        }
        scanner.close();
    }
}


