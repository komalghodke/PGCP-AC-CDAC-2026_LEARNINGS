package com.javapractice.InheritanceDemo.DrawShape;

public abstract class DrawShape {

	private String color;
	public DrawShape() {
		System.out.println("From DrawShape Default Constructor...");
	}
	
	public DrawShape(String color) {
		super();
		this.setColor(color);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "DrawShape [color=" + color + "]";
	}
	
    abstract public float calcArea();
    abstract public float calcPerimeter();
}
