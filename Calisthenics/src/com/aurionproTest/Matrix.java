package com.aurionproTest;

import java.util.Scanner;

public class Matrix {
	private static final int size = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] matrix = new int[3][3];

		System.out.println("Enter a 3x3 matrix:");
		readMatrix(matrix, scanner);
		displayMatrix(matrix);
	}

	private static void readMatrix(int[][] matrix, Scanner scanner) {
		for (int rows = 0; rows < size; 	rows++) {
			readRow(matrix, scanner, rows);
		}
	}

	private static void readRow(int[][] matrix, Scanner scanner, int row) {
		for (int col = 0; col < size; col++) {
			System.out.print("Enter element [" + (row + 1) + "][" + (col + 1) + "]: ");
			matrix[row][col] = scanner.nextInt();
		}
	}

	private static void displayMatrix(int[][] matrix) {
		System.out.println("Matrix:");
		for (int[] row : matrix) {
			for (int value : row) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}
}
