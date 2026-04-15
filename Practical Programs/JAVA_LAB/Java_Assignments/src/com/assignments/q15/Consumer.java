package com.assignments.q15;

import java.io.FileWriter;
import java.io.PrintWriter;

class Consumer extends Thread {
	private ProductBuffer buffer;

	Consumer(ProductBuffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		try (PrintWriter pw = new PrintWriter(new FileWriter("productamount.dat"))) {
			while (true) {
				Product p = buffer.get();
				if (p == null)
					break;
				double amount = (p.qty * p.price) + (0.1 * p.price);
				String line = p.id + ":" + p.pname + ":" + p.qty + ":" + p.price + ":" + amount;
				pw.println(line);
				pw.flush();
				System.out.println("Consumer consumed: " + line);
			}
		} catch (Exception e) {
			System.out.println("Consumer error: " + e);
		}
	}
}
