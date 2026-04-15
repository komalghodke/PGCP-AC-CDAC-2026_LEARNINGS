package com.assignments.q6;

import java.lang.reflect.Method;

public class Q6 {
	public static void main(String[] args) throws Exception {
		MyClass obj = new MyClass();
		for (Method m : MyClass.class.getDeclaredMethods()) {
			if (m.isAnnotationPresent(CustomAnnotation.class))
				m.invoke(obj);
			else
				System.out.println("Not annotated: " + m.getName());
		}
	}
}
