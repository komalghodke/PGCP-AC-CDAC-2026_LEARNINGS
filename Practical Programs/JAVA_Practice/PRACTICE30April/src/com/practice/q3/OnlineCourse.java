package com.practice.q3;

public class OnlineCourse extends Course {
	String platformName;
	String instructorName;

	public OnlineCourse(int id, String name, int duration, double fees, String status, String platformName,
			String instructorName) {
		super(id, name, duration, fees, status);
		this.platformName = platformName;
		this.instructorName = instructorName;
	}

	@Override
	public String toString() {
		return "OnlineCourse [platformName=" + platformName + ", instructorName=" + instructorName + "]";
	}
}
