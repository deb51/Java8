package com.deb3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Supplier;

public class Driver {

	public static void main(String[] args) {
		
		//Case 1
		Supplier<Double> sup=()->{
			System.out.println("Enter the value:: ");
			int value =new Scanner(System.in).nextInt();
			return Math.sqrt(value);
		};
		System.out.println(sup.get());
		
		//Case 2
		Supplier<Integer> sup1=()->25;
		System.out.println(sup1.get());
		
		//Case 3
		ArrayList<Integer> al=new ArrayList();
	
		al.add(10);
		al.add(20);
		al.add(30);
		
		System.out.println(al);
		System.out.println(al.removeIf((x)->x%3==0));
		System.out.println(al);
	}
}
