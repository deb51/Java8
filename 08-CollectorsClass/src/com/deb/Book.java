package com.deb;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class Book {
	Integer bookId;
	String bookName;
	Integer bookPage;
	Double bookPrice;

	public Book(Integer bookId, String bookName, Integer bookPage, Double bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPage = bookPage;
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookPage=" + bookPage + ", bookPrice="
				+ bookPrice + "]";
	}

	public static void main(String[] args) {

		ArrayList<Book> al = new ArrayList<Book>();
		al.add(new Book(101, "Java", 500, 250.0));
		al.add(new Book(102, "Spring", 250, 450.0));
		al.add(new Book(103, "Hibernate", 350, 350.0));
		al.add(new Book(104, "Angular", 250, 255.0));
		al.add(new Book(105, "Oracle", 450, 280.0));

		Double collectAmount = al.stream().collect(Collectors.summingDouble((p) -> p.bookPrice));
		System.out.println(collectAmount);

		DoubleSummaryStatistics doubleSummaryStatistics = al.stream()
				.collect(Collectors.summarizingDouble((p) -> p.bookPrice));
		System.out.println(doubleSummaryStatistics);
		
		Double collectAvgDouble = al.stream().collect(Collectors.averagingDouble((p)-> p.bookPrice));
		System.out.println(collectAvgDouble);

		

	}
}
