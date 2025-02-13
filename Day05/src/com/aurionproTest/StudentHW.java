package com.aurionproTest;
import java.util.*;

import com.aurionproModel.StudentDetails;

public class StudentHW {
	


		 public static void main(String[] args) {
		      
	        StudentDetails student1 = new StudentDetails();
//
//	        
//	        student1.setName("parth");
//	        student1.setrollNo(01);
//	        System.out.println("name of student :" +student1.getName());
//	        System.out.println("rollNo :" +student1.getrollNo());
//	        System.out.println();
	       
//	        student1.name = "Parth";
//	        student1.rollNo = 101;
//	        student1.marks = 85.5;
   
	        StudentDetails student2 = new StudentDetails("parth",4,55);   //constructor
//	        student1.displayDetails();

	        StudentDetails student3 = new StudentDetails(student2);   //constructor
            student3.displayDetails();
	        
	    }
	}




