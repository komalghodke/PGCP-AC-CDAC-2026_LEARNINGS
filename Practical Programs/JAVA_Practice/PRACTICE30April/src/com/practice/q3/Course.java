package com.practice.q3;

public class Course {
	int courseId;
	String courseName;
	int duration;
	double fees;
	String status;

	public Course(int courseId, String courseName, int duration, double fees, String status) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
		this.fees = fees;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", duration=" + duration + ", fees="
				+ fees + ", status=" + status + "]";
	}

}
