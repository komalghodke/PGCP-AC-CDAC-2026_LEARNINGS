package com.dsa.prep;

import java.util.Scanner;

public class SequentialSearch {
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

		System.out.println("Enter value to search:");
		int sval = sc.nextInt();
		int spos = -1;

		for (int i = 0; i < count; i++) {
			if (arr[i] == sval) {
				spos = i;
				break;
			}
		}

		if (spos != -1) {
			System.out.println("Value found at position: " + spos);
		} else {
			System.out.println("Value not found");
		}

		sc.close();
	}
}
