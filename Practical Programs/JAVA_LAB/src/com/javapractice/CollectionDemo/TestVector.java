package com.javapractice.CollectionDemo;

import java.util.List;
import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		List<Integer> v = new Vector<>(20, 5);
		v.add(10);
		v.add(20);
		v.add(30);
		System.out.println("capacity : " + ((Vector<Integer>) v).capacity());
		System.out.println("size : " + ((Vector<Integer>) v).size());
		for (int i = 1; i <= 10; i++) {
			v.add(100 + i);
		}
		System.out.println("capacity : " + ((Vector<Integer>) v).capacity());
		System.out.println("size : " + ((Vector<Integer>) v).size());
		System.out.println(v);
		for (int i = 1; i <= 10; i++) {
			v.add(100 + i);
		}
		System.out.println("capacity : " + ((Vector<Integer>) v).capacity());
		System.out.println("size : " + ((Vector<Integer>) v).size());
		System.out.println(v);
	}

}
