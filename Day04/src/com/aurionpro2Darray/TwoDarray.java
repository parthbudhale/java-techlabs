package com.aurionpro2Darray;
import java.util.*;

public class TwoDarray {

	 public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("Enter array size");
	  int row=scanner.nextInt();
	  int column=scanner.nextInt();
	  int[][] numbers = new int[row][column];
	  System.out.println("Enter the value for array ");
	  for(int i=0;i<row;i++)
	  {
	   System.out.println("Enter the "+i+" row value");
	   for(int j=0;j<column;j++)
	   {
	    numbers[i][j]=scanner.nextInt();
	   }
	  }
	  for(int i=0;i<numbers.length;i++)
	  {
	   System.out.println();
	   for(int j=0;j<numbers.length;j++)
	   {
	    System.out.print(numbers[i][j]+" ");
	   }
	  }
	 }

	}
		
			
		
