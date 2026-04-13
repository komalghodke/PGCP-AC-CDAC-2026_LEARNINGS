package com.demoCollection.EnumDemo;

import java.util.Scanner;

public class EnumTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("0. big\n1. small\n2.medium");
		System.out.println("Enter choice: ");
		choice = sc.nextInt();
		System.out.println(Coffee.values()[choice]);
		Coffee ch = Coffee.values()[choice];
		switch (ch) {
		case big -> {
			System.out.println("You selected big: " + ch.getSize() + " ml " + ch.getCost() + " Rs.");
		}
		case small -> {
			System.out.println("You selected small: " + ch.getSize() + " ml " + ch.getCost() + " Rs.");
		}
		case medium -> {
			System.out.println("You selected medium: " + ch.getSize() + " ml " + ch.getCost() + " Rs.");
		}
		default -> {
			System.out.println("Invalid Choice!");
		}
		}
	}

}
