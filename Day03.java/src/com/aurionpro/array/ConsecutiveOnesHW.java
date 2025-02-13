package com.aurionpro.array;

import java.util.Scanner;

public class ConsecutiveOnesHW {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //Creates a Scanner object to read user input
		System.out.println("enter  the number of elements:");
		int n = scanner.nextInt(); //user input
		int[] number = new int[n]; //declare array
		System.out.println("Enter the elements of array : "); 
		for (int i = 0; i < n; i++) {
			number[i] = scanner.nextInt();
		}
		int maxConsec = 0, currentCount = 0;  //Finding Maximum Consecutive 1s
		for (int i = 0; i < n; i++) {
			if (number[i] == 1) {    //If the current element is 1, increment currentCount
				currentCount++;
				if (currentCount > maxConsec) {  //Updates maxConsec if currentCount is greater
					maxConsec = currentCount;
				}
			} else {
				currentCount = 0; //If the element is not 1, reset currentCount to 0
			}
		}
		System.out.println("max counts:" + maxConsec);

	}

}
                        

