package com.aurionpro.typecasting;
import java.util.*;
public class Typecast {
	public static void main(String[] args) {
		byte number1 = 46;
		short number2 =300;
		int number3=58;
		long number4=500;
		double number5=22;
		char ch ='A';
		int parth=ch;
		System.out.println(number1);
		System.out.println(number2 );
		System.out.println(number3);
		System.out.println(number4);
		System.out.println(number5);
		System.out.println(parth);
		
		
		
		int num1=100;
		byte num2=(byte)num1;
		char pa=(char)num1;
		System.out.println(pa);
		
		
		
		int number6=100;
		Integer object=number6;
		System.out.println(number6);
		System.out.println(object);
		
		Integer obj =56;
		int i =Integer.valueOf(obj);
		System.out.println(i);
		 
		//.toString method
		Integer number=80;
		String str =number.toString();
	    System.out.println(str);
		
		
		
		
		
		
	}

}
