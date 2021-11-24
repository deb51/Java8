package com.deb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Student {
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList();
		al.add("Debasish");
		al.add("Jvav");
		al.add("YUg");
		al.add("YUg");
		al.add("yamini");
		al.add("kayar");

		Long collectNum = al.stream().map((x) -> x).collect(Collectors.counting());

		System.out.println(collectNum);

		String[][] a = { { "Java", "101" }, { "Spring", "102" }, { "hibernate", "103" }, { "Oracle", "104" } };
		Map<String, String> mapArray = Arrays.stream(a).collect(Collectors.toMap(x -> x[0], y -> y[1]));
		System.out.println(mapArray);

	}
}
