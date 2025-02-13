package com.aurionproTest;

import java.util.*;

import com.aurionproModel.StudentModel;

public class StudentTestArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Number of Students: ");
		int numberofstudents = scanner.nextInt();
		scanner.nextLine();
		StudentModel[] students = new StudentModel[numberofstudents];
		for (int i = 0; i < numberofstudents; i++) {
			System.out.println("Enter details of Students " + (i + 1) + ":");

			System.out.println("Student name:");
			String name = scanner.nextLine();

			System.out.println("Roll Number");
			int RollNumber = scanner.nextInt();

			System.out.println("percentage");
			double Percentage = scanner.nextDouble();
			scanner.nextLine();

			students[i] = new StudentModel(name, RollNumber, Percentage);
		}
		for (int i = 0; i < numberofstudents; i++) {
			for (int j = 0; j < numberofstudents - 1 - i; j++) {
				if (students[j].calculateTotalMarks() > students[j + 1].calculateTotalMarks()) {
					StudentModel temp = students[j];
					students[j] = students[j + 1];
					students[j + 1] = temp;
				}
			}
		}

		for (StudentModel student : students) {
			student.displayDetails();

		}

	}

}
