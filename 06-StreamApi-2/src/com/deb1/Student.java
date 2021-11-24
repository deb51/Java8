package com.deb1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
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
		
		//collect ()
		Stream<Integer> streamList = l.stream();
		Stream<Integer> mapList = streamList.map((data)->data);
		//mapList.forEach((x)->System.out.println(x));
		List<Integer> li=mapList.collect(Collectors.toList() );
		System.out.println(li);
		
		
	}
}
