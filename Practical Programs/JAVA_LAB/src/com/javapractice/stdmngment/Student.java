package com.javapractice.stdmngment;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {

	private int sid;
	private String sname;
	private float m1;
	private float m2;
	private float m3;
	private Date jdt;

	Student() {
		System.out.println("From default constructor");
		sid = 0;
		sname = null;
		this.m1 = 0f;
		this.m2 = 0f;
		this.m3 = 0f;
		jdt = null;
	}

	Student(int id, String nm, float m1, float m2, float m3, Date d) {
		sid = id;
		sname = nm;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		jdt = d;
	}

	public void setID(int id) {
		this.sid = id;
	}

	public int getSid() {
		return sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public float getM1() {
		return m1;
	}

	public void setM1(float m1) {
		this.m1 = m1;
	}

	public float getM2() {
		return m2;
	}

	public void setM2(float m2) {
		this.m2 = m2;
	}

	public float getM3() {
		return m3;
	}

	public void setM3(float m3) {
		this.m3 = m3;
	}

	public Date getJdt() {
		return jdt;
	}

	public void setJdt(Date jdt) {
		this.jdt = jdt;
	}

	public String toString() {
		SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy");
		String dt = sdt.format(jdt);

		return "Student Id: " + sid + "\nStudent Name: " + sname + "\nMarks M1: " + m1 + "\nMarsks M2:" + m2
				+ "\nMarks M3: " + m3 + "\nJoining Date: " + dt;

	}

}
