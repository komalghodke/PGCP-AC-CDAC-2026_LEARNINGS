package com.assignments.q4.Rescruitment;

/*
Student class
Stores sid, name, bdate, degree, marks.
Equality based on sid (unique student id).
*/
import java.util.Objects;

public class Student {
	int sid;
	String name;
	String bdate;
	String degree;
	double marks;

	public Student(int sid, String name, String bdate, String degree, double marks) {
		this.sid = sid;
		this.name = name;
		this.bdate = bdate;
		this.degree = degree;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "ID: " + sid + ", Name: " + name + ", Birthdate: " + bdate + ", Degree: " + degree + ", Marks: " + marks;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Student))
			return false;
		Student s = (Student) o;
		return this.sid == s.sid;
	}

	@Override
	public int hashCode() {
		return Objects.hash(sid);
	}
}
