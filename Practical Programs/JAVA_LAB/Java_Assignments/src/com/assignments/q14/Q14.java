package com.assignments.q14;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/*
 * Q14. Modify code written in Q12 by using ObjectInputStream
 * to read data from file and display it.
 */

public class Q14 {
	public static void main(String[] args) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
				"D:/CDAC_IET/PGCP-AC-CDAC-2026_LEARNINGS/Practical Programs/JAVA_LAB/Java_Assignments/students.csv"))) {

			// Read back the ArrayList<Student> written in Q13
			List<Student> students = (ArrayList<Student>) ois.readObject();

			System.out.println("Students Information:");
			for (Student s : students) {
				System.out.println(s);
			}
		} catch (Exception e) {
			System.out.println("Error reading file: " + e);
		}
	}
}
