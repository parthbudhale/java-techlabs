package com.aurionpro;

public class calculator {
	public static double add(double num1, double num2) {
		return num1 + num2;
	}

	public static double subtract(double num1, double num2) {
		return num1 - num2;

	}

	public static double product(double num1, double num2) {
		return num1 * num2;

	}

	public static double divide(double num1, double num2) {
		return num1 % num2;

	}

	public static void main(String[] args) {
		double number1 = 20;
		double number2 = 5;

		System.out.println("sum of number1 and number2 is " + add(number1, number2));
		System.out.println("subtraction of number1 and number2 is " + subtract(number1, number2));
		System.out.println("product of number1 and number2 is " + product(number1, number2));
		System.out.println("divide of number1 and number2 is " + divide(number1, number2));

	}

}
