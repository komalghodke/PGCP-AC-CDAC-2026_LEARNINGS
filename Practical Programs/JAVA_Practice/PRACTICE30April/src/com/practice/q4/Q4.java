package com.practice.q4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) throws IOException {
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		ArrayList<String> list3 = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of strings:");
		int n = sc.nextInt();

		System.out.println("Enter strings:");
		for (int i = 0; i < n; i++) {
			list.add(sc.next());
		}

		for (String s : list) {

			// length < 4
			if (s.length() < 4) {
				list2.add(s);
			}

			// contains digit
			if (s.matches(".*\\d.*")) {
				list3.add(s);
			}
		}

		System.out.println("List2 (length < 4): " + list2);
		System.out.println("List3 (contains digits): " + list3);

		FileWriter fw1 = new FileWriter("small.txt");

		for (String s : list2) {
			fw1.write(s + "\n");
		}

		fw1.close();

		FileWriter fw2 = new FileWriter("digits.txt");

		for (String s : list3) {
			fw2.write(s + "\n");
		}

		fw2.close();

	}

}
