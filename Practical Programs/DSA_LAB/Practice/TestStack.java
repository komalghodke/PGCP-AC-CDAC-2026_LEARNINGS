package com.dsa.prep;

import java.util.Scanner;

public class TestStack {

	public static void main(String[] args) {
//		StackUsingArray st = new StackUsingArray();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stack capacity:");
		int size = sc.nextInt();

		Stack st = new Stack(size);
		
		System.out.println("\n--- STACK MENU ---");
		System.out.println("1. Push");
		System.out.println("2. Pop");
		System.out.println("3. Display");
		System.out.println("4. Exit");

		int choice = 0;
		do {
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter value:");
				int val = sc.nextInt();
				st.push(val);
				break;
			case 2: {
				st.pop();
				break;
			}
			case 3: {
				st.display();
				break;
			}
			case 4: {
				System.out.println("BYE");
				break;
			}
			default: {
				System.out.println("INVALID CHOICE!!");
			}
			}
		} while (choice != 4);
		sc.close();
	}

}
