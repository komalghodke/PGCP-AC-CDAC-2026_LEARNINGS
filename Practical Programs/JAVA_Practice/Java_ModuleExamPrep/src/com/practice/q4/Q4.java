package com.practice.q4;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Q4. Design Java application to accept strings from user and store it in an ArrayList. 
Perform following operations: 
- Find all strings with length < 4 → store in list2  
- Find all strings containing digits → store in list3  
- Display both lists  
- Write list2 into "small.txt"  
- Write list3 into "digits.txt" 
 */
public class Q4 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		List<String> list1 = new ArrayList<>();

		// Step 1: Accept strings
		System.out.println("Enter strings (type 'stop' to finish):");
		while (true) {
			String input = sc.nextLine();
			if (input.equalsIgnoreCase("stop"))
				break;
			list1.add(input);
		}

		// Step 2: Find strings with length < 4
		List<String> list2 = new ArrayList<>();
		for (String s : list1) {
			if (s.length() < 4)
				list2.add(s);
		}

		// Step 3: Find strings containing digits
		List<String> list3 = new ArrayList<>();
		for (String s : list1) {
			if (s.matches(".*\\d.*"))
				list3.add(s); // regex: contains at least one digit
		}

		// Step 4: Display both lists
		System.out.println("List2 (len < 4): " + list2);
		System.out.println("List3 (contains digits): " + list3);

		// Step 5: Write to files
		try (PrintWriter pw = new PrintWriter("small.txt")) {
			for (String s : list2)
				pw.println(s);
		}
		try (PrintWriter pw = new PrintWriter("digits.txt")) {
			for (String s : list3)
				pw.println(s);
		}

		System.out.println("Data written to small.txt and digits.txt successfully!");
		sc.close();
	}
}
