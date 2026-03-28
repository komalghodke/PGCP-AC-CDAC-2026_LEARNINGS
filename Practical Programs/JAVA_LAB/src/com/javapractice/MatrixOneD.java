package com.javapractice;

import java.util.Scanner;

public class MatrixOneD {

	public static void acceptData(int[] a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Elements: ");
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
	}
	
	public static void displayData(int[] a) {
		for(int i=1; i<a.length; i++) {
				System.out.println(a[i]+" ");
		}
	}

	public static int searchData(int[] a, int num) {
		int n = num;
		for(int i = 0; i<a.length; i++) {
			if(a[i]==n) {
				System.out.println("Element Found!");
				return i;
			}
	}
	return -1;
	}

	public static int add(int[] a) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	public static int findMax(int[] a) {
		int max = a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		return max;
	}
	
	public static int findMin(int[] a) {
		int min = a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]<min) {
				min = a[i];
			}
		}
		return min;
	}

	public static int[] findSumOfDig(int[] a) {
		int[] matrixOneD = new int[a.length];
 		for(int i=0; i<a.length; i++) {
 			matrixOneD[i] = getDigitAdd(a[i]);
		}
		return matrixOneD;
	}

	private static int getDigitAdd(int num) {
		int res = 0;
		while(num>0) {
			int d = num%10;
			num = num/10;
			res += d;
		}
		return res;
	}
}
