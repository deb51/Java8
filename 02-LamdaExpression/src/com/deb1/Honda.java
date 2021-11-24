package com.deb1;

public class Honda {

	public void engineNumber() {

		System.out.println("Honda class engine ");
	}

	public static void main(String[] args) {
		Engine eng = () -> {
			System.out.println("Lamda expp engine interface");
		};
		eng.engineNumber();

	}
}
