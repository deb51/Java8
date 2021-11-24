package com.hib.embadableAnnotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMain {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("TestHiber.xml");//here give xml location
		SessionFactory sf=cfg.buildSessionFactory();//create session factory object
		//create class object
		Person per=new Person();
		per.setId(1);
		per.setName("Debasish");
		
		Address add=new Address();
		add.setBlock("Udala");
		add.setPin(757041);
		
		per.setAdd(add);
		
		Session ses=sf.openSession();
		ses.beginTransaction();
		ses.save(per);
		Transaction tran=ses.getTransaction();
		tran.commit();
		System.out.println("Added to db");

	}
}
