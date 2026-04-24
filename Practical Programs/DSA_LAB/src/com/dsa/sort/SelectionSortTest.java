package com.dsa.sort;

import java.util.Arrays;

public class SelectionSortTest {
	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			// swap
			if (minIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
			System.out.println("iteration " + i + ": " + Arrays.toString(arr));
		}
	}

	public static void main(String[] args) {
		int[] arr = { 64, 25, 12, 22, 11 };
		System.out.println("Original: " + Arrays.toString(arr));
		selectionSort(arr);
		System.out.println("Sorted: " + Arrays.toString(arr));
	}

}
