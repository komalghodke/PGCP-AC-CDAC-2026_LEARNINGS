package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.MyClass;

public class TestAOPDemo {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("myspringconfig.xml");
		MyClass ob = (MyClass) ctx.getBean("myClass");
		ob.f1();
		// ob.f2();
		// ob.m1(12);
		// ob.m2();
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
