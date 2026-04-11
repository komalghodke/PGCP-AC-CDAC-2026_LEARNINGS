package com.demoCollection.ExceptionHandler;

import java.util.InputMismatchException;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			System.out.println("enetr a and b");
			int a = 34;
			int b = 0;
			int ans = divide(a, b);
			System.out.println("Answer: " + ans);
			int[] arr = { 3, 4, 5, 6 };
			for (int i = 0; i <= arr.length; i++) {
				System.out.print(arr[i] + "\t");
			}
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println("in main try bock");
			// e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			System.out.println("in input type mismatch exception");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("error occurred");
		} finally { // code to run if exception occurs, or not occur
			System.out.println("in finally block");
		}
		System.out.println("resume execution of main method");

	}

	private static int divide(int a, int b) {
		try {
			int ans = a / b;
			return ans;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("In divide function exception");
			throw e;
		}

	}

}