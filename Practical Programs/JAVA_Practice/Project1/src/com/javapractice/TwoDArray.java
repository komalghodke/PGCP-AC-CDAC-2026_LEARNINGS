package com.javapractice;

import java.util.Scanner;

public class TwoDArray {

	public static void getMatrix(int[][] arr1) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
	}
	
	public static void displayMatrix(int[][] arr1) {
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static int findMax(int[][] arr1) {
		int max = arr1[0][0];
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				if(max < arr1[i][j]) {
					max=arr1[i][j];
					}
			}
		}
		return max;
	}
	
	public static int findMin(int[][] arr1) {
		Scanner sc = new Scanner(System.in);
		int min = arr1[0][0];
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				if(min > arr1[i][j]) {
					min=arr1[i][j];
					}
			}
		}
		return min;
	}

	public static int[] findSumRowWise(int[][] arr1) {
		int[] sumR = new int[arr1.length];
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				sumR[i] += arr1[i][j];
			}
		}
		return sumR;
	}

	public static int[] findSumColWise(int[][] arr) {
		int[] sumC = new int[arr[0].length];
		for(int i=0; i<arr[0].length; i++) {
			for(int j=0; j<arr.length; j++) {
				sumC[i] += arr[j][i];
			}
		}
		return sumC;
	}

	public static int[] findMaxRowWise(int[][] arr) {
		int[] maxR = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			maxR[i]=arr[i][0];
			for(int j=0; j<arr[i].length; j++) {
				if(maxR[i]<arr[i][j]) {
					maxR[i] = arr[i][j];
				}
			}
		}
		return maxR;
	}

	public static int[] findMaxColWise(int[][] arr) {
		int[] maxC = new int[arr[0].length];
		for(int i=0; i<arr[0].length; i++) {
			maxC[i]=arr[0][i];
			for(int j=0; j<arr.length; j++) {
				if(maxC[i]<arr[i][j]) {
					maxC[i] = arr[j][i];
				}
			}
		}
		return maxC;
	}

	public static int[] findMinRowWise(int[][] arr) {
		int[] minR = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			minR[i]=arr[i][0];
			for(int j=0; j<arr[i].length; j++) {
				if(minR[i]>arr[i][j]) {
					minR[i] = arr[i][j];
				}
			}
		}
		return minR;
	}
	
	public static int[] findMinColWise(int[][] arr) {
		int[] minC = new int[arr[0].length];
		for(int i=0; i<arr[0].length; i++) {
			minC[i]=arr[0][i];
			for(int j=0; j<arr.length; j++) {
				if(minC[i]>arr[i][j]) {
					minC[i] = arr[j][i];
				}
			}
		}
		return minC;
	}

	public static int[][] addition(int[][] arr1, int[][] arr2) {
		int[][] add = new int[arr1.length][arr2.length];
		for(int i=0; i<arr1[0].length; i++) {
			for(int j=0; j<arr1.length; j++) {
				add[i][j] = arr1[i][j] + arr2[i][j];
				}
		}
		return add;
	}

	public static int[][] substract(int[][] arr1, int[][] arr2) {
		int[][] sub = new int[arr1.length][arr2.length];
		for(int i=0; i<arr1[0].length; i++) {
			for(int j=0; j<arr1.length; j++) {
				sub[i][j] = arr1[i][j] - arr2[i][j];
				}
		}
		return sub;
	}
	
}