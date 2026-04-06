package com.javapractice;

public class Addition {

	public static void main(String[] args) {
		int sum = 0; 
		if(args.length>0) {
			for(int i=0; i<args.length; i++) {
				sum += Integer.parseInt(args[i]);
			}
			System.out.println("Addition is: "+ sum);
		}
	}

}
