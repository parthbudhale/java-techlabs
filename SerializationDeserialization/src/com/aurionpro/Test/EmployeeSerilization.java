package com.aurionpro.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.aurionpro.Model.Employee;

public class EmployeeSerilization {
    private static final String FILE_NAME = "C:\\Users\\parth.budhale\\Desktop\\Aurionpro_training\\employees.ser";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numberOfEmployees;
        while (true) {
            System.out.print("Enter number of employees: ");
            numberOfEmployees = sc.nextInt();
            if (numberOfEmployees > 0) {
                break;
            } else {
                System.out.println("Invalid input, try again.");
            }
        }

        Employee[] employees = new Employee[numberOfEmployees];

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 
            
            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();
            
            double salary;
            while (true) {
                System.out.print("Enter Employee Salary: ");
                salary = sc.nextDouble();
                if (salary > 0) {
                    break;
                } else {
                    System.out.println("Invalid salary, try again.");
                }
            }
            
            employees[i] = new Employee(name, id, salary);
        }

        serializeEmployees(employees);
        deserializeEmployees();

        sc.close();
    }

    private static void serializeEmployees(Employee[] employees) {
        try (FileOutputStream fos = new FileOutputStream(FILE_NAME);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            
            oos.writeObject(employees);
            System.out.println("Serialization successful!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserializeEmployees() {
        try (FileInputStream fis = new FileInputStream(FILE_NAME);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            
            Employee[] deserializedEmployees = (Employee[]) ois.readObject();
            System.out.println("\nDeserialization successful! Employee details:");

            for (Employee emp : deserializedEmployees) {
                System.out.println(emp);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}