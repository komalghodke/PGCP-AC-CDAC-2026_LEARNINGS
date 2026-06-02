package com.dsa.prep;

import java.util.Scanner;

public class NonRecBinarySearch {

	private static void displayArr(int count, int[] arr) {
		for (int i = 0; i < count; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the capacity:");
		int capacity = sc.nextInt();

		int arr[] = new int[capacity];

		System.out.println("Enter number of Elements:");
		int n = sc.nextInt();

		int count = 0;

		// ADD OPERATION
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the element: ");
			arr[count] = sc.nextInt();
			count++;
		}

		// DISPLAY USING COUNT
		System.out.println("ARRAY IS: ");
		displayArr(count, arr);

		System.out.println("Enter a element to search:");
		int val = sc.nextInt();
		int pos = -1;
		int start = 0;
		int end = count - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == val) {
				pos = mid;
				break;
			} else if (val > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		if (pos != -1) {
			System.out.println("Value " + val + " found at position " + pos);
		} else {
			System.out.println("NOT FOUND " + val);
		}

		sc.close();
	}

}
