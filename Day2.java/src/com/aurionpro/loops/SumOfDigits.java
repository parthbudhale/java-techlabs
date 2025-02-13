package com.aurionpro.loops;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scanner.nextInt();
		int rem=0;
		while(number>0)
		{
			int sum=number%10;
			rem+=sum;
			number=number/10;
		}
		System.out.println("the sum of digits are " +rem);
	}

}
