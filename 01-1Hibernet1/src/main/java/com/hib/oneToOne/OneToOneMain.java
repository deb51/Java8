package com.hib.oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneMain {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("oneToOne.cfg.xml").buildSessionFactory();
		// create class object
		Student stu = new Student();
		stu.setStu_id(101);
		stu.setStuname("debasish");

		Address add = new Address();
		add.setBlock("udala");
		add.setPin(757041);

		stu.setAdd(add);
		Session session = factory.openSession();

		session.save(stu);

		session.save(add);
		Transaction transaction = session.beginTransaction();
		
		
		transaction.commit();

		session.close();
		factory.close();
	}
}