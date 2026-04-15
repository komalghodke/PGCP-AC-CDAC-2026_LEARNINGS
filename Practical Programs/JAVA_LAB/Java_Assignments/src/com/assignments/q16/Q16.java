package com.assignments.q16;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * Q16. Write a Java program by using ExecutorService for finding addition of 51 numbers.
 * - Create a task for finding addition of 3 numbers and return it.
 * - Create ExecutorService with thread pool of size 5 then submit tasks to ExecutorService.
 * - Add all Futures to get the final addition.
 */

class AddTask implements Callable<Integer> {
	private int a, b, c;

	public AddTask(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public Integer call() {
		return a + b + c;
	}
}

public class Q16 {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);

		List<Future<Integer>> futures = new ArrayList<>();

		int[] numbers = new int[51];
		for (int i = 0; i < 51; i++) {
			numbers[i] = i + 1;
		}

		for (int i = 0; i < numbers.length; i += 3) {
			int a = numbers[i];
			int b = (i + 1 < numbers.length) ? numbers[i + 1] : 0;
			int c = (i + 2 < numbers.length) ? numbers[i + 2] : 0;

			Future<Integer> future = executor.submit(new AddTask(a, b, c));
			futures.add(future);
		}

		int totalSum = 0;
		for (Future<Integer> f : futures) {
			try {
				totalSum += f.get();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		executor.shutdown();

		System.out.println("Total sum of 51 numbers = " + totalSum);
	}
}
