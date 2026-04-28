package com.practice.q19;

import java.util.Arrays;

/*
 * Q19.Given an integer array nums, return an array output such that: 
output[i] = product of all elements except nums[i] 
- Do not use division  
- Solve in O(n)  
Input: [1,2,3,4] 
Output: [24,12,8,6]
 */
public class ProductArray {
	public static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] output = new int[n];
		int[] left = new int[n];
		int[] right = new int[n];

		// Left products
		left[0] = 1;
		for (int i = 1; i < n; i++) {
			left[i] = left[i - 1] * nums[i - 1];
		}

		// Right products
		right[n - 1] = 1;
		for (int i = n - 2; i >= 0; i--) {
			right[i] = right[i + 1] * nums[i + 1];
		}

		// Final output
		for (int i = 0; i < n; i++) {
			output[i] = left[i] * right[i];
		}

		return output;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		int[] result = productExceptSelf(nums);

		System.out.println("Input: " + Arrays.toString(nums));
		System.out.println("Output: " + Arrays.toString(result));
	}
}
