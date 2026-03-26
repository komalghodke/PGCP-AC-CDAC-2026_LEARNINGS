package com.javapractice;

public class DemoTypeCast {

	public static void main(String[] args) {
		int x=12; //explicit typecasting
		byte b=(byte)x;
		System.out.println("b:" + b);
		
		long d=67l;
		float f=45.6f;
		//implicit typecasting
		//float f=d;

		System.out.println("f: " + f);
		//final means constant variables
		final int y=90;
	}

}
