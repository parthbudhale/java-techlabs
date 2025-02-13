package com.aurionproTest;
import com.aurionproModel.*;

public class StudentTest {

	public static void main(String[] args) {
		StudentModel student1 = new StudentModel("parth",2,9.5);
		student1.displayDetails();
		System.out.println(student1.getNumberofstudents());
		
		StudentModel student2 = new StudentModel("om",2,9.5);
		student2.displayDetails();
		System.out.println(student2.getNumberofstudents());
		
		
		StudentModel student3 = new StudentModel("Adit",2,9.5);
		student3.displayDetails();
		System.out.println(student3.getNumberofstudents());
		
		StudentModel student4 = new StudentModel("Rohit",2,9.5);
		student4.displayDetails();
		System.out.println(student4.getNumberofstudents());
		
	
	}
}
