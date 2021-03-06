package com.deb2;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Employee {
	public static void main(String[] args) {

		//BinaryOperation
		//Takes two input of same type and return same
		BinaryOperator<String> bio=(String x,String y)->(x+y);

		String bioOp = bio.apply("debasish", " das");
		System.out.println(bioOp);
		
		//UnaryOperation
		//Take one input of any type and return one o/p of same type
		UnaryOperator<String> uni=(String x)->x.toUpperCase();
		String uniOp = uni.apply("debasish");
		System.out.println(uniOp);
	}
}
