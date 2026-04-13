package com.javapractice.multithreadingDemo.model;

public class MyClass {
	synchronized public void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "*" + i + "=" + (n * i));
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}

	synchronized public int factorial(int n) {
		int f = 1;
		for (int i = 1; i <= n; i++) {
			f = f * i;
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return f;
	}
}
