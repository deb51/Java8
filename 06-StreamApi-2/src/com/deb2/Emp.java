package com.deb2;

import java.util.Arrays;
import java.util.stream.Stream;

public class Emp {
	public static void main(String[] args) {

		// case 1
		String[] s = { "Oracle", "Java", "Spring", "Hibernate" };

		Stream<String> ofStream = Stream.of(s);

		// reverse sorting
		/*
		 * Stream<String> sortedStream = ofStream.sorted((x,y)->y.compareTo(x));
		 * sortedStream.forEach((x)->System.out.println(x));
		 */

		// case 2
		Stream<Integer> s1 = Stream.of(10, 5, 150, 70, 50);

		/*
		 * Stream<Integer> sortedStream = s1.sorted();
		 * sortedStream.forEach((x)->System.out.println(x));
		 */

		// case 3
		Stream<Integer> s2 = Stream.of(new Integer[] { 10, 5, 150, 70, 50 });

		/*
		 * Stream<Integer> sortedStream = s2.sorted(); sortedStream.forEach((x) ->
		 * System.out.println("x : "+x));
		 */

		//Case 4
		Stream<Integer> streamArray = Arrays.stream(new Integer[] { 10, 5, 150, 70, 50 });
		
		Stream<Integer> sortedStream = streamArray.sorted();
		sortedStream.forEach((x) -> System.out.println("Case 4 : " + x));

	}

}
