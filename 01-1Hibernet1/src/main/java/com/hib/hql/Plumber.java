package com.hib.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hin.map.manyToMany.Emp;

public class Plumber {
	public static void main(String[] args) {


		SessionFactory factory=new Configuration().configure("HQL_cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		
		List<Emp> list = session.createQuery("from Emp").list();
		
	for(Emp emp:list) {
		System.out.println(emp.getEname()+" :: "+emp.getEid());
	}
		session.close();
		factory.close();
	}
}
