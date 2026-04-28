package com.practice.q17;

import java.util.HashSet;
import java.util.Set;

/*
 * Q17.Given a string s, find the length of the longest substring without repeating characters. 
Input: "abcabcbb" 
Output: 3 
Explanation: "abc" 
 */
public class LongestSubstring {
	public static int lengthOfLongestSubstring(String s) {
		Set<Character> seen = new HashSet<>();
		int left = 0, maxLength = 0;

		for (int right = 0; right < s.length(); right++) {
			char c = s.charAt(right);

			// If character already seen, shrink window from left
			while (seen.contains(c)) {
				seen.remove(s.charAt(left));
				left++;
			}

			seen.add(c);
			maxLength = Math.max(maxLength, right - left + 1);
		}

		return maxLength;
	}

	public static void main(String[] args) {
		String input = "abcabcbb";
		int result = lengthOfLongestSubstring(input);
		System.out.println("Input: " + input);
		System.out.println("Output: " + result);
	}
}
