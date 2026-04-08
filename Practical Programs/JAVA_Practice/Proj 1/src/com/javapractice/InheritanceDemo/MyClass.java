package com.javapractice.InheritanceDemo;

public class MyClass implements MyInterface {

    @Override
    public void m1() {
        System.out.println("Method M1 implemented from MyInterface");
    }

    @Override
    public int m2(int var1) {
        System.out.println("Method m2 implemented with var1 = " + var1);
        return var1 * 2;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();

        obj.m1();
        int result = obj.m2(10); 
        System.out.println("Result of m2: " + result);

        obj.m3();
        obj.m5(); 

        MyInterface.m7();
    }
}
