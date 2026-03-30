package com.javapractice;

public class TwoDArrayTest {

	public static void main(String[] args) {

		int[][] arr1 = new int[3][3];
		System.out.print("Please enter the Elements of First 2D Array: ");
		TwoDArray.getMatrix(arr1);
		System.out.println("Matrix 1:");
		TwoDArray.displayMatrix(arr1);
		
		int[][] arr2 = new int[3][3];
		System.out.print("Please enter the Elements of Second 2D Array: ");
		TwoDArray.getMatrix(arr2);
		System.out.println("Matrix 2:");
		TwoDArray.displayMatrix(arr2);
		
		int[][] res = TwoDArray.addition(arr1, arr2);		
		System.out.println("Addition Matrix of Matrix 1 and Matrix 2 is: ");
		TwoDArray.displayMatrix(res);
		
		int[][] resSub = TwoDArray.substract(arr1, arr2);		
		System.out.println("Substraction Matrix of Matrix 1 and Matrix 2 is: ");
		TwoDArray.displayMatrix(resSub);
		
		int max = TwoDArray.findMax(arr1);
		System.out.println("\nMaximum element from Matrix 1: " + max);
		
		int min = TwoDArray.findMin(arr1);
		System.out.println("Minimum element from Matrix 1: " + min);
		
		int[] sumArr =  TwoDArray.findSumRowWise(arr1);
		for(int i=0; i<sumArr.length; i++) {
			System.out.println("Sum of Row Number " +i+ " of Matrix is: " + sumArr[i]);
		}
		
		int[] colSum =  TwoDArray.findSumColWise(arr1);
		for(int i=0; i<colSum.length; i++) {
			System.out.println("Sum of Column Number " +i+ " of Matrix is: " + colSum[i]);
		}
		
		System.out.println();
		
		int[] maxRow =  TwoDArray.findMaxRowWise(arr1);
		for(int i=0; i<maxRow.length; i++) {
			System.out.println("Max element of row Number " +i+ " of Matrix is: " + maxRow[i]);
		}
		
		System.out.println();
		
		int[] minRow =  TwoDArray.findMinRowWise(arr1);
		for(int i=0; i<minRow.length; i++) {
			System.out.println("Minimum element of row Number " +i+ " of Matrix is: " + minRow[i]);
		}
		
		System.out.println();
		
		int[] maxCol =  TwoDArray.findMaxColWise(arr1);
		for(int i=0; i<maxCol.length; i++) {
			System.out.println("Max element of Column Number " +i+ " of Matrix is: " + maxCol[i]);
		}

		System.out.println();
		
		int[] minCol =  TwoDArray.findMinColWise(arr1);
		for(int i=0; i<minCol.length; i++) {
			System.out.println("Minimum element of Column Number " +i+ " of Matrix is: " + minCol[i]);
		}
	}

}
