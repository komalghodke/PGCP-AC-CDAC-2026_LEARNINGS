package com.javapractice.stdmngment;

import java.util.Scanner;

public class StudentTestMngmnt {

	public static void main(String[] args) {

		int choice = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Welcome to Student Management System");
			System.out.println(
					"Menu:\n 1. Add new Student \n 2. Delete By Id \n 3. Update By ID \n 4. Display All Students \n"
							+ " 5. Display By Id \n 6. Display By name \n 7. Exit \n Please enter your choice:");
			choice = sc.nextInt();

			switch (choice) {
			case 1 -> {
				boolean status = StudentService.addNewStudent();
				if (status) {
					System.out.println("Student Added Successfully!");
				} else {
					System.out.println("Not able to Add Student!");
				}
			}

			case 2 -> {
				System.out.println("Enter a Id of student to delete the record: ");
				int id = sc.nextInt();
				int flag = StudentService.deleteById(id);
				if (flag == 0) {
					System.out.println("Found and deleted successfully");
				} else if (flag == 1) {
					System.out.println("Found and not deleted successfully");
				} else {
					System.out.println("not found");
				}
			}

			case 3 -> {
				System.out.println("Enter a Id of student to update the record: ");
				int id = sc.nextInt();
				System.out.println("Enter M1: ");
				float m1 = sc.nextFloat();
				System.out.println("Enter M1: ");
				float m2 = sc.nextFloat();
				System.out.println("Enter M1: ");
				float m3 = sc.nextFloat();

				boolean status = StudentService.updateById(id, m1, m2, m3);
				if (status) {
					System.out.println("Student wit id : " + id + " is Updated Successfully!");
				} else {
					System.out.println("Student not found!");
				}
			}

			case 4 -> {
				Student[] st = StudentService.displayAll();
				for (Student s : st) {
					if (s != null) {
						System.out.println(s + "\n");
					} else {
						break;
					}
				}
			}

			case 5 -> {
				System.out.println("Please Enter a Student Id to display Student: ");
				int id = sc.nextInt();
				Student s = StudentService.diplayById(id);
				if (s != null) {
					System.out.println(s);
				} else {
					System.out.println("Student Not Found -- having Id " + id);
				}
			}

			case 6 -> {
				System.out.println("Please Enter a Student Name to display Student: ");
				String name = sc.next();
				Student st[] = StudentService.diplayByName(name);
				if (st != null) {
					for (Student s : st) {
						if (s != null) {
							System.out.println(s);
						} else {
							break;
						}
					}
				} else {
					System.out.println("Student Not Found -- with name " + name);
				}
			}

			case 7 -> {
				sc.close();
				System.out.println("Good Bye!");
			}

			default -> {
				System.out.println("Invalid Choice, Please try again!");
			}
			}

		} while (choice != 7);
	}

}
