package com.aurionpro.loops;

import java.util.*;

public class BillChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Height");
		int height = scanner.nextInt();
		if (height <= 120) {
			System.out.println("can't ride");
			return;
		} else {
			System.out.println("can ride");
		}
		System.out.println("enter your age");
		int age = scanner.nextInt();
		int totalBill = 0;

		if (age < 12) {
			totalBill += 5;
		}
		if (age >= 12 && age <= 18) {
			totalBill += 7;
		}

		if (age > 18) {
			if (age >= 45 && age <= 55) {
				totalBill += 0;
			} else {
				totalBill += 12;
			}
		}

		System.out.println("Want Photos? (yes/no)");
		String wantphotos = scanner.next();
		if (wantphotos.equalsIgnoreCase("yes")) {
			totalBill += 3;

		}
		System.out.println("The total Bill is " + totalBill);

	}

}
