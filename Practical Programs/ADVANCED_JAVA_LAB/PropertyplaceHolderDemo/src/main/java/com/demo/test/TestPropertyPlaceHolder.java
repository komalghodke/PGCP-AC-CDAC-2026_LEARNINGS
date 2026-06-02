package com.demo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.MyUser;

import org.springframework.context.ApplicationContext;
public class TestPropertyPlaceHolder {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("myspringconfig.xml");
	MyUser u1=(MyUser)ctx.getBean("u1");
	System.out.println(u1);
	MyUser u2=(MyUser)ctx.getBean("u2");
	System.out.println(u2);
	((ClassPathXmlApplicationContext)ctx).close();
	
}
}
