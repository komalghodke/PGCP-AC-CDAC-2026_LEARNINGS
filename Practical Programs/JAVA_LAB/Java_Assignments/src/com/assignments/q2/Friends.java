package com.assignments.q2;

import java.util.List;

public class Friends {
	int id;
	String name;
	String lastname;
	List<String> hobbies;
	String mobno;
	String email;
	String bdate;
	String address;

	Friends(int id, String name, String lastname, List<String> hobbies, String mobno,
			String email, String bdate, String address) {
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.hobbies = hobbies;
		this.mobno = mobno;
		this.email = email;
		this.bdate = bdate;
		this.address = address;
	}

	void display() {
		System.out.println("ID: " + id + ", Name: " + name + " " + lastname);
		System.out.println("Hobbies: " + hobbies);
		System.out.println("Mobile: " + mobno + ", Email: " + email);
		System.out.println("Birthdate: " + bdate + ", Address: " + address);
		System.out.println("-----------------------------------");
	}
}