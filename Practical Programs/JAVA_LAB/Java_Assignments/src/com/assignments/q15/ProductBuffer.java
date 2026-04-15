package com.assignments.q15;

class ProductBuffer {
	private Product product;
	private boolean available = false;

	public synchronized void put(Product p) {
		while (available) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		product = p;
		available = true;
		notify();
	}

	public synchronized Product get() {
		while (!available) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		available = false;
		notify();
		return product;
	}
}
