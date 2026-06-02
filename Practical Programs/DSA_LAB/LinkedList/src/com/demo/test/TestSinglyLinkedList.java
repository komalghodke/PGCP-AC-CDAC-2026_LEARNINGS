package com.demo.test;

import com.demo.linkedlist.SinglyLinkedList;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		SinglyLinkedList lst=new SinglyLinkedList();
		lst.addNode(10);
		lst.addNode(7);
		lst.addNode(20);
		lst.addNode(30);
		lst.addNode(35);
		lst.addNode(20);
		lst.displayData();
		lst.addByPosition(11, 1);
		lst.addByPosition(12, 4);
		lst.addByPosition(15, 7);
		lst.displayData();
		lst.addAfterNum(111, 11);
		lst.addAfterNum(112, 15);
		lst.addByPosition(12, 4);
		lst.displayData();
		lst.deleteByPosition(1);
		lst.deleteByPosition(5);
		lst.displayData();
		lst.deleteByValue(111);
		lst.deleteByValue(12);
		lst.displayData();
		
	}

}
