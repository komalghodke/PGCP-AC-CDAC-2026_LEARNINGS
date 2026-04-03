package com.javapractice;

import java.util.Scanner;

public class Calculate {


	public static int factorial(int n) {
		int f = 1;
		for(int i =1; i<=n; i++) {
			f = f*i;
		}
		return f;
	}
	

	public static void getTable(int t) {
		for(int i=1; i<=10; i++) {
			System.out.println(t + "*" + i + "=" + (t*i));
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Length of cmd line args is: " + args.length);
		int len = args.length;
		if(len==3) {
			int num1 = Integer.parseInt(args[1]);
			int num2 = Integer.parseInt(args[2]);
			
			switch(args[0]) {
				case "+" :
					System.out.println("Addition is:" + (num1+num2));
					break;
				case "-" :
					System.out.println("Substraction is:" + (num1-num2));
					break;
				case "x" :
					System.out.println("Addition is:" + (num1*num2));
					break;
				case "/":
					System.out.println("Division is:" + (num1/num2));
					break;
				default:
					System.out.println("Enter Valid Operation");
			}
			
		}
		else {
			System.out.println("Invalid! Enter 3 args input for Calculator (Operation, Num1, Num2)");
		}
		
		System.out.println("Enter the number to Find Factorial: ");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int fact = factorial(n);
		System.out.println("Factorial is: " + fact);
		
		System.out.println("Enter a number to print it's Table:");
		int t = sc.nextInt();
		getTable(t);
		sc.close();
	}
}