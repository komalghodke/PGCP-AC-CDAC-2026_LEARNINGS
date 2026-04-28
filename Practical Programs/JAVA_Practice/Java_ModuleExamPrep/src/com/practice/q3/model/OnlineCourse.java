package com.practice.q3.model;

public class OnlineCourse extends Course {
	private String platformName;
	private String instructorName;

	public OnlineCourse(int id, String name, int duration, double fees, String status, String platformName,
			String instructorName) {
		super(id, name, duration, fees, status);
		this.platformName = platformName;
		this.instructorName = instructorName;
	}

	@Override
	public String toString() {
		return super.toString() + ", Platform: " + platformName + ", Instructor: " + instructorName;
	}
}
