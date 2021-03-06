package com.hib1;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Project Started...");
		// SessionFactory factory=new Configuration().configure().buildSessionFactory();
		// or
		Configuration cfg = new Configuration();
		cfg.configure("Hibernet1.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println(factory);
		System.out.println(factory.isClosed());
	}
}
