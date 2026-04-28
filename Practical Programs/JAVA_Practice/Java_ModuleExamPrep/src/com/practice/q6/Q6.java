package com.practice.q6;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Q6. Design Java application to accept strings from user and store it in an ArrayList. 
Perform following operations:
- Find all strings starting with consonant → list2  
- Find all palindrome strings → list3  
- Display both lists  
- Write list2 into "consonant.txt"  
- Write list3 into "palindrome.txt" 
 */

public class Q6 {
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

		// Step 2: Find strings starting with consonant
		List<String> list2 = new ArrayList<>();
		for (String s : list1) {
			char first = Character.toLowerCase(s.charAt(0));
			if (Character.isLetter(first) && "aeiou".indexOf(first) == -1) {
				list2.add(s);
			}
		}

		// Step 3: Find palindrome strings
		List<String> list3 = new ArrayList<>();
		for (String s : list1) {
			String rev = new StringBuilder(s).reverse().toString();
			if (s.equalsIgnoreCase(rev))
				list3.add(s);
		}

		// Step 4: Display both lists
		System.out.println("List2 (starts with consonant): " + list2);
		System.out.println("List3 (palindromes): " + list3);

		// Step 5: Write to files
		try (PrintWriter pw = new PrintWriter("consonant.txt")) {
			for (String s : list2)
				pw.println(s);
		}
		try (PrintWriter pw = new PrintWriter("palindrome.txt")) {
			for (String s : list3)
				pw.println(s);
		}

		System.out.println("Data written to consonant.txt and palindrome.txt successfully!");
	}
}