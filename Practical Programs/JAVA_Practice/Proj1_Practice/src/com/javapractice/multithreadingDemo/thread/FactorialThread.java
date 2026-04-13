package com.javapractice.multithreadingDemo.thread;

import com.javapractice.multithreadingDemo.model.MyClass;

public class FactorialThread implements Runnable {
	private MyClass ob;
	private int n;

	public FactorialThread(MyClass ob, int n) {
		super();
		this.ob = ob;
		this.n = n;
	}

	public void run() {
		System.out.println("Factorial :" + ob.factorial(n));
	}

}
