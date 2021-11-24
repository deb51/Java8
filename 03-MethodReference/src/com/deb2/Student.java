package com.deb2;

public class Student {
	public String inq(String msgs ) {
		System.out.println("This is Student executing by: Method References");
		
		return msgs;
	}
	public Student() {
		System.out.println("this is the Student class non parameetrized constructor ");
	}
	
	public Student(int num) {
		System.out.println("this is the Student class parameterized constructor "+num);
	}
	
}
