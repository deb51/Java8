package com.deb1;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Student {
	public static void main(String[] args) {

		// Consumer
		// Take one input and give One Output
		Consumer<String> si = (String x) -> System.out.println("The giver bynber is " + x);
		si.accept("15");

		// BiConsumer
		// Take two input of same/different type and doesn't return anything.
		BiConsumer<Integer, String> bic = (Integer x, String y) -> System.out.println(x + y);
		bic.accept(15, "gaga");

		// Predicate
		// Take one input and give One "Boolean" Output
		Predicate<Integer> p1 = (x) -> x % 2 == 0;
		boolean test = p1.test(100);
		System.out.println(test);
		
		//BiPredicate
		//Take input maybe same or different but o/p is boolean
		BiPredicate<String, Integer> bip=(String x,Integer y)->((x.length()+y)!=15);
		boolean test2 = bip.test("debasishda", 5);
		System.out.println("Bipredicate "+test2);
		
		//Function
		//Take one input and give one o/p may be same or different
		Function<String, Integer> fun=(String x)->x.length();
		Integer apply = fun.apply("Debasish");
		System.out.println(apply);
		
		//BiFunction
		//Take two input of type same or may diff and give o/p same to input
		BiFunction<String, String, Integer> bfu=(String x,String y)->x.toString().length()+y.length();
		Integer apply2 = bfu.apply("A", "52");
		System.out.println(apply2);

	}
}
