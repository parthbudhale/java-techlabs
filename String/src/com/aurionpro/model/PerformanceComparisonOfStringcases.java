package com.aurionpro.model;

public class PerformanceComparisonOfStringcases {
	public static void main(String[] args) {
		long StartTime,StopTime;
		int i;
		StartTime =System.nanoTime();
		String name = "java is best";
		for(i =0;i<1000;i++)
		{
			name += "with python";
		}
		StopTime =System.nanoTime();
	    System.out.println("String time taken:"+(StopTime - StartTime));

		
		
	}
	

}
