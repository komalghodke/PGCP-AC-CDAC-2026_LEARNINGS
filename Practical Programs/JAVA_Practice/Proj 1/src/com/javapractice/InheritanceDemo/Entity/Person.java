package com.javapractice.InheritanceDemo.Entity;

public class Person {

	private int pid;
	private String name;
	private String mob;	

	public Person() {
		System.out.println("From Person default constructor!\n");
	}
	
	public Person(int pid, String name, String mob) {
		this.name = name;
		this.mob = mob;
		this.pid = pid;
		System.out.println("From Person Parameterized constructor!\n");
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", mob=" + mob + ", pid=" + pid + "]";
	}	
}
