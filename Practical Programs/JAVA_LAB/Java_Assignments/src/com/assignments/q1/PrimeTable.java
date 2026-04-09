package com.assignments.q1;

/*	ASSIGNMENT Q1
	Accept 3 numbers from command line arguments. If number is prime,
	then print the table of the number. Other wise divide number by 10 and display output
*/

public class PrimeTable {
	public static void main(String[] args) {
		if (args.length < 3) {
			System.out.println("Need 3 numbers as arguments.");
			return;
		}
		for (int i = 0; i < 3; i++) {
			int n = Integer.parseInt(args[i]);
			if (isPrime(n)) {
				for (int j = 1; j <= 10; j++)
					System.out.println(n + " x " + j + " = " + n * j);
			} else {
				System.out.println(n + " / 10 = " + (n / 10.0));
			}
		}
	}

	static boolean isPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++)
			if (n % i == 0)
				return false;
		return true;
	}
}
