package com.demo.stacks;

public class MyQueueLinkList {
	Node front;
	Node rear;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
		
	}
	public MyQueueLinkList() {
		this.front = null;
		this.rear = null;
	}
	
	public boolean isEmpty() {
		return front==null && rear==null;
	}
	
	public boolean enqueue(int val) {
		Node newNode=new Node(val);
		if(isEmpty()) {
			front=newNode;
		}else {
			rear.next=newNode;	
		}
		rear=newNode;
		System.out.println("added "+val);
	    return true;	
	}
	
	public int dequeue() {
		if(!isEmpty()) {
			Node temp=front;
			front=front.next;
			if(front==null) {
				rear=null;
			}
			temp.next=null;
			return temp.data;
		}else {
			System.out.println("queue is empty");
			return -1;
		}
	}
	
	

}
