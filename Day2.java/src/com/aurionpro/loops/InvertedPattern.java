package com.aurionpro.loops;
import java.util.*;
public class InvertedPattern {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a number");
		int rows=scanner.nextInt();
		for(int i=0;i<rows;i++)
		{
			for(int j=5;j>i;j--) {
				System.out.print("*");
		}
			System.out.println();
		
	}
	

	}
}
