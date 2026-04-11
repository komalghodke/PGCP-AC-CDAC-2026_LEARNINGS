package com.javapractice.CollectionDemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestCollections {
	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(5, 6, 7, 812, 34, 23, 56);
		System.out.println(lst);
		Collections.sort(lst);
		System.out.println(lst);
		System.out.println("Maximum: " + Collections.max(lst));
		System.out.println("Minimum: " + Collections.min(lst));
		for (int i = 0; i < 3; i++) {
			Collections.shuffle(lst);
			System.out.println(lst);
		}
		Collections.shuffle(lst);
		System.out.println(lst);
	}
}
