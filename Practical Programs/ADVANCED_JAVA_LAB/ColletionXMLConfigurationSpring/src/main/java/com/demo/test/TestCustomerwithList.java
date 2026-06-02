package com.demo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Customer;

import org.springframework.context.ApplicationContext;

public class TestCustomerwithList {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("myspringconfig.xml");
		Customer c=(Customer)ctx.getBean("c1");
		System.out.println(c);
		((ClassPathXmlApplicationContext)ctx).close();
		

	}

}
