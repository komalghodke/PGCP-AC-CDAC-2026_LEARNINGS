package com.javapractice;

import java.util.Scanner;

public class ArrayVariableService {

	public static void acceptData(int[][] arr2) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr2.length;i++) {
			//accept columns numbers  
			System.out.println("pls eneter number of columns");
			  int col=sc.nextInt();
			 //allocate memory for i th row
			  arr2[i]=new int[col];
			  //aceepting data for ith row
			  for(int j=0;j<arr2[i].length;j++) {
				  System.out.println("enetr number for row "+i+"column : "+j);
				  arr2[i][j]=sc.nextInt();
			  }
		}
		
	}

	public static void displayData(int[][] arr2) {
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				  System.out.print(arr2[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

	public static int[] findminRowwise(int[][] arr) {
		int[] minval=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			minval[i]=arr[i][0];
			for(int j=1;j<arr[i].length;j++) {
				if(minval[i]>arr[i][j]) {
					minval[i]=arr[i][j];
				}
			}
			
		}
		return minval;
	}

	public static int[] findminColumnwise(int[][] arr) {
		//find maxlength of row
		int maxlen=arr[0].length;
		for(int i=1;i<arr.length;i++) {
			  if(maxlen<arr[i].length)
				     maxlen=arr[i].length;
		}
		//allocate array for storing min values
		System.out.println("maxlength : "+maxlen);
		int[] minval=new int[maxlen];
		///find minimum for each column
		for(int col=0;col<maxlen;col++) {
			int rn=0;
			//find first row for each column
			while(col>=arr[rn].length) {
				 rn++;
			}
		   System.out.println("first row for column "+col+": "+rn);
			//assign minvalue to the first rows value of that column
			minval[col]=arr[rn][col];
			for(int i=rn+1;i<arr.length;i++) {
				 System.out.println("row : "+i +"col : "+col);
				  if((col<arr[i].length) && (minval[col]>arr[i][col] )) {
					  System.out.println("in if row : "+i +"col : "+col);
					  minval[col]=arr[i][col];
				  }
			}
		}
		return minval;
	}

}
