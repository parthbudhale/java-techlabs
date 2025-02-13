package com.aurionpro2Darray;

import java.util.*;

public class MatrixMultiplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int rowsA = getInput("Enter the number of rows for Matrix A: ");
		int columnsA = getInput("Enter the number of columns for Matrix A: ");

		// Input: Matrix B dimensions
		int rowsB = getInput("Enter the number of rows for Matrix B: ");
		int columnsB = getInput("Enter the number of columns for Matrix B: ");

		// Check if multiplication is possible
		if (columnsA != rowsB) {
			System.out.println(
					"Matrix multiplication is not possible. The number of columns in A must be equal to the number of rows in B.");
			return;
		}

		// Initialize matrices
		int[][] matrixA = new int[rowsA][columnsA];
		int[][] matrixB = new int[rowsB][columnsB];

		// Input matrices
		System.out.println("Enter elements for Matrix A:");
		inputMatrix(matrixA, rowsA, columnsA, scanner);

		System.out.println("Enter elements for Matrix B:");
		inputMatrix(matrixB, rowsB, columnsB, scanner);

		// Perform matrix multiplication
		int[][] resultMatrix = multiplyMatrices(matrixA, matrixB, rowsA, columnsB, columnsA);

		// Display the result
		System.out.println("\nResult of Matrix A * Matrix B:");
		printMatrix(resultMatrix, rowsA, columnsA);

		scanner.close();
	}

	// Method to get input from the user
	private static int getInput(String prompt) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(prompt);
		return scanner.nextInt();
	}

	// Method to input matrix elements
	private static void inputMatrix(int[][] matrix, int rows, int columns, Scanner scanner) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print("Enter element [" + (i + 1) + "][" + (j + 1) + "]: ");
				matrix[i][j] = scanner.nextInt();
			}
		}
	}

	// Method to multiply two matrices
	private static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB, int rowsA, int columnsB, int commonDim) {
		int[][] resultMatrix = new int[rowsA][columnsB];

		for (int i = 0; i < rowsA; i++) {
			for (int j = 0; j < columnsB; j++) {
				resultMatrix[i][j] = 0;
				for (int k = 0; k < commonDim; k++) {
					resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
				}
			}
		}
		return resultMatrix;
	}

	// Method to print the matrix
	private static void printMatrix(int[][] matrix, int rows, int columns) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
