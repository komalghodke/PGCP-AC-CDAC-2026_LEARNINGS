package com.javapractice.multithreadingDemo.thread;

import com.javapractice.multithreadingDemo.model.MyStorage;

public class Consumer extends Thread {
	private MyStorage ob;

	public Consumer(MyStorage ob) {
		super();
		this.ob = ob;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			ob.get();
		}
	}
}
