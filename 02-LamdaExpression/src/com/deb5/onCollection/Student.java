package com.deb5.onCollection;

import java.util.ArrayList;

public class Student {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("12");
		l.add("ch");
		l.add("SH");
		l.add("SONU");
		l.add("Deb");
		l.add("JHbadjbjhdb");
		l.add("1222");
		
		l.forEach((I) -> {
			System.out.println(I);
		});

	}
}
