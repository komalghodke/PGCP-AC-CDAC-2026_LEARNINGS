package com.javapractice.CollectionDemo;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueueDemo {

	public static void main(String[] args) {
		Queue<Integer> que = new PriorityQueue<>();
		que.add(20);
		que.add(30);
		que.add(10);
		que.add(10);
		que.add(23);
		que.add(25);
		que.stream().forEach(System.out::println);
		while (!que.isEmpty()) {
			System.out.println(que.poll());
		}

	}
}
