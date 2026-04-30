package com.practice.q2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {
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
			if (s.length() > 5) {
				list2.add(s);
			}

//			"aeiou".indexOf('a')  → 0
//			"aeiou".indexOf('e')  → 1
//			"aeiou".indexOf('x')  → -1
			char ch = s.charAt(0);
			if ("aeiouAEIOU".indexOf(ch) != -1) {
				list3.add(s);
			}
		}
		System.out.println("List2 (length > 5): " + list2);
		System.out.println("List3 (starts with vowel): " + list3);

		FileWriter fw1 = new FileWriter("data1.txt");

		for (String s : list2) {
			fw1.write(s + "\n");
		}

		fw1.close();

		FileWriter fw2 = new FileWriter("data2.txt");

		for (String s : list3) {
			fw2.write(s + "\n");
		}

		fw2.close();
	}
}
