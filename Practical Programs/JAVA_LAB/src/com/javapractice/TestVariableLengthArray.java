package com.javapractice;

import java.util.stream.Stream;

public class TestVariableLengthArray {
     public static void main(String args[]) {
    	 //int[] arr=new int[10];
    	 //int[][] arr1=new int[5][4];
    	 int[][] arr2=new int[3][];
    	 ArrayVariableService.acceptData(arr2);
    	 ArrayVariableService.displayData(arr2);
    	 int[] arr=ArrayVariableService.findminRowwise(arr2);
    	 //java 1.5 
    	 for(int i=0;i<arr.length;i++) {
    		 System.out.println("Minimum of" +i+"th row --->" +arr[i]);
    	 }
    	 //java 1.7
    	 for(int num:arr) {  //{12,3,4}
    		 System.out.println("Minimum of row --->"+num);
    	 }
    	 //java 1.8
    	 Stream.of(arr).forEach(num->System.out.println("Minimum of th row --->"+num));
    	 
    	 arr=ArrayVariableService.findminColumnwise(arr2);
    	 //java 1.5 
    	 for(int i=0;i<arr.length;i++) {
    		 System.out.println("Minimum of" +i+"th row --->" +arr[i]);
    	 }
    	 //java 1.7
    	 for(int num:arr) {  //{12,3,4}
    		 System.out.println("Minimum is --->"+num);
    	 }
    	 //java 1.8
    	 Stream.of(arr).forEach(num->System.out.println("Minimum  --->"+num));
     }
}
