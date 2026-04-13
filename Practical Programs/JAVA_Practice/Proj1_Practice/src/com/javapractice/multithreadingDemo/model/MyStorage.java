package com.javapractice.multithreadingDemo.model;

public class MyStorage {
	private int num;
    private boolean valueset;
	  public MyStorage() {
		super();
		valueset=false;
	  }
	  
	  synchronized public void put(int n) {
		  if(valueset){
			  try {
				wait();
			  } catch (InterruptedException e) {
				e.printStackTrace();
			  }
		  }
		  
		  System.out.println("in put "+n);
		  num=n;
		  valueset=true;
		  notify();  //wakeup consumer thread which is in wait state
	  }
	 synchronized public void get() {
		  if(!valueset) {
			  try {
				wait();
			  } catch (InterruptedException e) {
				e.printStackTrace();
			  }
		  }
		  System.out.println("in get "+num);
		  valueset=false;
		  notify();
	  }
}