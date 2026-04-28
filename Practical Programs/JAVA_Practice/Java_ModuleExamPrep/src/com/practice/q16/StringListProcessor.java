package com.practice.q16;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Q16. Design Java application to accept strings from user and store it in an ArrayList. 
Perform following operations: 
- Find all strings with repeated characters → list2  
- Find all strings with no vowels → list3  
- Display both lists  
- Write list2 into "repeat.txt"  
- Write list3 into "novowel.txt" 
 */
public class StringListProcessor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>(); // Strings with repeated characters
		ArrayList<String> list3 = new ArrayList<>(); // Strings with no vowels

		System.out.println("Enter strings (type 'stop' to finish):");
		while (true) {
			String input = sc.nextLine();
			if (input.equalsIgnoreCase("stop")) {
				break;
			}
			list.add(input);
		}

		// Process strings
		for (String str : list) {
			if (hasRepeatedCharacters(str)) {
				list2.add(str);
			}
			if (!hasVowel(str)) {
				list3.add(str);
			}
		}

		// Display both lists
		System.out.println("\nStrings with repeated characters (list2): " + list2);
		System.out.println("Strings with no vowels (list3): " + list3);

		// Write to files
		writeToFile("repeat.txt", list2);
		writeToFile("novowel.txt", list3);

		System.out.println("\nData written to repeat.txt and novowel.txt successfully.");
	}

	// Check if string has repeated characters
	private static boolean hasRepeatedCharacters(String str) {
		Set<Character> seen = new HashSet<>();
		for (char c : str.toCharArray()) {
			if (seen.contains(c)) {
				return true;
			}
			seen.add(c);
		}
		return false;
	}

	// Check if string has any vowel
	private static boolean hasVowel(String str) {
		String vowels = "aeiouAEIOU";
		for (char c : str.toCharArray()) {
			if (vowels.indexOf(c) != -1) {
				return true;
			}
		}
		return false;
	}

	// Write list to file
	private static void writeToFile(String filename, ArrayList<String> list) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
			for (String s : list) {
				bw.write(s);
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error writing to file: " + filename);
		}
	}
}
