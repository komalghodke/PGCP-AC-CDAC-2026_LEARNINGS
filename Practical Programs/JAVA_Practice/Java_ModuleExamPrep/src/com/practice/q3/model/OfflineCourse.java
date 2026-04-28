package com.practice.q3.model;

public class OfflineCourse extends Course {
	private String classroomNumber;
	private String location;

	public OfflineCourse(int id, String name, int duration, double fees, String status, String classroomNumber,
			String location) {
		super(id, name, duration, fees, status);
		this.classroomNumber = classroomNumber;
		this.location = location;
	}

	@Override
	public String toString() {
		return super.toString() + ", Classroom: " + classroomNumber + ", Location: " + location;
	}
}
