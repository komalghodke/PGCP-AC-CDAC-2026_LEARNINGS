package com.dsa.array;

import java.util.stream.IntStream;

public class TestArray {
	public static void main(String[] args) {
		MyArray ob = new MyArray();
		System.out.println(ob.getCapacity());
		ob.add(4);
		ob.add(5);
		System.out.println(ob);
		ob.add(8, 1);
		ob.add(9, 1);
		System.out.println(ob);
		System.out.println("position of 9" + ob.searchByValue(9));
		ob.add(3);
		ob.add(5);
		System.out.println(ob);
		ob.deleteByValue(5);
		System.out.println("after deleting 5 " + ob);
		ob.deleteByPosition(3);
		System.out.println("after deleting 5 " + ob);
		int[] arr1 = ob.exchangeIndexValue();
		IntStream.of(arr1).forEach(e -> System.out.println(e));
		arr1 = ob.reverseArray(true);
		System.out.println("original array" + ob);
		IntStream.of(arr1).forEach(e -> System.out.println(e));
	}
}
