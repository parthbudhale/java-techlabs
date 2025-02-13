package com.aurionpro.Test;

import com.aurionpro.Model.ExceptionPropagationDemo;

public class ExceptionPropogationTest {
	public static void main(String[] args) {
		ExceptionPropagationDemo demo = new ExceptionPropagationDemo();
		try {
			demo.method2();
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception occured");
		}
		finally
		{
			System.out.println("Program continues: ");
		}
		
		
	}

}
