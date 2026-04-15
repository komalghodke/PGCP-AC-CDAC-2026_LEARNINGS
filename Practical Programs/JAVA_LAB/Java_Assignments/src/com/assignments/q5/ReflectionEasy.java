package com.assignments.q5;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/*	Q5. Reflection Assignment. 
	1. Write a java program to find name of class, name of methods, 
	count of parameters, names of parameters, types of parameters for  
	following classes 
	1. Rectangle 
	2. Student 
	3. Friend 
	4. MyClass - add 2 methods method 5 and method6 which accepts 4 parameters 
	If number of parameters to a method >= 3 then invoke that method
 */

class Rectangle {
	void area(int l, int w) {
	}
}

class Student {
	void details(String n, int a) {
	}
}

class Friend {
	void greet(String msg) {
	}
}

class MyClass {
	void method5(int a, int b, int c, int d) {
		System.out.println("method5 invoked");
	}

	void method6(String x, String y, String z, String w) {
		System.out.println("method6 invoked");
	}
}

public class ReflectionEasy {
	public static void main(String[] args) throws Exception {
		for (Class<?> c : new Class[] { Rectangle.class, Student.class, Friend.class, MyClass.class }) {
			System.out.println("\nClass: " + c.getName());
			for (Method m : c.getDeclaredMethods()) {
				System.out.println("Method: " + m.getName() + ", Params: " + m.getParameterCount());
				for (Parameter p : m.getParameters())
					System.out.println("  " + p.getName() + " : " + p.getType().getSimpleName());
				if (m.getParameterCount() >= 3) {
					Object obj = c.getDeclaredConstructor().newInstance();
					Object[] vals = new Object[m.getParameterCount()];
					for (int i = 0; i < vals.length; i++)
						vals[i] = m.getParameters()[i].getType() == int.class ? 1 : "test";
					m.invoke(obj, vals);
				}
			}
		}
	}
}
