package com.javapractice.InheritanceDemo.DrawShape;

public class Rectangle extends DrawShape {

	private int length;
	private int breadth;

	public Rectangle() {
		super();
	}

	public Rectangle(String clr, int length, int breadth) {
		super(clr);
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return super.toString() + "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	@Override
	public float calcArea() {
		System.out.println("From  Reactangle calcArea...");
		return length*breadth;
	}

	@Override
	public float calcPerimeter() {
		System.out.println("From  Reactangle calcPerimeter...");
		return 2*(length+breadth);
	}

}
