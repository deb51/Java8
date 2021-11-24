package com.deb6.sortingonCollectionUsingLamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student {
	Integer id;
	String name;
	Integer age;

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {

		ArrayList<Student> stu = new ArrayList<Student>();
		stu.add(new Student(1, "sonu", 15));
		stu.add(new Student(4, "monu", 9));
		stu.add(new Student(3, "hony", 10));
		stu.add(new Student(6, "gunu", 14));
		stu.add(new Student(5, "runu", 65));
		stu.add(new Student(7, "munu", 25));

		/*
		 * Collections.sort(stu, (p1 ,p2)->{ return p1.name.compareTo(p2.name); });
		 */

		Collections.sort(stu, (p1, p2) -> {
			return p1.id.compareTo(p2.id);
		});
		stu.forEach((data) -> {
			System.out.println(data);
		});
		System.out.println("======================================");
		Stream<Student> s=stu.stream().filter((data)->{
			return data.id<6;
		});
		
		s.forEach((st)->{
			System.out.println(st);
		});

	}
}
