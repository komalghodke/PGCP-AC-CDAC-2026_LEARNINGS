package com.javapractice.InheritanceDemo.DrawShape;

public class Triangle extends DrawShape {

	private int s1;
	private int s2;
	private int height;
	private int base;

	public Triangle() {
		System.out.println("From Triangle Default Constructor...");
	}

	public Triangle(String clr, int s1, int s2, int height, int base) {
		super(clr);
		this.s1 = s1;
		this.s2 = s2;
		this.height = height;
		this.base = base;
		System.out.println("From Triangle Parameterized Constructor...");
	}

	public int getS1() {
		return s1;
	}

	public void setS1(int s1) {
		this.s1 = s1;
	}

	public int getS2() {
		return s2;
	}

	public void setS2(int s2) {
		this.s2 = s2;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	@Override
	public String toString() {
		return super.toString() + "Triangle [s1=" + s1 + ", s2=" + s2 + ", height=" + height + ", base=" + base + "]";
	}

	@Override
	public float calcArea() {
		System.out.println("From Traingle calcArea...");
		return 0.5f * base * height;
	}

	@Override
	public float calcPerimeter() {
		System.out.println("From Traingle calcPerimeter...");
		return s1 + s2 + base;
	}

}
