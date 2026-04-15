package com.assignments.q13;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Q13 {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(9, "kg", "be", "kg@gmail.com"));
		students.add(new Student(10, "GK", "CS", "GK@gmail.com"));
		students.add(new Student(11, "K", "IT", "K@gmail.com"));

		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("D:\\CDAC_IET\\PGCP-AC-CDAC-2026_LEARNINGS\\Practical Programs\\JAVA_LAB\\Java_Assignments\\students2.csv"))) {
			oos.writeObject(students);
			System.out.println("Students data written successfully to students.csv");
		} catch (Exception e) {
			System.out.println("Error writing file: " + e);
		}
	}
}
