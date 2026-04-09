package com.assignments.q1;

import java.util.Scanner;

/*	Assignment Q 1.2
 * 	Write a program to maintain student information. For each student store studid, name, m1, m2 and m3
 * 	(marks of 3 subjects ). Accept information for 2 students and display it as follows.
 */

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student[] students = new Student[2];
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter details for student " + (i + 1));
			System.out.print("ID: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Marks in 3 subjects: ");
			int m1 = sc.nextInt();
			int m2 = sc.nextInt();
			int m3 = sc.nextInt();

			students[i] = new Student(id, name, m1, m2, m3);
		}

		System.out.println("\n--- Student Details ---");
		for (Student s : students) {
			s.display();
		}
		sc.close();
	}

}
