package com.javapractice.CollectionDemo;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestBackedCollections {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(34);
		ts.add(23);
		ts.add(35);
		for (int i = 1; i < 20; i = i + 3) {
			ts.add(i);
		}
		System.out.println(ts);
		// headSet and tailSet uses backed collection, hence after this changes made to
		// treeset
		// wiil be reflected in tailSet and headSet
		SortedSet<Integer> heads = ts.headSet(16);
		System.out.println(heads);
		SortedSet<Integer> tails = ts.tailSet(16);
		System.out.println(tails);
		ts.add(12);
		ts.add(11);
		System.out.println(ts);
		System.out.println(heads);
		// in all types of collections total 12 of methods are there
		List<Integer> lst1 = List.of(5, 7, 9, 7, 8, 6);
		//lst1.add(40); //error //Immutable
		System.out.println(lst1);
	}

}
