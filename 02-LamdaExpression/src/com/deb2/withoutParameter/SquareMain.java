package com.deb2.withoutParameter;

public class SquareMain {
	static int num = 40;

	public static void main(String[] args) {

		int num = 20;
		Square sq = () -> {
			System.out.println("Instide Lamda");
			System.out.println("Square of num is " + (num * num));// this is taking square main class num value
		};
		sq.squareOfNum();
	}
}
