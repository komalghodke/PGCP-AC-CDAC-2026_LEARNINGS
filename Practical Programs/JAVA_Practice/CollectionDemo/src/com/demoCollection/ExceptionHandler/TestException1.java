package com.demoCollection.ExceptionHandler;

import java.util.Scanner;

public class TestException1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 56;
		while (true) {
			try {
				System.out.println("guess the number");
				int n = sc.nextInt();
				if (n == num) {
					System.out.println("Yeepeeee, you found it!");
					break;
				} else {
					throw new ArithmeticException("Opps! you lost the attempt guess once again");
				}
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}