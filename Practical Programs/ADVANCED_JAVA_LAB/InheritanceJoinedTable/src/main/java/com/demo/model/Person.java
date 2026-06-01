package com.demo.model;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name="person22")
@Inheritance(strategy=InheritanceType.JOINED)
public class Person {
	@Id
private int pid;
private String pname;
private String mob;
public Person() {
	super();
}
public Person(int pid, String pname, String mob) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.mob = mob;
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

}
