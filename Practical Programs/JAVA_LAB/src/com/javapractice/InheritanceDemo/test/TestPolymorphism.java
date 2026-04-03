package com.javapractice.InheritanceDemo.test;

import java.util.Scanner;

import com.javapractice.InheritanceDemo.Entity.ContractEmp;
import com.javapractice.InheritanceDemo.Entity.Employee;
import com.javapractice.InheritanceDemo.Entity.SalariedEmp;
import com.javapractice.InheritanceDemo.Entity.Vendor;

public class TestPolymorphism {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Salaried \n 2. Contract \n 3. Vendor\n choice");
		int choice = sc.nextInt();
		Employee e = null;
		switch (choice) {
		case 1 -> {
			e = new SalariedEmp(1, "abc", "9876543210", "Dev", "Manager", 60567);
			System.out.println(((SalariedEmp) e).calculateBonus(0.3f));
		}
		
		case 2 -> {
			e = new ContractEmp(9, "xyz", "9123456780", "QA", "Lead", 45, 5678);
		}
		
		case 3 -> {
			e = new Vendor(9, "pqr", "9923456780", "TR", "Lead", 10, 10678);
		}
		
		case 4 -> {
			sc.close();
			System.out.println("Good Bye.........");
		}
		
		default -> {
			System.out.println("invalid choice");
		}
		
		}
		System.out.println("Salary: " + e.calculateSal());
	}

}
