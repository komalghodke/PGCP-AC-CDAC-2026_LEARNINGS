package com.demo.graphlists;

public class MyLinkedList {
	Node head;
    class Node{
   	 int data;
   	 //int weight;
   	 Node next;
		public Node(int data){//, int weight) {
			this.data = data;
			//this.weight=weight;
			this.next = null;
		}
   	 
    }
	public MyLinkedList() {
		head=null;
	}
	
	public void addNode(int num) { //,int wt) {
		//add at the begining
		Node newNode=new Node(num);
		if(head!=null) {
			newNode.next=head;
		}
		head=newNode;
	}
	
	
	public void displayList() {
		if(head==null) {
			System.out.print("empty");
		}else {
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.data+"--->");
				temp=temp.next;
			}
			System.out.print("null");
			System.out.println();
		}
	}
	public boolean search(int val) {
		if(head==null) {
			return false;
		}else {
			Node temp=head;
			while(temp!=null && temp.data!=val) {
					temp=temp.next;
			}
			if(temp.data==val) {
				return true;
			}
			return false;
		
		}
	}
	
	public boolean deleteNode(int val) {
		 if(head==null) {
			 System.out.println("list is empty");
			 return false;
		 }else {
			 Node temp=head;
			  if(head.data==val) {
				  head.next=head;
				  temp.next=null;
				  return true;
			  }else {
				  Node prev=null;
				  while(temp!=null && temp.data!=val) {
					  	prev=temp;
					  	temp=temp.next;
				  }
				  if(temp.data==val) {
					  prev.next=temp.next;
					  temp.next=null;
					  return true;
				  }else {
					  System.out.println(val+ " not found");
					  return false;
				  }
			  }
		 }
	}

	public int[] getAdjescentVertices(int length) {
		int[] arr=new int[length];
		for(int i=0;i<arr.length;i++) {
			arr[i]=-1;
		}
		//navigate through the linked list and find all nodes in the linked list and add it in the array
		Node temp=head;
		int i=0;
		while(temp!=null) {
			 arr[i]=temp.data;
			 i++;
			 temp=temp.next;
		}
		return arr;
	}
}
