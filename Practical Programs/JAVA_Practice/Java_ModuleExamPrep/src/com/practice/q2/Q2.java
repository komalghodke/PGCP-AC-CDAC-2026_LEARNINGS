package com.practice.q2;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Q2. Design Java application to accept strings from user and store it in an ArrayList. 
Perform following operations: 
- Find all strings with length > 5 and store it in list2  
- Find all strings starting with vowel and store it in list3  
- Display both lists  
- Write all strings from list2 into file "data1.txt"  
- Write all strings from list3 into file "data2.txt"  
 */
public class Q2 {
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

		// Step 2: Find strings with length > 5
		List<String> list2 = new ArrayList<>();
		for (String s : list1) {
			if (s.length() > 5)
				list2.add(s);
		}

		// Step 3: Find strings starting with vowel
		List<String> list3 = new ArrayList<>();
		for (String s : list1) {
			char first = Character.toLowerCase(s.charAt(0));
			if ("aeiou".indexOf(first) != -1)
				list3.add(s);
		}

		// Step 4: Display both lists
		System.out.println("List2 (len > 5): " + list2);
		System.out.println("List3 (starts with vowel): " + list3);

		// Step 5: Write to files
		try (PrintWriter pw = new PrintWriter("data1.txt")) {
			for (String s : list2)
				pw.println(s);
		}
		try (PrintWriter pw = new PrintWriter("data2.txt")) {
			for (String s : list3)
				pw.println(s);
		}

		System.out.println("Data written to data1.txt and data2.txt successfully!");
		sc.close();
	}
}
