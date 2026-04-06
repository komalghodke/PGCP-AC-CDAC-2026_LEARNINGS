package com.javapractice.CollectionDemo;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		List<Integer> v = new ArrayList<>(20);
		v.add(10);
		v.add(20);
		v.add(30);

		System.out.println("size : " + v.size());
		for (int i = 1; i <= 10; i++) {
			v.add(100 + i);
		}

		System.out.println("size : " + v.size());
		System.out.println(v);
		for (int i = 1; i <= 10; i++) {
			v.add(100 + i);
		}

		System.out.println("size : " + v.size());
		System.out.println(v);
		v.remove(5);
		v.remove(new Integer(100));
		v.contains(101);
	}

}
