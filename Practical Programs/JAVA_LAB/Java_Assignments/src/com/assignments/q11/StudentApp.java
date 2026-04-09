package com.assignments.q11;

import java.io.File;
import java.io.PrintWriter;

/*
Q11.
StudentApp class
Menu-driven program to store Student objects in ArrayList.
At exit, writes data to a CSV file.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> students = new ArrayList<>();

		while (true) {
			System.out.println("\nMenu:");
			System.out.println("1. Add new student");
			System.out.println("2. Display all students");
			System.out.println("3. Exit (write to CSV)");
			System.out.print("Enter choice: ");
			int ch = sc.nextInt();
			sc.nextLine();

			switch (ch) {
			case 1:
				System.out.print("Enter Student ID: ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Name: ");
				String name = sc.nextLine();
				System.out.print("Enter Degree: ");
				String degree = sc.nextLine();
				System.out.print("Enter Email: ");
				String email = sc.nextLine();
				students.add(new Student(id, name, degree, email));
				break;

			case 2:
				System.out.println("All Students:");
				for (Student s : students) {
					System.out.println(s);
				}
				break;

			case 3:
				writeToCSV(students);
				System.out.println("Data written to students.csv. Exiting...");
				return;
			}
		}
	}

	// Write student data to CSV file
	private static void writeToCSV(List<Student> students) {
		try (PrintWriter pw = new PrintWriter(new File("students.csv"))) {
			pw.println("ID,Name,Degree,Email");
			for (Student s : students) {
				pw.println(s.toCSV());
			}
		} catch (Exception e) {
			System.out.println("Error writing file: " + e.getMessage());
		}
	}
}
