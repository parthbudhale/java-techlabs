package com.aurionpro.array;

import java.util.*;

public class StudentsMarks {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter the size : ");
		int size = scanner.nextInt(); //input array size
		System.out.print("enter marks : ");
		int[] marks = new int[size]; // input mark array
		for (int i = 0; i < size; i++) {
			marks[i] = scanner.nextInt();
		}
		int minimummarks = marks[0];
		int maxmarks = marks[0];
		int sum = 0;
		for (int i = 0; i < size; i++) {

			if (minimummarks > marks[i]) { // //Checks if the current mark is smaller than minimummarks
				minimummarks = marks[i];

			}

			if (maxmarks < marks[i]) {
				maxmarks = marks[i];

			}
			sum += marks[i];
		}

		System.out.println("the minimum marks are " + minimummarks);

		System.out.println("the maximum marks are: " + maxmarks);

		double average = sum / size;
		System.out.println("Average score" + average);

	}

}
