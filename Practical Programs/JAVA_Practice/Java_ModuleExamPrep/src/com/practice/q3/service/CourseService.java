package com.practice.q3.service;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

import com.practice.q3.model.Course;
import com.practice.q3.model.OfflineCourse;
import com.practice.q3.model.OnlineCourse;

public class CourseService {
	private LinkedList<Course> courses = new LinkedList<>();

	public void addCourse(Course c) {
		courses.add(c);
	}

	public void removeCourse(int id) {
		for (Iterator<Course> it = courses.iterator(); it.hasNext();) {
			if (it.next().getCourseId() == id) {
				it.remove();
				break;
			}
		}
	}

	public void updateFees(int id, double newFees) {
		for (Course c : courses) {
			if (c.getCourseId() == id) {
				c.setFees(newFees);
				break;
			}
		}
	}

	public void changeStatus(int id, String status) {
		for (Course c : courses) {
			if (c.getCourseId() == id) {
				c.setStatus(status);
				break;
			}
		}
	}

	public void enroll(int id) {
		for (Course c : courses) {
			if (c.getCourseId() == id) {
				System.out.println("Enrolled in: " + c.getCourseName() + " (Duration: " + c.getDuration() + ")");
				break;
			}
		}
	}

	public void displayAll() {
		for (Course c : courses) {
			System.out.println(c);
		}
	}

	public void displayByType(String type) {
		for (Course c : courses) {
			if (type.equalsIgnoreCase("Online") && c instanceof OnlineCourse) {
				System.out.println(c);
			} else if (type.equalsIgnoreCase("Offline") && c instanceof OfflineCourse) {
				System.out.println(c);
			}
		}
	}

	public void displayByFees(double maxFees) {
		for (Course c : courses) {
			if (c.getFees() < maxFees) {
				System.out.println(c);
			}
		}
	}

	public void sortByDuration() {
		courses.sort(Comparator.comparingInt(Course::getDuration));
		for (Course c : courses) {
			System.out.println(c);
		}
	}

	public void searchByName(String name) {
		for (Course c : courses) {
			if (c.getCourseName().equalsIgnoreCase(name)) {
				System.out.println(c);
			}
		}
	}
}
