package com.javapractice.InheritanceDemo.test;

import com.javapractice.InheritanceDemo.Entity.ContractEmp;
import com.javapractice.InheritanceDemo.Entity.SalariedEmp;
import com.javapractice.InheritanceDemo.Entity.Vendor;

public class TestPerson {

	public static void main(String[] args) {
		SalariedEmp se = new SalariedEmp(1, "abc", "9876543210", "Dev", "Manager", 60567);
		ContractEmp ce = new ContractEmp(9, "xyz", "9123456780", "QA", "Lead", 45, 5678);
		Vendor v = new Vendor(9, "pqr", "9923456780", "TR", "Lead", 10, 10678);
		System.out.println(se + "\n");
		System.out.println(se.calculateSal() + "\n");
		System.out.println(se.calculateBonus(0.30f) + "\n");
		System.out.println(ce + "\n");
		System.out.println(ce.calculateSal() + "\n");
		System.out.println(v + "\n");
	}
}
