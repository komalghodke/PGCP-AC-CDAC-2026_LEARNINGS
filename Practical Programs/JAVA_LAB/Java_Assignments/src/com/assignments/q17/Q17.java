package com.assignments.q17;

import java.util.Scanner;

/*
 * Q17. Create enum Grade and store following objects:
 * Distinction(80,100), First(65,79), Second(50,64), Pass(40,49), Fail(0,39).
 * Accept grade from user and display minimum and maximum marks for the grade.
 */
enum Grade {
	DISTINCTION(80, 100), FIRST(65, 79), SECOND(50, 64), PASS(40, 49), FAIL(0, 39);

	private int min;
	private int max;

	Grade(int min, int max) {
		this.min = min;
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}
}

public class Q17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter grade (DISTINCTION, FIRST, SECOND, PASS, FAIL):");
		String input = sc.nextLine().trim().toUpperCase();

		try {
			Grade grade = Grade.valueOf(input);
			System.out.println("Grade: " + grade);
			System.out.println("Minimum Marks: " + grade.getMin());
			System.out.println("Maximum Marks: " + grade.getMax());
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid grade entered!");
		}

		sc.close();
	}
}
