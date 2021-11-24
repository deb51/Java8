package com.deb2;

public class Teacher {

	public void check() {
		System.out.println("This is Teacher executing by: Method References");
	}

	public static void main(String[] args) {
		Teacher tc = new Teacher();
		TeacherInterface tci = tc::check;
		tci.check();
		System.out.println("================Non parameterized constructor call==================");
		Student stu = new Student();
		StudentInterface stu1=stu::inq;
		String value = stu.inq("debasish das");
		System.out.println(value);
		System.out.println("===============parameterized constructor call===================");
		StudentInterface1 si=Student::new;
		si.m1(15);
		
	}
}
