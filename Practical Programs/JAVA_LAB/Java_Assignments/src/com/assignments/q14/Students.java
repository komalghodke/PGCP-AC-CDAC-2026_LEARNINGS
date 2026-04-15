package com.assignments.q14;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/*
 * Q14. Modify code written in Q12 by using ObjectInputStream
 * to read data from file and display it.
 */
class Student implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
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

	@Override
	public String toString() {
		return "ID: " + id + ", Name: " + name + ", Degree: " + degree + ", Email: " + email;
	}
}