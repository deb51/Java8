package com.deb1;

public class Student {
	public static void check() {
		System.out.println("this is test interface check implementation: Method references");
	}

	public static void main(String[] args) {
		StudentDetails details = Student::check;
		details.check();
	}
}
