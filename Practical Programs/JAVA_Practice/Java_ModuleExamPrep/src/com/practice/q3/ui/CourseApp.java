package com.practice.q3.ui;

import java.util.Scanner;

import com.practice.q3.model.OfflineCourse;
import com.practice.q3.model.OnlineCourse;
import com.practice.q3.service.CourseService;

/*
 * Q3. Design Java application for the following 
Design Java application for the following 
Create a class Course to store following details 
courseId, courseName, duration, fees, status 
Courses are of 2 types 
Online Course, Offline Course 
For Online Course store platformName, instructorName 
For Offline Course add classroomNumber and location 
Store details of courses in a LinkedList. 
Display following menu 
a. Add new Course 
b. Remove course using courseId 
c. Update course fees 
d. Activate/Deactivate course (change status) 
e. Enroll in course based on type and duration 
f. Display all courses 
g. Display courses by type 
h. Display courses with fees less than given value 
i. Sort courses by duration 
j. Search course by name 
k. Exit
 */
public class CourseApp {
	public static void main(String[] args) {
		CourseService service = new CourseService();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\nMenu:");
			System.out.println("a. Add new Course");
			System.out.println("b. Remove course using courseId");
			System.out.println("c. Update course fees");
			System.out.println("d. Activate/Deactivate course");
			System.out.println("e. Enroll in course");
			System.out.println("f. Display all courses");
			System.out.println("g. Display courses by type");
			System.out.println("h. Display courses with fees less than given value");
			System.out.println("i. Sort courses by duration");
			System.out.println("j. Search course by name");
			System.out.println("k. Exit");
			System.out.print("Enter choice: ");
			String choice = sc.next();

			switch (choice) {
			case "a":
				System.out.print("Type (Online/Offline): ");
				String type = sc.next();
				System.out.print("ID: ");
				int id = sc.nextInt();
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Duration: ");
				int dur = sc.nextInt();
				System.out.print("Fees: ");
				double fees = sc.nextDouble();

				if (type.equalsIgnoreCase("Online")) {
					System.out.print("Platform: ");
					String platform = sc.next();
					System.out.print("Instructor: ");
					String instr = sc.next();
					service.addCourse(new OnlineCourse(id, name, dur, fees, "Active", platform, instr));
				} else {
					System.out.print("Classroom: ");
					String room = sc.next();
					System.out.print("Location: ");
					String loc = sc.next();
					service.addCourse(new OfflineCourse(id, name, dur, fees, "Active", room, loc));
				}
				break;

			case "b":
				System.out.print("Enter ID to remove: ");
				service.removeCourse(sc.nextInt());
				break;

			case "c":
				System.out.print("Enter ID: ");
				int uid = sc.nextInt();
				System.out.print("New Fees: ");
				service.updateFees(uid, sc.nextDouble());
				break;

			case "d":
				System.out.print("Enter ID: ");
				int sid = sc.nextInt();
				System.out.print("Status (Active/Inactive): ");
				service.changeStatus(sid, sc.next());
				break;

			case "e":
				System.out.print("Enter ID: ");
				service.enroll(sc.nextInt());
				break;

			case "f":
				service.displayAll();
				break;

			case "g":
				System.out.print("Type (Online/Offline): ");
				service.displayByType(sc.next());
				break;

			case "h":
				System.out.print("Max Fees: ");
				service.displayByFees(sc.nextDouble());
				break;

			case "i":
				service.sortByDuration();
				break;

			case "j":
				System.out.print("Name: ");
				service.searchByName(sc.next());
				break;

			case "k":
				System.out.println("Exiting...");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice!");
			}
		}
	}
}