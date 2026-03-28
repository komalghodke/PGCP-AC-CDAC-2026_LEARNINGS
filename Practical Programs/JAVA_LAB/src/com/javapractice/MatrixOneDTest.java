package com.javapractice;

import java.util.Scanner;

public class MatrixOneDTest {


	public static void main(String[] args) {
		int[] a = new int[10];
		//int[] a1 = {12, 2, 32, 32,32,32,12, 32,32};
		Scanner sc = new Scanner(System.in);
		MatrixOneD.acceptData(a);
		MatrixOneD.displayData(a);
		System.out.print("enter number to search");
		int num = sc.nextInt();
		int pos = MatrixOneD.searchData(a, num);
		if(pos!=-1) {
			System.out.println("Found At : " + pos);
		}
		else {
			System.out.println("Not Found!");
		}
		
		int sum =  MatrixOneD.add(a);
		System.out.println("Sum of elements in array: "+ sum);
		
		int maxN =  MatrixOneD.findMax(a);
		System.out.println("MAx element is: "+ maxN);
		
		int minN =  MatrixOneD.findMin(a);
		System.out.println("Min element is: "+ minN);
		
		System.out.println("Addition Array for digit in elements:");
		int[] sumOfDigArr =  MatrixOneD.findSumOfDig(a);
		for(int i=0; i<sumOfDigArr.length; i++) {
			System.out.println("Sum of Digits of element: " + a[i] + " is: "+ sumOfDigArr[i]);
		}		
		sc.close();
	}
}
