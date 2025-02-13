package com.aurionpro.array;

import java.util.*;

public class SquareOfElements {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int size = scanner.nextInt();
		System.out.println("Enter the elements:");
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("squares of elements: ");
		for (int i = 0; i < size; i++) {
			int square = array[i] * array[i];
			System.out.print(square + " ");

		}

	}
}
