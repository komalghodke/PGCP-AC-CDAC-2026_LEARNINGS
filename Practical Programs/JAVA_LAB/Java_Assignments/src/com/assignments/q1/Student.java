package com.assignments.q1;

class Student {
	int studid;
	String name;
	int m1, m2, m3;
	double gpa;

	Student(int studid, String name, int m1, int m2, int m3) {
		this.studid = studid;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.gpa = calculateGPA();
	}

	double calculateGPA() {
		return (1.0 / 3) * m1 + (1.0 / 2) * m2 + (1.0 / 4) * m3;
	}

	void display() {
		System.out.println(
				"ID: " + studid + ", Name: " + name + ", Marks: " + m1 + ", " + m2 + ", " + m3 + ", GPA: " + gpa);
	}
}
