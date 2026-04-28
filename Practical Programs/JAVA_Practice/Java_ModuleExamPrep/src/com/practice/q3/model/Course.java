package com.practice.q3.model;

public abstract class Course {
	protected int courseId;
	protected String courseName;
	protected int duration;
	protected double fees;
	protected String status;

	public Course(int courseId, String courseName, int duration, double fees, String status) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
		this.fees = fees;
		this.status = status;
	}

	public int getCourseId() {
		return courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public int getDuration() {
		return duration;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ID: " + courseId + ", Name: " + courseName + ", Duration: " + duration + ", Fees: " + fees
				+ ", Status: " + status;
	}
}
