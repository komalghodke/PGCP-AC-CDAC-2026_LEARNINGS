package com.javapractice.InheritanceDemo;

@FunctionalInterface
interface DemoInterface {
	void displayMsg(String message);
}

@FunctionalInterface
interface MyCompare {
	int compare(int x, int y);
}

@FunctionalInterface
interface GenericsDemo<T, F> {
	F compareIt(T x, T y);
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		DemoInterface demoF = (msg) -> System.out.println("Message: " + msg);
		demoF.displayMsg("Hello from Functional Interface Demo!");

		MyFunctionalInterface f = (msg) -> System.out.println("Message from MyFunctionalInterface: " + msg);
		f.sayMessage("Hello From MyFunctionalInterface");

		MyCompare m = (x, y) -> (x > y) ? x : y;
		System.out.println("Greater number is: " + m.compare(10, 20));


        GenericsDemo<String, Integer> stringCompare =
            (x, y) -> (x.length() > y.length()) ? x.length() : y.length();

        int result = stringCompare.compareIt("Hello", "World!");
        System.out.println("Length of longer string: " + result);

        GenericsDemo<Integer, Integer> intCompare =
            (x, y) -> (x > y) ? x : y;

        System.out.println("Greater integer: " + intCompare.compareIt(15, 25));
	}
}
