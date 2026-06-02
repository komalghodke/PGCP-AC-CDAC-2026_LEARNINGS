package com.demo.stacks;

public class MyStackList {
	Node top;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
		
	}
	public MyStackList() {
		this.top = null;
	}
	public boolean isEmpty() {
		return top==null;
	}
	
	public void push(int val) {
		Node newNode=new Node(val);
		if(isEmpty()) {
		     top=newNode;	
		}else {
			newNode.next=top;
			top=newNode;
		}
		System.out.println("pushed "+val);
		
	}
	
	public int pop() {
		if(!isEmpty()) {
				Node temp=top;
				top=top.next;
		      temp.next=null;
		      System.out.println("poped "+temp.data);
		      return temp.data;
		}else {
			System.out.println("stack is empty");
			return -1;
		}
	}	

}
