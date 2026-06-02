package com.dsa.sort;

import java.util.Arrays;

public class BubbleSort {
	public static void bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					// swap elements
					count++;
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println("iteration : " + i + " swap count: " + count);
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void bubbleSortDescending(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] < arr[j]) {
					// swap elements
					count++;
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
			System.out.println("iteration : " + i + " swap count: " + count);
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void improvedbubbleSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			boolean flag = false;
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					// swap element
					count++;
					flag = true;
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
			System.out.println("iteration : " + i + " swap count: " + count);
			System.out.println(Arrays.toString(arr));
			if (!flag) { // flag==false
				break;
			}
		}
	}
}
