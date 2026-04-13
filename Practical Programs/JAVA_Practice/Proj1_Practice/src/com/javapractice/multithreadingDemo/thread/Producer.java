package com.javapractice.multithreadingDemo.thread;

import com.javapractice.multithreadingDemo.model.MyStorage;

public class Producer extends Thread {
	private MyStorage ob;
	   
	public Producer(MyStorage ob) {
	super();
	this.ob = ob;
}

	public void run() {
		for(int i=0;i<10;i++) {
			ob.put(i);
		}
	}
}
