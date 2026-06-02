package com.dsa.prep;

public class Stack {
	int arr[];
	int capacity;
	int top;

	public Stack(int size) {
		capacity = size;
		arr = new int[capacity];
		top = -1;
	}

	boolean isFull() {
		return top == capacity - 1;
	}

	boolean isEmpty() {
		return top == -1;
	}

	public void push(int val) {
		if (isFull()) {
			System.out.println("Stack is already Full");
		} else {
			arr[++top] = val;
			System.out.println("PUSHED the element: " + val);
		}
	}

	public void pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			System.out.println("PUSHED the element!! " + arr[top--]);
		}
	}

	public void display() {
		if(isEmpty()) {
			System.out.println("STACK IS EMPTY!");
		}
		else {
			for(int i = 0; i<=top; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}
}
