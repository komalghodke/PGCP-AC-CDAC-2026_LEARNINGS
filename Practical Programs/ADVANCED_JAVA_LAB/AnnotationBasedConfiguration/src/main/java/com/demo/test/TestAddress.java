package com.demo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Address;

import org.springframework.context.ApplicationContext;
public class TestAddress {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("myspringconfig.xml");
		//Address addr1=(Address)ctx.getBean(Address.class);
		Address addr1=(Address)ctx.getBean("address");
	}

}
