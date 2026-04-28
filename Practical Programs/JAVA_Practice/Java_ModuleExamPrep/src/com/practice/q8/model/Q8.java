package com.practice.q8.model;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Vector;

/*
 * Q8. Design Java application to accept strings from user and store it in a Vector. 
Perform following operations: 
• Find all uppercase strings → list2 
• Find all strings ending with vowel → list3 
• Display both lists 
• Write list2 into "upper.txt" 
• Write list3 into "vowel.txt" 
 */
public class Q8 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Vector<String> list1 = new Vector<>();

		// Step 1: Accept strings
		System.out.println("Enter strings (type 'stop' to finish):");
		while (true) {
			String input = sc.nextLine();
			if (input.equalsIgnoreCase("stop"))
				break;
			list1.add(input);
		}

		// Step 2: Find uppercase strings
		Vector<String> list2 = new Vector<>();
		for (String s : list1) {
			if (s.equals(s.toUpperCase()))
				list2.add(s);
		}

		// Step 3: Find strings ending with vowel
		Vector<String> list3 = new Vector<>();
		for (String s : list1) {
			char last = Character.toLowerCase(s.charAt(s.length() - 1));
			if ("aeiou".indexOf(last) != -1)
				list3.add(s);
		}

		// Step 4: Display both lists
		System.out.println("List2 (uppercase strings): " + list2);
		System.out.println("List3 (strings ending with vowel): " + list3);

		// Step 5: Write to files
		try (PrintWriter pw = new PrintWriter("upper.txt")) {
			for (String s : list2)
				pw.println(s);
		}
		try (PrintWriter pw = new PrintWriter("vowel.txt")) {
			for (String s : list3)
				pw.println(s);
		}

		System.out.println("Data written to upper.txt and vowel.txt successfully!");
	}
}
