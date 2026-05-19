package com.dsa.prep;

import java.util.Scanner;

public class MyArray {

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

		// ADD AT ANY POSITION
		System.out.println("Enter a position to insert new element: ");
		int pos = sc.nextInt();
		System.out.println("Enter the Value to insert: ");
		int val = sc.nextInt();
		for (int i = count; i > pos; i--) {
			System.out.println("current count: " + count + " | Arr[i] is: " + arr[i] + " | Arr[i-1] is: " + arr[i - 1]);
			arr[i] = arr[i - 1];
		}
		arr[pos] = val;
		System.out.println("pos: " + pos + " | val: " + val + " | count: " + count);
		count++;
		System.out.println("pos: " + pos + " | val: " + val + " | count: " + count);

		System.out.println("ARRAY after insertion in between : " + pos);
		displayArr(count, arr);

		// Delete By position
		System.out.println("Enter the position to delete the element: ");
		int dpos = sc.nextInt();
		for (int i = dpos; i < count - 1; i++) {
			arr[i] = arr[i + 1];
		}
		System.out.println("pos: " + dpos + " | val: " + arr[dpos] + " | count: " + count);
		count--;
		System.out.println("pos: " + dpos + " | val: " + arr[dpos] + " | count: " + count);

		System.out.println("ARRAY after deletion by pos : " + dpos);
		displayArr(count, arr);

		// Delete By Value
		System.out.println("Enter the Value to delete: ");
		int dval = sc.nextInt();
		int vpos = -1;
		for (int i = 0; i < count; i++) {
			if (arr[i] == dval) {
				vpos = i;
				break;
			}
		}

		if (vpos != -1) {
			for (int i = vpos; i < count - 1; i++) {
				arr[i] = arr[i + 1];
			}
			count--;
		} else {
			System.out.println("VALUE NOT FOUND");
		}

		System.out.println("ARRAY after deletion by val : " + dval);
		displayArr(count, arr);

		// REVERSE ARRAY
		int start = 0;
		int end = count - 1;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

		System.out.println("REVERSED ARRAY: ");
		displayArr(count, arr);

		// LEFT ROTATE BY 1
		// saved first element
		int temp = arr[0];
		// shift LEFT
		for (int i = 0; i < count - 1; i++) {
			arr[i] = arr[i + 1];
		}
		// put first element at end
		arr[count - 1] = temp;

		System.out.println("ARRAY after Rotate LEFT BY 1: ");
		displayArr(count, arr);

		// RIGHT ROTATE BY 1
		// saved last element
		int tmp = arr[count - 1];
		// SHIFT RIGHT
		for (int i = count - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		// insert saved value
		arr[0] = tmp;

		System.out.println("ARRAY after Rotate RIGHT BY 1: ");
		displayArr(count, arr);

		sc.close();
	}

}
