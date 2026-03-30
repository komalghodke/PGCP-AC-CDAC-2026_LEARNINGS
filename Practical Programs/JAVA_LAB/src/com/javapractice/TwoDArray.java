package com.javapractice;

import java.util.Scanner;

public class TwoDArray {

	public static void getMatrix(int[][] arr1) {
		System.out.print("Please enter the Elements of First 2D Array: ");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1.length; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
	}
	
	public static void displayMatrix(int[][] arr1) {
		System.out.println("First Matrix: ");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1.length; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	

}