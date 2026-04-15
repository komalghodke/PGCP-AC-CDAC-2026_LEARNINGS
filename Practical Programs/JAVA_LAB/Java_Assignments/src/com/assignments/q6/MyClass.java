package com.assignments.q6;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CustomAnnotation {
}

class MyClass {
	@CustomAnnotation
	void method1() {
		System.out.println("method1 invoked");
	}

	void method2() {
		System.out.println("method2 invoked");
	}

	@CustomAnnotation
	void method3() {
		System.out.println("method3 invoked");
	}

	void method4() {
		System.out.println("method4 invoked");
	}
}