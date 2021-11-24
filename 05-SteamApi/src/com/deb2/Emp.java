package com.deb2;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Emp {

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList();
		
		l.add(15);
		l.add(17);
		l.add(2);
		l.add(19);
		l.add(9);
		l.add(115);
		l.add(221);
		l.add(15);l.add(221);
		//System.out.println(l.size());
		
		// distinct means no duplicate
		Stream<Integer> distinctList = l.stream().distinct();
		//distinctList.forEach((data)->System.out.println(data));
		
		//limit() upto the limit as per index
		Stream<Integer> limitList = l.stream().limit(3);
		//limitList.forEach((data)->System.out.println(data));
		
		//peek()
		Stream<Integer> peeklist = l.stream().peek((x)->{});
		peeklist.forEach((data)->System.out.println(data));
	}
}
