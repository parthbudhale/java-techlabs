package com.aurionpro.array;

import java.util.Scanner;

public class LargestElementArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number of elements");
		int n=scanner.nextInt();
		int[]array=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++) {
			array[i]=scanner.nextInt();
		}
		int max=array[0];
		for(int i=1;i<n;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		
		System.out.println("largest element" +max);
	}

}
