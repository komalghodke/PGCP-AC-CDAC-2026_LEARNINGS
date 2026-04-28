package com.practice.q12;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*Q12. Design Java application to accept strings from user and store it in an ArrayList. 
Perform following operations: 
- Find all strings containing substring "java" → list2  
- Find all strings in uppercase → list3  
- Display both lists  
- Write list2 into "java.txt"  
- Write list3 into "upper.txt
 */
public class Q12 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list1 = new ArrayList<>();

		// Step 1: Accept strings
		System.out.println("Enter strings (type 'stop' to finish):");
		while (true) {
			String input = sc.nextLine();
			if (input.equalsIgnoreCase("stop"))
				break;
			list1.add(input);
		}

		// Step 2: Find strings containing substring "java"
		ArrayList<String> list2 = new ArrayList<>();
		for (String s : list1) {
			if (s.toLowerCase().contains("java"))
				list2.add(s);
		}

		// Step 3: Find strings in uppercase
		ArrayList<String> list3 = new ArrayList<>();
		for (String s : list1) {
			if (s.equals(s.toUpperCase()))
				list3.add(s);
		}

		// Step 4: Display both lists
		System.out.println("List2 (contains 'java'): " + list2);
		System.out.println("List3 (uppercase strings): " + list3);

		// Step 5: Write to files
		try (PrintWriter pw = new PrintWriter("java.txt")) {
			for (String s : list2)
				pw.println(s);
		}
		try (PrintWriter pw = new PrintWriter("upper.txt")) {
			for (String s : list3)
				pw.println(s);
		}

		System.out.println("Data written to java.txt and upper.txt successfully!");
	}
}
