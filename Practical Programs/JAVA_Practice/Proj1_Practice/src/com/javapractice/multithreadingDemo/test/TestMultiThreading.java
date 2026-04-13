package com.javapractice.multithreadingDemo.test;

import com.javapractice.multithreadingDemo.model.MyClass;
import com.javapractice.multithreadingDemo.thread.FactorialThread;
import com.javapractice.multithreadingDemo.thread.PrintTableThread;

public class TestMultiThreading {

	public static void main(String[] args) {
		MyClass ob = new MyClass();
		MyClass ob1 = new MyClass();
		MyClass ob2 = new MyClass();
		PrintTableThread th1 = new PrintTableThread(ob, 3);
		th1.start();
		th1.setName("myth1");
		th1.setPriority(Thread.MAX_PRIORITY - 2);
		PrintTableThread th2 = new PrintTableThread(ob1, 7);
		th2.start();
		// th1.start(); //runtime exception IllegalTreadStateException
		FactorialThread fth1 = new FactorialThread(ob2, 5);
		Thread th = new Thread(fth1);
		th.start();
		try {
			th1.join();
			th2.join();
			th.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("resume task of main");
		System.out.println("main task ends");

	}

}
