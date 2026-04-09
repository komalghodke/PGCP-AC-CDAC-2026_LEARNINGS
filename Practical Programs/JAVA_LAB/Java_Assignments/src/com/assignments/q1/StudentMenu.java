package com.assignments.q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*	Assignment Q 1.3 
 * 	Write a menu driven program to maintain student information. Modify  Student class 
	created in previous assignment.  Add a member gpa in student class, add a function in 
	student class to return GPA of a student 
	calculateGPA() 
	gpa=(1/3)*m1+(1/2)*m2+(1/4)*m3 
	Create an array to store Multiple students. 
	1. Display All Student 
	2. Search by id 
	3.  Search by name 
	4. calculate GPA of a student 
	5. Exit
*/

public class StudentMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i+1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Marks in 3 subjects: ");
            int m1 = sc.nextInt(), m2 = sc.nextInt(), m3 = sc.nextInt();
            students.add(new Student(id, name, m1, m2, m3));
        }

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Display All Students");
            System.out.println("2. Search by ID");
            System.out.println("3. Search by Name");
            System.out.println("4. Calculate GPA of a Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (Student s : students) s.display();
                    break;
                case 2:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    students.stream().filter(s -> s.studid == id).forEach(Student::display);
                    break;
                case 3:
                    System.out.print("Enter Name: ");
                    String nm = sc.next();
                    students.stream().filter(s -> s.name.equalsIgnoreCase(nm)).forEach(Student::display);
                    break;
                case 4:
                    System.out.print("Enter ID: ");
                    int sid = sc.nextInt();
                    students.stream().filter(s -> s.studid == sid)
                            .forEach(s -> System.out.println("GPA of " + s.name + " = " + s.calculateGPA()));
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}