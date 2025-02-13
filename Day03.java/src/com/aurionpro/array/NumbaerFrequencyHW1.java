package com.aurionpro.array;

import java.util.*;

public class NumbaerFrequencyHW1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // create scanner object
		System.out.print("Enter the size of array: ");
		int size = scanner.nextInt(); // size
		System.out.print("Enter the elements of array: ");
		int[] array = new int[size]; // Array input

		for (int i = 0; i < size; i++) { // elements of array input
			array[i] = scanner.nextInt(); // storing input values
		}
		System.out.println("number of count: ");
		int number = scanner.nextInt();

		
		int count = 0; // Variable to count occurrences of the given number
		for(int i=0;i < size;i++) {
			if(array[i]== number) {
				count ++;
			}
		}
		System.out.println(" The number " +number+ " appears " +count+ " times ");
		

	}

}
