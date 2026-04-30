package com.practice.q8;

import java.util.HashSet;
import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		System.out.println("Enter a string:");
		Scanner sc = new Scanner(System.in);
		//String s = "abcabcbb";
		String s = sc.next();

		HashSet<Character> set = new HashSet<>();

		int i = 0, j = 0, max = 0;

		while (j < s.length()) {

			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j));
				max = Math.max(max, set.size());
				j++;
			} else {
				set.remove(s.charAt(i));
				i++;
			}
		}

		System.out.println(max);
	}
}
