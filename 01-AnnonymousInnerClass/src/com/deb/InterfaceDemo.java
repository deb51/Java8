package com.deb;

public class InterfaceDemo implements Demo {

	public static void main(String[] args) {
		Demo demo=new InterfaceDemo();
		demo.m1();
		demo.m4();
		Demo.m3();
		Demo demo1=new Student();
		demo1.m4();
		demo1.m1();
	}

	@Override
	public void m1() {
		System.out.println("Interface demo class m1()");
		
	}
}
