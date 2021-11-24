package com.deb3.withParameter;

public class SquareMain {

	public static void main(String[] args) {
		SquareInterface sqi=(number)->{
			System.out.println("Inside Lamda Expression od Square");
			System.out.println("The Square value is "+(number*number));
		};
		sqi.m1(20);
		
		AdditionInterface add=(a,b)->{
			System.out.println("inside Lamda of addition ");
		
			System.out.println("The addition value of the two number is "+(a+b));
		};
		add.m2(13, 20);
	}
}
