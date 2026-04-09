package com.assignments.q4.Rescruitment;

/*
RecruitmentApp class
Menu-driven program to manage students and their skills.
Operations:
1. Add new student
2. Add new skill for a student
3. Delete student
4. Delete skill for a student
5. Display all students with given skill
6. Display all students with given degree
7. Exit
*/
import java.util.*;

public class RecruitmentApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Student, Set<String>> studentSkills = new HashMap<>();

		while (true) {
			System.out.println("\nMenu:");
			System.out.println("1. Add new student");
			System.out.println("2. Add new skill for a student");
			System.out.println("3. Delete student");
			System.out.println("4. Delete skill for a student");
			System.out.println("5. Display all students with given skill");
			System.out.println("6. Display all students with given degree");
			System.out.println("7. Exit");
			System.out.print("Enter choice: ");
			int ch = sc.nextInt();
			sc.nextLine();

			switch (ch) {
			case 1:
				System.out.print("Enter Student ID: ");
				int sid = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Name: ");
				String name = sc.nextLine();
				System.out.print("Enter Birthdate: ");
				String bdate = sc.nextLine();
				System.out.print("Enter Degree: ");
				String degree = sc.nextLine();
				System.out.print("Enter Marks: ");
				double marks = sc.nextDouble();
				sc.nextLine();
				Student s = new Student(sid, name, bdate, degree, marks);
				studentSkills.put(s, new HashSet<>());
				break;

			case 2:
				System.out.print("Enter Student ID: ");
				int sidSkill = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Skill: ");
				String skill = sc.nextLine();
				for (Student st : studentSkills.keySet()) {
					if (st.sid == sidSkill) {
						studentSkills.get(st).add(skill);
					}
				}
				break;

			case 3:
				System.out.print("Enter Student ID to delete: ");
				int delSid = sc.nextInt();
				studentSkills.entrySet().removeIf(entry -> entry.getKey().sid == delSid);
				break;

			case 4:
				System.out.print("Enter Student ID: ");
				int sidDelSkill = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Skill to delete: ");
				String delSkill = sc.nextLine();
				for (Student st : studentSkills.keySet()) {
					if (st.sid == sidDelSkill) {
						studentSkills.get(st).remove(delSkill);
					}
				}
				break;

			case 5:
				System.out.print("Enter Skill: ");
				String searchSkill = sc.nextLine();
				for (Map.Entry<Student, Set<String>> entry : studentSkills.entrySet()) {
					if (entry.getValue().contains(searchSkill)) {
						System.out.println(entry.getKey());
					}
				}
				break;

			case 6:
				System.out.print("Enter Degree: ");
				String searchDegree = sc.nextLine();
				for (Student st : studentSkills.keySet()) {
					if (st.degree.equalsIgnoreCase(searchDegree)) {
						System.out.println(st);
					}
				}
				break;

			case 7:
				System.out.println("Exiting...");
				return;
			}
		}
	}
}
