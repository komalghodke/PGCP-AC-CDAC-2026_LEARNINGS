package com.assignments.q15;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

class Producer extends Thread {
	private ProductBuffer buffer;

	Producer(ProductBuffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("productdata.dat"))) {
			List<Product> products = (List<Product>) ois.readObject();
			for (Product p : products) {
				buffer.put(p);
				System.out.println("Producer produced: " + p);
			}
		} catch (Exception e) {
			System.out.println("Producer error: " + e);
		}
	}
}
