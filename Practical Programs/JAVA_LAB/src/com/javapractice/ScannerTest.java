package com.javapractice;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the value: ");
		int a =sc.nextInt();
		System.out.println("Value is: " + a);
		
		System.out.println("Enter your name: ");
		String name =sc.next();
		System.out.println("Hello..." + name+"!!!");
		
		sc.nextLine();
	    System.out.println("Enter your Full name: ");
	    String nm = sc.nextLine();
	    System.out.println("Hello " + nm + "!!!");
		sc.close();
	}
}
