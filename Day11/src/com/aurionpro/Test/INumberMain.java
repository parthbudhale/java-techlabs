package com.aurionpro.Test;

import com.aurionpro.Model.Numbers;
import java.util.Scanner;

public class INumberMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Numbers number = new Numbers();

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter Third number: ");
        int num3 = scanner.nextInt();
        
        System.out.print("Enter Fourth number: ");
        int num4 = scanner.nextInt();
        
//        number.Max=10;
        
        
        number.display();
        System.out.println("Addition of Numbers: " + number.add(num1, num2));
        System.out.println("Subtraction of Numbers: " + number.subtract(num1, num2));
        System.out.println("Multiplication of Numbers: " + number.multiplication(num3, num4));
        System.out.println("Divide of Numbers: " + number.Divide(num3, num4));

        scanner.close();
    }
}
