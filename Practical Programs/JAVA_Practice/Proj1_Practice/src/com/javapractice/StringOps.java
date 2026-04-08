package com.javapractice;

public class StringOps {

	public static void main(String[] args) {
		String s1 = "Welcome";
		String s2 = s1;
		String s3 = "Welcome";
		String s4 = new String("Welcome");
		String s5 = "DUMMY";
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		System.out.println("s4 = " + s4);
		System.out.println("s5 = " + s5);
		System.out.println("s1==s2 is: "+ (s1==s2));
		System.out.println("s3==s2 is: " + (s3==s2));
		System.out.println("s1==s3 is: " + (s1==s3));
		System.out.println("s1==s4 is: " + (s1==s4));
		System.out.println("s1.equals(s4) is: "+ s1.equals(s4));
		System.out.println("s1==s5 is: " + (s1==s5));
		System.out.println("s1.equals(s5) is: "+ s1.equals(s5));
		System.out.println(s1.concat(s5));
	}
}