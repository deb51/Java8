package com.deb1.InnerClass;

public class Student {

	public static void main(String[] args) {
		Test stu = new Test() { //it will create a extra .class file like Student$1.class for 1st one 
			@Override
			public void m1() {
				System.out.println("This is inner class with interface referance ");

			}
		};
		//stu.m1();
	}
}
