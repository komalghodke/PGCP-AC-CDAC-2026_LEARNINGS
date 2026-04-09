package com.assignments.q10;

import java.util.Enumeration;
import java.util.Vector;

/*
Q10.
Write a java program to create a Vector for storing Strings.
Use Enumerator to navigate through Vector.
*/
public class VectorEnumDemo {
	public static void main(String[] args) {
		Vector<String> vec = new Vector<>();

		vec.add("Mango");
		vec.add("Apple");
		vec.add("Banana");
		vec.add("Neem");
		vec.add("Peepal");

		Enumeration<String> e = vec.elements();

		System.out.println("Navigating Vector using Enumeration:");
		while (e.hasMoreElements()) {
			String str = e.nextElement();
			System.out.println(str);
		}
	}
}
