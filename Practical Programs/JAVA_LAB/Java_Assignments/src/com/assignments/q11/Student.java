package com.assignments.q11;

/*
Q11.
Student class
Stores studid, name, degree, email.
*/
public class Student {
	private int studId;
	private String name;
	private String degree;
	private String email;

	public Student(int studId, String name, String degree, String email) {
		this.studId = studId;
		this.name = name;
		this.degree = degree;
		this.email = email;
	}

	public int getStudId() {
		return studId;
	}

	public String getName() {
		return name;
	}

	public String getDegree() {
		return degree;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "ID: " + studId + ", Name: " + name + ", Degree: " + degree + ", Email: " + email;
	}

	public String toCSV() {
		return studId + "," + name + "," + degree + "," + email;
	}
}
