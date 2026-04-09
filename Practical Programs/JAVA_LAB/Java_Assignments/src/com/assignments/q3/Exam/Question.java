package com.assignments.q3.Exam;

/*
Question class
Stores qno, question text, options (opt1–opt4), correct answer, marks.
*/
public class Question {
	int qno;
	String text, opt1, opt2, opt3, opt4;
	int ans;
	int marks;

	public Question(int qno, String text, String opt1, String opt2, String opt3, String opt4, int ans, int marks) {
		this.qno = qno;
		this.text = text;
		this.opt1 = opt1;
		this.opt2 = opt2;
		this.opt3 = opt3;
		this.opt4 = opt4;
		this.ans = ans;
		this.marks = marks;
	}

	public boolean ask(java.util.Scanner sc) {
		System.out.println(qno + ". " + text);
		System.out.println("1. " + opt1);
		System.out.println("2. " + opt2);
		System.out.println("3. " + opt3);
		System.out.println("4. " + opt4);
		System.out.print("Your answer: ");
		int choice = sc.nextInt();
		return choice == ans;
	}
}
