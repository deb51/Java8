package com.deb3.TerminalOperation;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class Topper {
	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList();
		l.add(15);
		l.add(17);
		l.add(2);
		l.add(19);
		l.add(9);
		l.add(115);
		l.add(221);
		l.add(15);
		l.add(231);

		Stream<Integer> steamlist = l.stream();
		// System.out.println(countlist.count());

		// --------anyMatch(), noneMatch(), allMatch()-------

		// boolean noneMatchList = steamlist.noneMatch((x)->x%5==0);
		// boolean anyMatchList = steamlist.anyMatch((x)->x%5==0);
		boolean allMatchList = steamlist.allMatch((x) -> x % 1 == 0);

		// System.out.println(noneMatchList);
		// System.out.println(anyMatchList);
		// System.out.println(allMatchList);

		// ------------------- max(), min(), reduced() ------------------

		Stream<Integer> sal = l.stream();

		// Optional<Integer> maxList = sal.max((x,y)->x.compareTo(y));
		//Optional<Integer> minList = sal.min((x, y) -> x.compareTo(y));
		Optional<Integer> reduceList = sal.reduce((x, y) -> {
			y = x + y;
			return y;
		});
		// System.out.println(maxList.get());
		// System.out.println(minList.get());
		System.out.println(reduceList.get());
	}
}
