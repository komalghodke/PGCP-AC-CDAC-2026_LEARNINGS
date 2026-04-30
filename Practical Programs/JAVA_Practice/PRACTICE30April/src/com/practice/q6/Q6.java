package com.practice.q6;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) throws IOException {
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>(); // consonant-starting strings
		ArrayList<String> list3 = new ArrayList<>(); // palindrome strings

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of strings: ");
		int n = sc.nextInt();
		sc.nextLine(); // consume newline

		// Read strings
		for (int i = 0; i < n; i++) {
			System.out.print("Enter string " + (i + 1) + ": ");
			list.add(sc.nextLine());
		}

		// Process strings
		for (String s : list) {
			char ch = s.charAt(0);

			// consonant check (first character is a letter and not a vowel)
			if (Character.isLetter(ch) && "aeiouAEIOU".indexOf(ch) == -1) {
				list2.add(s);
			}

			// palindrome check (case-insensitive)
			String rev = new StringBuilder(s).reverse().toString();
			if (s.equalsIgnoreCase(rev)) {
				list3.add(s);
			}
		}

		// Display results
		System.out.println("Consonant list: " + list2);
		System.out.println("Palindrome list: " + list3);

		// Write consonant list to file
		try (FileWriter fw1 = new FileWriter("consonant.txt")) {
			for (String s : list2) {
				fw1.write(s + "\n");
			}
		}

		// Write palindrome list to file
		try (FileWriter fw2 = new FileWriter("palindrome.txt")) {
			for (String s : list3) {
				fw2.write(s + "\n");
			}
		}

		sc.close();
	}
}
