package com.javapractice;

public interface MyInterface {
	
	   int i = 34;

	   void m1();

	   int m2(int var1);

	   default void m3() {
	      this.m6();
	      System.out.println("in m3");
	   }

	   default void m5() {
	      this.m6();
	      System.out.println("in m5");
	   }

	   private void m6() {
	      System.out.println("in m6");
	   }

	   static void m7() {
	      System.out.println("in m7");
	   }
}
