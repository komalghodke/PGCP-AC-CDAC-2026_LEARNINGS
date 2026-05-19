package com.dsa.prep;

public class RecursiveBinarySearch {

	static int binarySearch(int arr[], int start, int end, int key) {

		// BASE CONDITION
		if (start > end) {
			return -1;
		}

		int mid = (start + end) / 2;

		// FOUND
		if (arr[mid] == key) {
			return mid;
		}

		// SEARCH RIGHT
		else if (key > arr[mid]) {
			return binarySearch(arr, mid + 1, end, key);
		}

		// SEARCH LEFT
		else {
			return binarySearch(arr, start, mid - 1, key);
		}
	}

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50, 60, 70 };

		int result = binarySearch(arr, 0, arr.length - 1, 50);

		if (result != -1) {
			System.out.println("Found at position: " + result);
		} else {
			System.out.println("Not Found");
		}
	}
}
