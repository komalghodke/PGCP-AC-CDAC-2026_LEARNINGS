package com.demo.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {
	   @Id
	   @GeneratedValue
       private int eid;
       private String ename;
       private double sal;
       private LocalDate hdate;
	   public Employee() {
		super();
	   }
	   public Employee(String ename, double sal, LocalDate hdate) {
		super();
		this.ename = ename;
		this.sal = sal;
		this.hdate = hdate;
	   }
	   public int getEid() {
		   return eid;
	   }
	   public void setEid(int eid) {
		   this.eid = eid;
	   }
	   public String getEname() {
		   return ename;
	   }
	   public void setEname(String ename) {
		   this.ename = ename;
	   }
	   public double getSal() {
		   return sal;
	   }
	   public void setSal(double sal) {
		   this.sal = sal;
	   }
	   public LocalDate getHdate() {
		   return hdate;
	   }
	   public void setHdate(LocalDate hdate) {
		   this.hdate = hdate;
	   }
	   @Override
	   public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + ", hdate=" + hdate + "]";
	   }
       
}
