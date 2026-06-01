package com.demo.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="emptab")
public class Employee extends Person {
	private double sal;
	private int deptno;
	public Employee() {
		super();
	}
	public Employee(int pid, String pname, String mob,double sal, int deptno) {
		super(pid,pname,mob);
		this.sal = sal;
		this.deptno = deptno;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return super.toString()+ " Employee [sal=" + sal + ", deptno=" + deptno + "]";
	}
	
	

}
