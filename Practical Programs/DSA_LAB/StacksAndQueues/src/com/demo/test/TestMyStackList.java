package com.demo.test;

import com.demo.stacks.MyStackList;

public class TestMyStackList {

	public static void main(String[] args) {
		MyStackList ob=new MyStackList();
		  ob.push(23);
		  ob.push(22);
		  ob.push(20);
		  ob.push(7);
		  ob.push(3);
		  ob.push(23);
		  System.out.println("-------------------");
		  System.out.println(ob.pop());
		  System.out.println(ob.pop());
		  System.out.println(ob.pop());
		  System.out.println(ob.pop());
		  System.out.println(ob.pop());
		  System.out.println(ob.pop());
		  System.out.println(ob.pop());//stack empty
	}

}
