package com.demoCollection.model;

public class Person implements Comparable<Person> {

	private int pid;
	private String pname;
	private String mob;

	public Person() {
		super();
		System.out.println("From Default Constructor of Person Class...");
	}

	public Person(int pid, String pname, String mob) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.mob = mob;
		System.out.println("From Parameterized Constructor of Person Class...");
	}

	public Person(int id) {
		pid=id;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", mob=" + mob + "]";
	}

	@Override
	public int compareTo(Person o) {
		System.out.println("in compareTo method "+this.pid+"-------"+o.pid);
		/*if(this.pid<o.pid)
			return -1;
		else if(this.pid==o.pid) {
			return 0;
		}else {
			return 1;
		}*/ 
		            
		return this.pid-o.pid;
		//return (int)(this.sal-o.sal);
		//return this.pname.compareTo(o.pname)
	}
	
	@Override
	public boolean equals(Object obj) {
		Person other = (Person) obj;
		System.out.println("in persons equals method  "+this.pid+"--------"+other.pid);
		return this.pid == other.pid;
	}
}
