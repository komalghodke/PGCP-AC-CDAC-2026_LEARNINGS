package com.javapractice.CollectionDemo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestHashSet {

	public static void main(String[] args) {
		Set<Integer> hs=new HashSet<>();
		hs.add(34);
		hs.add(30);
		hs.add(10);
		hs.add(100);
		System.out.println(hs.add(34));
		System.out.println(hs);
		Set<Integer> ts=new TreeSet<>();
		for(Integer ob:hs) {
			   ts.add(ob);
		}
       System.out.println(ts);
       ts.remove(100);
       System.out.println(ts);
	}
}