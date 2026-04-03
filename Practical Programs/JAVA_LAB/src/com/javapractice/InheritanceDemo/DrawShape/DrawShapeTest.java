package com.javapractice.InheritanceDemo.DrawShape;

public class DrawShapeTest {
	public static void main(String[] args) {

		DrawShape p = null;
		//UPCASTING
		DrawShape s = new Triangle("blue", 2, 3, 4, 5);
		System.out.println("Area : " + s.calcArea());
		System.out.println("perimeter: " + s.calcPerimeter());
		System.out.println();

		DrawShape c = new Circle("black", 4);
		System.out.println("Area : " + c.calcArea());
		System.out.println("perimeter: " + c.calcPerimeter());
		System.out.println();

		DrawShape t = new Rectangle("black", 9, 2);
		System.out.println("Area : " + t.calcArea());
		System.out.println("perimeter: " + t.calcPerimeter());
		
		System.out.println("----To chack if Obj is instance of Circle---");
		System.out.println(c instanceof Circle);
		
		//DOWNCASTING - EXPLICIT
		System.out.println("DOWNCASTIED - EXPLICIT");
		((Circle) c).childSpecific();
		
	}
}
