package com.javapractice.InheritanceDemo;


@FunctionalInterface
interface DemoInterface {
	void displayMsg(String message);
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		DemoInterface demoF = (msg) -> System.out.println("Message: " + msg);
		demoF.displayMsg("Hello from Functional Interface Demo!");
		
		MyFunctionalInterface f = (msg) -> System.out.println("Message from MyFunctionalInterface: " + msg);
		f.sayMessage("Hello From MyFunctionalInterface");
	}
}
