package com.javapractice.multithreadingDemo.test;
import com.javapractice.multithreadingDemo.model.MyStorage;
import com.javapractice.multithreadingDemo.thread.Consumer;
import com.javapractice.multithreadingDemo.thread.Producer;

public class TestProducerConsumer {
	public static void main(String[] args) {
		MyStorage ob = new MyStorage();
		Producer p = new Producer(ob);
		Consumer c = new Consumer(ob);
		p.start();
		c.start();
	}
}
