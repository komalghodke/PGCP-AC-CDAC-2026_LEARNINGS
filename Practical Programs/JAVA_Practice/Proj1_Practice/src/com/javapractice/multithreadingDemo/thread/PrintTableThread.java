package com.javapractice.multithreadingDemo.thread;

import com.javapractice.multithreadingDemo.model.MyClass;

public class PrintTableThread extends Thread {
	private MyClass ob;
	private int n;

	public PrintTableThread(MyClass ob, int n) {
		super();
		this.ob = ob;
		this.n = n;
	}

	public void run() {
		ob.printTable(n);
	}
}