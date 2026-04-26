package com.dsa.search;

public class SearchingService {
	public static int sequentialSearch(int[] arr, int searchnum) {
		for (int i = 0; i < arr.length; i++) {
			if (searchnum == arr[i]) {
				return i;
			}
		}
		return -1;
	}

	public static int binarySearchNonRecurssive(int[] arr, int target) {
		int low = 0, high = arr.length - 1;
		int cnt = 0;
		while (low <= high) {
			int mid = (low + high) / 2;
			cnt++;
			System.out.println("low: " + low + " high: " + high + " mid: " + mid);
			if (arr[mid] == target) {
				System.out.println("number of comparisons : " + cnt);
				return mid;
			} else if (target > arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		System.out.println("number of comparisons : " + cnt);
		return -1;
	}

	public static int binarySearchRecurssive(int[] arr, int searchnum, int low, int high) {
		System.out.println("binary search called low: " + low + " High: " + high);
		if (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == searchnum) {
				return mid;
			} else if (searchnum < arr[mid]) {
				return binarySearchRecurssive(arr, searchnum, low, mid - 1);
			} else {
				return binarySearchRecurssive(arr, searchnum, mid + 1, high);
			}
		}
		return -1;
	}
	
	
}
