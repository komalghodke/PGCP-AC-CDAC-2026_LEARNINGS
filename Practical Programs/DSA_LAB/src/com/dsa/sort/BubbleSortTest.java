package com.dsa.sort;

import java.util.stream.IntStream;

public class BubbleSortTest {
	public static void main(String[] args) {
		int[] arr = { 21, 2, 5, 1, 7, 8, 10, 3 };
		// BubbleSortAlgorithm.bubbleSort(arr);
		// BubbleSortAlgorithm.improvedbubbleSort(arr);
		BubbleSort.bubbleSortDescending(arr);
		IntStream.of(arr).forEach(n -> System.out.println(n));
	}
}
