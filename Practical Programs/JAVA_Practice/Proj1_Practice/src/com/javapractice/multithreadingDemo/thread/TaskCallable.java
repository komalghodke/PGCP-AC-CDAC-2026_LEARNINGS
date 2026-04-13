package com.javapractice.multithreadingDemo.thread;

import java.util.concurrent.Callable;

public class TaskCallable implements Callable<Integer> {
	private int start;
	private int end;

	public TaskCallable(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

	@Override
	public Integer call() throws Exception {
		int s = 0;
		for (int i = start; i <= end; i++) {
			s = s + i;
		}
		return s;
	}
}
