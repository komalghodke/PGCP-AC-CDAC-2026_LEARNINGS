package com.practice.q10;

import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * Q10. Design Java application to accept strings from user and store it in a LinkedList. 
Perform following operations: 
• Find all strings starting and ending with same character → list2 
• Find all strings with only digits → list3 
• Display both lists 
• Write list2 into "samechar.txt" 
• Write list3 into "digits.txt" 

 */
public class Q10 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		LinkedList<String> list1 = new LinkedList<>();

		// Step 1: Accept strings
		System.out.println("Enter strings (type 'stop' to finish):");
		while (true) {
			String input = sc.nextLine();
			if (input.equalsIgnoreCase("stop"))
				break;
			list1.add(input);
		}

		// Step 2: Find strings starting and ending with same character
		LinkedList<String> list2 = new LinkedList<>();
		for (String s : list1) {
			if (s.length() > 0) {
				char first = Character.toLowerCase(s.charAt(0));
				char last = Character.toLowerCase(s.charAt(s.length() - 1));
				if (first == last)
					list2.add(s);
			}
		}

		// Step 3: Find strings with only digits
		LinkedList<String> list3 = new LinkedList<>();
		for (String s : list1) {
			if (s.matches("\\d+"))
				list3.add(s); // regex: only digits
		}

		// Step 4: Display both lists
		System.out.println("List2 (same start & end char): " + list2);
		System.out.println("List3 (only digits): " + list3);

		// Step 5: Write to files
		try (PrintWriter pw = new PrintWriter("samechar.txt")) {
			for (String s : list2)
				pw.println(s);
		}
		try (PrintWriter pw = new PrintWriter("digits.txt")) {
			for (String s : list3)
				pw.println(s);
		}

		System.out.println("Data written to samechar.txt and digits.txt successfully!");
	}
}
