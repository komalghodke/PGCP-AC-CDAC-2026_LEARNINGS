package com.javapractice.InheritanceDemo.DrawShape;

public class Circle extends DrawShape {

	private float r;

	public Circle() {
		System.out.println("From Circle default costructor...");
	}

	public Circle(String clr, float r) {
		super(clr);
		this.r = r;
		System.out.println("From Circle Parameterized costructor...");
	}

	public float getR() {
		return r;
	}

	public void setR(float r) {
		this.r = r;
	}

	@Override
	public float calcArea() {
		System.out.println("from calcArea...");
		return 3.142f * r * r;
	}

	@Override
	public float calcPerimeter() {
		System.out.println("from calcPerimeter...");
		return 2 * 3.142f * r;
	}
	
	public void childSpecific() {
		System.out.println("in circle childSpecific method");
	}
	
	@Override
	public String toString() {
		return super.toString() + "Circle [r=" + r + "]";
	}


}
