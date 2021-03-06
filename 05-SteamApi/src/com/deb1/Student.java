package com.deb1;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Student {

	public static void main(String[] args) {
		
		ArrayList<Integer> l=new ArrayList();
	
		l.add(15);
		l.add(17);
		l.add(2);
		l.add(19);
		l.add(9);
		l.add(115);
		l.add(221);
		//Stream filter
		Stream<Integer> fil = l.stream().filter((data)->data % 3==0);

		Stream<Integer> filmap = fil.map((x)->x*x);
		
		//foreach method using lamda
		//fil.forEach((data)->System.out.println(data));
		filmap.forEach((data)->System.out.println(data));
		
		//FlatMap
		System.out.println("-----------------");
		Stream<Object> steamflatMap = l.stream().flatMap((data)->{
			System.out.println((data+2));
			return null;
		});
		steamflatMap.forEach((data)->System.out.println(data));
		
	}
}
