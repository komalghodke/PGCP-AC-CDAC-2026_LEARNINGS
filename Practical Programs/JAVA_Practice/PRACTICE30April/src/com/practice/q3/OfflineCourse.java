package com.practice.q3;

public class OfflineCourse extends Course{
	int classroomNumber;
	String location;

	public OfflineCourse(int id, String name, int duration, double fees, String status, int classroomNumber,
			String location) {
		super(id, name, duration, fees, status);
		this.classroomNumber = classroomNumber;
		this.location = location;
	}

	@Override
	public String toString() {
		return "OfflineCourse [classroomNumber=" + classroomNumber + ", location=" + location + "]";
	}
}
