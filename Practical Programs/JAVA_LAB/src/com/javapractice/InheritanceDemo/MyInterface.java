package com.javapractice.InheritanceDemo;

public interface MyInterface {
	
	   int i = 34;

	   void m1();

	   int m2(int var1);

	   default void m3() {
	      this.m6();
	      System.out.println("From default method m3");
	   }

	   default void m5() {
	      this.m6();
	      System.out.println("From default method m5");
	   }

	   private void m6() {
	      System.out.println("From private method m6");
	   }

	   static void m7() {
	      System.out.println("From Static method m7");
	   }
}
