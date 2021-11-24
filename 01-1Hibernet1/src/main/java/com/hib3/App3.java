package com.hib3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App3 {
public static void main(String[] args) {
	
	Configuration cfg=new Configuration();
	cfg.configure("Hibernet1.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	Session session=factory.openSession();
	Emp emp=new Emp();
	emp.setEname("deba");
	emp.setSal(5000.00);
	session.save(emp);
	Transaction transaction=session.beginTransaction();
	
	transaction.commit();
	session.close();
	
	
	
	
}
}
