package com.test;

import java.util.Scanner;
import com.model.BonusCalculator;

public class BonusCalculatorAppMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BonusCalculator bonusCalculator = salary -> salary > 50000 ? salary * 0.15 : salary * 0.10;

        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        
        double bonus = bonusCalculator.CalculateSalary(salary);

        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);

        scanner.close();
    }
}
