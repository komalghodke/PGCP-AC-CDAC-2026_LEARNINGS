package com.practice.q14;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/*
 * Q14. Design Java application to accept strings from user and store it in a Stack. 
Perform following operations: 
• Find all palindrome strings → list2 
• Find all strings with spaces → list3 
• Display both lists 
• Write list2 into "palin.txt" 
• Write list3 into "space.txt"  
 */
public class PalindromeSpaceApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> stack = new Stack<>();
		List<String> list2 = new ArrayList<>(); // Palindromes
		List<String> list3 = new ArrayList<>(); // Strings with spaces

		// Accept strings from user
		System.out.println("Enter strings (type 'STOP' to finish):");
		while (true) {
			String input = sc.nextLine();
			if (input.equalsIgnoreCase("STOP"))
				break;
			stack.push(input);
		}

		// Process stack
		while (!stack.isEmpty()) {
			String str = stack.pop();

			// Check palindrome
			if (isPalindrome(str)) {
				list2.add(str);
			}

			// Check if contains spaces
			if (str.contains(" ")) {
				list3.add(str);
			}
		}

		// Display both lists
		System.out.println("\nPalindrome Strings (list2):");
		list2.forEach(System.out::println);

		System.out.println("\nStrings with Spaces (list3):");
		list3.forEach(System.out::println);

		// Write to files
		writeToFile("palin.txt", list2);
		writeToFile("space.txt", list3);

		System.out.println("\nData written to palin.txt and space.txt successfully.");
	}

	// Utility: check palindrome
	private static boolean isPalindrome(String str) {
		String clean = str.replaceAll("\\s+", "").toLowerCase();
		return new StringBuilder(clean).reverse().toString().equals(clean);
	}

	// Utility: write list to file
	private static void writeToFile(String filename, List<String> list) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
			for (String s : list) {
				bw.write(s);
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error writing to " + filename + ": " + e.getMessage());
		}
	}
}
