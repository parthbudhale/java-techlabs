package com.aurionproModel;

public class PermanentStudent {
	private int StudentId;
	private String name;
	private int mathMarks;
	private int Sciencemarks;
	private int EnglishMarks;
	

	public PermanentStudent() {
		System.out.println("default constructor");

	}

	public PermanentStudent(int StudentId, String name, int mathmarks, int Sciencemarks, int EnglishMarks) {
		this.StudentId = StudentId;
		this.name = name;
		this.mathMarks = mathmarks;
		this.Sciencemarks = Sciencemarks;
		this.EnglishMarks = EnglishMarks;
		
	}

	public void setStudentId(int StudentId) {
		this.StudentId = StudentId;
	}
	public int getStudentId() {
		return StudentId;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return  name;
	}

	public void setmathmarks(int mathmarks) {
		this.mathMarks = mathmarks;
	}
	public int getmathMarks() {
		return  mathMarks;
	}

	public void setSciencemarks(int Sciencemarks) {
		this.Sciencemarks = Sciencemarks;
	}
	public int getSciencemarks() {
		return  Sciencemarks;
	}

	public void setEnglishmarks(int EnglishMarks) {
		this.EnglishMarks = EnglishMarks;
	}
	public int getEnglishMarks() {
		return  EnglishMarks;
	}

	public int CalculateTotalMarks() {

		return mathMarks + Sciencemarks + EnglishMarks;

	}
	

	public double CalculatePercentage() {
		return mathMarks + Sciencemarks + EnglishMarks/3;
		
	}
	

	public String getGrade() {
		String grade;
		double percentage=(mathMarks + Sciencemarks + EnglishMarks)/3;
		if( percentage>85.0)
		{
			return grade="A";

		
	}
		else if(percentage>=70 && percentage<85.0 )
		{
			return grade="B";
		}
		else if(percentage>=60 && percentage <70)
		{
			return grade="C";
		}
		return "fail";
	}
	
}
