package com.assignments.q3.Exam;

/*
ExamApp class
Main driver: creates two exams (Java, HTML), asks user which exam to appear,
conducts test, displays result, and asks if user wants to continue.
*/
import java.util.*;

public class ExamApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Question[] javaQs = {
				new Question(1, "What is JVM?", "Java Virtual Machine", "Java Vendor Manager", "Just Virtual Machine",
						"None", 1, 1),
				new Question(2, "Which keyword for inheritance?", "extends", "implements", "inherit", "super", 1, 1),
				new Question(3, "Default value of int?", "0", "null", "undefined", "1", 1, 1),
				new Question(4, "Which is not OOP concept?", "Encapsulation", "Polymorphism", "Compilation",
						"Inheritance", 3, 1),
				new Question(5, "Which package for Scanner?", "java.io", "java.util", "java.lang", "java.net", 2, 1) };
		Exam javaExam = new Exam(101, "Java Test", "Java", "2026-04-09", javaQs);

		Question[] htmlQs = {
				new Question(1, "HTML stands for?", "HyperText Markup Language", "HighText Machine Language",
						"Hyperlinks Text Markup", "None", 1, 1),
				new Question(2, "Which tag for line break?", "<br>", "<lb>", "<break>", "<newline>", 1, 1),
				new Question(3, "Which tag for largest heading?", "<h1>", "<h6>", "<head>", "<heading>", 1, 1),
				new Question(4, "Which attribute for image src?", "href", "src", "link", "path", 2, 1),
				new Question(5, "Which tag for table row?", "<tr>", "<td>", "<th>", "<row>", 1, 1) };
		Exam htmlExam = new Exam(102, "HTML Test", "HTML", "2026-04-09", htmlQs);

		boolean cont = true;
		while (cont) {
			System.out.println("Choose exam: 1. Java  2. HTML");
			int choice = sc.nextInt();
			Exam selected = (choice == 1) ? javaExam : htmlExam;

			int marks = selected.conductExam(sc);
			System.out.println("You scored: " + marks);
			if (marks >= 3)
				System.out.println("Congratulations! You completed the test.");
			else
				System.out.println("Better luck next time.");

			System.out.print("Do you want to continue? (yes/no): ");
			cont = sc.next().equalsIgnoreCase("yes");
		}
	}
}