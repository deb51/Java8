package com.deb;

@FunctionalInterface
public interface Demo {
	public static final int number = 10;

	public abstract void m1();

	public default void m4() {
		System.out.println("M4 method");
	}

	public static void m3() {
		System.out.println("M3 method");
	}
}
