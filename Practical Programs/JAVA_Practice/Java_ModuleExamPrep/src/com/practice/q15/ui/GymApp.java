package com.practice.q15.ui;

import java.util.Scanner;

import com.practice.q15.dao.MemberDAOImpl;
import com.practice.q15.model.GymMember;
import com.practice.q15.model.PremiumMember;
import com.practice.q15.model.RegularMember;
import com.practice.q15.service.MemberService;
import com.practice.q15.service.MemberServiceImpl;

/*
 * Q15. Design Java application for the following 
Design Java application for the following 
Create a class GymMember to store following details 
memberId, memberName, planType, fees, status 
Members are of 2 types 
Regular Member, Premium Member 
For Regular Member store trainerName and workoutHours 
For Premium Member add dietPlan and personalTrainer 
Store details of members in a LinkedHashMap where memberId is key. 
Display following menu 
a. Add new Member 
b. Remove member using memberId 
c. Update member fees 
d. Activate/Deactivate membership 
e. Assign membership based on planType and fees 
f. Display all members 
g. Display members by type 
h. Display members with fees greater than given value 
i. Sort members by fees 
j. Search member by name 
k. Exit 
 */
public class GymApp {
	private static Scanner sc = new Scanner(System.in);
	private static MemberService memberService = new MemberServiceImpl(new MemberDAOImpl());

	public static void main(String[] args) {
		while (true) {
			System.out.println("\n--- Gym Menu ---");
			System.out.println("a. Add new Member");
			System.out.println("b. Remove member using memberId");
			System.out.println("c. Update member fees");
			System.out.println("d. Activate/Deactivate membership");
			System.out.println("e. Assign membership based on planType and fees");
			System.out.println("f. Display all members");
			System.out.println("g. Display members by type");
			System.out.println("h. Display members with fees greater than given value");
			System.out.println("i. Sort members by fees");
			System.out.println("j. Search member by name");
			System.out.println("k. Exit");
			System.out.print("Choose option: ");
			char choice = sc.next().charAt(0);

			switch (choice) {
			case 'a':
				addMember();
				break;
			case 'b':
				removeMember();
				break;
			case 'c':
				updateFees();
				break;
			case 'd':
				toggleStatus();
				break;
			case 'e':
				assignMembership();
				break;
			case 'f':
				displayAll();
				break;
			case 'g':
				displayByType();
				break;
			case 'h':
				displayByFees();
				break;
			case 'i':
				sortByFees();
				break;
			case 'j':
				searchByName();
				break;
			case 'k':
				System.exit(0);
			default:
				System.out.println("Invalid choice!");
			}
		}
	}

	private static void addMember() {
		System.out.print("Enter MemberId: ");
		int id = sc.nextInt();
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("PlanType (Regular/Premium): ");
		String plan = sc.next();
		System.out.print("Fees: ");
		double fees = sc.nextDouble();
		String status = "Active";

		if (plan.equalsIgnoreCase("Regular")) {
			System.out.print("Trainer Name: ");
			String trainer = sc.next();
			System.out.print("Workout Hours: ");
			int hours = sc.nextInt();
			memberService.addMember(new RegularMember(id, name, plan, fees, status, trainer, hours));
		} else {
			System.out.print("Diet Plan: ");
			String diet = sc.next();
			System.out.print("Personal Trainer: ");
			String pt = sc.next();
			memberService.addMember(new PremiumMember(id, name, plan, fees, status, diet, pt));
		}
	}

	private static void removeMember() {
		System.out.print("Enter memberId to remove: ");
		int id = sc.nextInt();
		memberService.removeMember(id);
	}

	private static void updateFees() {
		System.out.print("Enter memberId: ");
		int id = sc.nextInt();
		System.out.print("Enter new fees: ");
		double fees = sc.nextDouble();
		memberService.updateFees(id, fees);
	}

	private static void toggleStatus() {
		System.out.print("Enter memberId: ");
		int id = sc.nextInt();
		memberService.toggleStatus(id);
	}

	private static void assignMembership() {
		System.out.print("Enter memberId: ");
		int id = sc.nextInt();
		memberService.assignMembership(id);
	}

	private static void displayAll() {
		memberService.getAllMembers().forEach(System.out::println);
	}

	private static void displayByType() {
		System.out.print("Enter type (Regular/Premium): ");
		String type = sc.next();
		memberService.getMembersByType(type).forEach(System.out::println);
	}

	private static void displayByFees() {
		System.out.print("Enter minimum fees: ");
		double min = sc.nextDouble();
		memberService.getMembersByFees(min).forEach(System.out::println);
	}

	private static void sortByFees() {
		memberService.sortByFees().forEach(System.out::println);
	}

	private static void searchByName() {
		System.out.print("Enter member name: ");
		String name = sc.next();
		GymMember gm = memberService.searchByName(name);
		if (gm != null) {
			System.out.println(gm);
		} else {
			System.out.println("Member not found.");
		}
	}
}
