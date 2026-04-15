package com.assignments.q12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/*
 * Q12. Read data from file created in Q11 (students.csv),
 * store it in ArrayList, and display all Students information.
 */
class Student {
	int id;
	String name;
	String degree;
	String email;

	Student(int id, String name, String degree, String email) {
		this.id = id;
		this.name = name;
		this.degree = degree;
		this.email = email;
	}

	public String toString() {
		return "ID: " + id + ", Name: " + name + ", Degree: " + degree + ", Email: " + email;
	}
}

public class Q12 {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(
				"D:\\CDAC_IET\\PGCP-AC-CDAC-2026_LEARNINGS\\Practical Programs\\JAVA_LAB\\Java_Assignments\\students.csv"))) {
			String line;
			boolean firstLine = true;
			while ((line = br.readLine()) != null) {
				if (firstLine) {
					firstLine = false;
					continue;
				}
				String[] data = line.split(",");
				students.add(new Student(Integer.parseInt(data[0]), data[1], data[2], data[3]));
			}
		} catch (Exception e) {
			System.out.println("Error reading file: " + e);
		}

		System.out.println("Students Information:");
		for (Student s : students) {
			System.out.println(s);
		}
	}
}