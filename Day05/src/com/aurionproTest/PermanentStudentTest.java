package com.aurionproTest;

import com.aurionproModel.PermanentStudent; //import

public class PermanentStudentTest {
	public static void main(String[] args) {
		PermanentStudent student1 = new PermanentStudent(101,"Parth",75,80,90);  //object creation and variable assign
		System.out.println("Student id :"+student1.getStudentId());
		System.out.println("Student name :"+student1.getName());
		System.out.println("marks in maths :"+student1.getmathMarks());
		System.out.println("marks in Science :"+student1.getSciencemarks());
		System.out.println("marks in English :"+student1.getEnglishMarks());
		System.out.println("Total marks score:"+student1.CalculateTotalMarks());
		System.out.println("Grade:"+student1.getGrade());
		System.out.println("percentage:"+student1.CalculatePercentage());
		
		
		
		
	}

}
