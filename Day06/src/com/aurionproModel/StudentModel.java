package com.aurionproModel;


public class StudentModel {
	private String name;
	private int rollNo;
	private double marks;
	private static int numberofstudents;
    
    
    public StudentModel()
    {
   	 System.out.println("default constructor");
   	 this.name=null;
	     this.rollNo=0;
	     this.marks=0.0;
   	 //constructor
    }
    public StudentModel(String name,int rollNo,double marks) {
    this.name=name;
    this.rollNo=rollNo;
    this.marks=marks;
    numberofstudents++;//constructor
    
    }
    public StudentModel(StudentModel others) {
	     this.name=others.name;
	     this.rollNo=others.rollNo;
	     this.marks=others.marks;    // copy constructor others.
	     
	     }
    
    
    
    
    public void  setName( String name) {
   	 this.name = name;
    }
    public void  setrollNo( int rollno) {
   	 this.rollNo = rollno;
    }
    public void  setmarks( double marks) {
   	 this.marks = marks;
    }
    public String getName()
    {
   	 return name;
    }
    public int getrollNo() {
   	 return rollNo;
    }
    public double getmarks() {
   	 return marks;
    }
    public double calculateTotalMarks()
    {
    	return mathMarks+Sciencemarks+Englishmarks
    }
    
    

   public void displayDetails() {
       System.out.println("Student Name: " + name);
       System.out.println("Roll Number: " + rollNo);
       System.out.println("Marks: " + marks);
   }
public static int getNumberofstudents() {
	return numberofstudents;
}

}



