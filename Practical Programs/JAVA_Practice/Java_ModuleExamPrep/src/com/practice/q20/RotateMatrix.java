package com.practice.q20;

/*
 * Q20.Write a program to rotate a matrix by 90 degrees clockwise. 
Input: 
1 2 3 
4 5 6 
7 8 9 
Output: 
7 4 1 
8 5 2 
9 6 3
 */
public class RotateMatrix {
	public static void rotate90Clockwise(int[][] matrix) {
		int n = matrix.length;

		// Step 1: Transpose the matrix
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		// Step 2: Reverse each row
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n / 2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][n - 1 - j];
				matrix[i][n - 1 - j] = temp;
			}
		}
	}

	public static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int val : row) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println("Original Matrix:");
		printMatrix(matrix);

		rotate90Clockwise(matrix);

		System.out.println("\nRotated Matrix (90° clockwise):");
		printMatrix(matrix);
	}
}
