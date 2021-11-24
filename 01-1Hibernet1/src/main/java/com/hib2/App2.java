package com.hib2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App2 {
	public static void main(String[] args) {

		Configuration cfg2 = new Configuration();
		cfg2.configure("Hibernet1.cfg.xml");
		SessionFactory factory2 = cfg2.buildSessionFactory();
		System.out.println(factory2);
		// create student object
		Student st = new Student();
		st.setId(102);
		st.setCity("BPD");
		st.setName("DEBA ");
		System.out.println(st);
		Session session = factory2.openSession();
		session.beginTransaction();
		session.save(st);
		Transaction trans = session.getTransaction();
		trans.commit();
		factory2.close();
		session.close();

	}
}
