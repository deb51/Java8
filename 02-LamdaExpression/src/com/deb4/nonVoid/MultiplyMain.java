package com.deb4.nonVoid;

public class MultiplyMain {

	public static void main(String[] args) {
		MultiInterface mul=(a,b)->{
			System.out.println("inside Lamda Expression");
			return a*b;
		};
		int value = mul.m1(5, 4);
		System.out.println(value);
		
		//OR
		
		MultiInterface mul1=(a,b)->(a*b);
		int value1=mul1.m1(5, 5);
		System.out.println(value1);
	}
}
