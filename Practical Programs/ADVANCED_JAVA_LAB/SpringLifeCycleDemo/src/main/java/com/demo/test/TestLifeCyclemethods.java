package com.demo.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.MyUser;

import org.springframework.context.ApplicationContext;
public class TestLifeCyclemethods {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("myspringconfig.xml");
		//MyUser u=(MyUser)ctx.getBean(MyUser.class);
		MyUser u=(MyUser)ctx.getBean("u1");
		System.out.println(u);
		((ClassPathXmlApplicationContext) ctx).close();

	}

}
