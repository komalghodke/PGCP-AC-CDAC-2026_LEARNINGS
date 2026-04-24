package com.dsa.array;

import java.util.Scanner;

public class My2DArray {
	private int[][] arr;

	public My2DArray() {
		arr = new int[3][3];
	}

	public My2DArray(int[][] arr) {
		super();
		this.arr = arr;
	}

	public My2DArray(int row, int col) {
		arr = new int[row][col];
	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("enter data for row " + i + " and column " + j);
				arr[i][j] = sc.nextInt();
				System.out.println(arr[i][j]);
			}
		}
	}

	public void displayData() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public int[] findSumRowWise() {
		int[] sumR = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				sumR[i] += arr[i][j];
				}
		}
		return sumR;
	}

	public char[] isIdentity() {
		return null;
	}

	public char[] isSymmetric() {
		return null;
	}

	public void rowRotate(boolean b, int i) {
	}

	public void columnRotate(boolean b, int i) {
	}

	public int[][] add2DArray(My2DArray ob1) {
		return null;
	}
}
