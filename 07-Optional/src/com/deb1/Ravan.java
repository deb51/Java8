package com.deb1;

import java.util.Optional;

public class Ravan {

	public static void main(String[] args) {
		String[] a = new String[5];
		a[1] = "Debasish";
		a[0] = "Sonu";
		System.out.println(a[0].toUpperCase());
		System.out.println(a[1].toUpperCase());
		// System.out.println(a[2].toUpperCase());

		Optional<String> ofNullable1 = Optional.ofNullable(a[1]);
		System.out.println(ofNullable1.isPresent());

		Optional<String> ofNullable2 = Optional.ofNullable(a[2]);
		System.out.println(ofNullable2.isPresent());

		
		System.out.println(ofNullable2.orElse("There is no value to display.."));
	}
}
