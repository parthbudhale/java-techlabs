package com.aurionpro.Model;

public class TryCatchException {
	public static void main(String[] args) {
        try {
            // Attempting to divide by zero
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero is not allowed.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }

}


