package com.demo.hashing;

public class MyHashTableList {
	Node[] heads;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
		
	}
	public MyHashTableList() {
		heads=new Node[5];
		for(int i=0;i<heads.length;i++) {
			heads[i]=null;
		}
	}
	
	public MyHashTableList(int size) {
		heads=new Node[size];
		for(int i=0;i<heads.length;i++) {
			heads[i]=null;
		}
	}
	
	public void insertData(int val) {
		Node newNode=new Node(val);
		//find the position using hash function
		int pos=val%heads.length;
		//add at the begining of the pos linked list
		if(heads[pos]!=null) {
			newNode.next=heads[pos];
		}
		heads[pos]=newNode;
	}
	
	public void displayHashTable() {
		for(int i=0;i<heads.length;i++) {
			Node temp=heads[i];
			System.out.print(i+"--->");
			while(temp!=null) {
				System.out.print(temp.data+"----->");
				temp=temp.next;
			}
			System.out.println("null");
		}
	}
	
	public boolean searchData(int num) {
		int pos=num%heads.length;
		Node temp=heads[pos];
		while(temp!=null) {
			if(temp.data==num) {
				System.out.println("number found at "+pos+" Bucket");
				return true;
			}
			temp=temp.next;
		}
		System.out.println("number not found");
		return false;
	}
	
	public boolean deleteData(int num) {
		//search the position by using hash function
		//search number in the list, if found then delete
		return true;
	}

}
