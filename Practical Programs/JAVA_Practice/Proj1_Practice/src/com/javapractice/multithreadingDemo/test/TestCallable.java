package com.javapractice.multithreadingDemo.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import com.javapractice.multithreadingDemo.thread.TaskCallable;

public class TestCallable {
	public static void main(String[] args) {
		TaskCallable ob = new TaskCallable(10, 20);

		FutureTask<Integer> f = new FutureTask<>(ob);

		Thread th = new Thread(f);
		th.start();
		try {
			int result = f.get();
			System.out.println("Result: " + result);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
