package com.hib.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hin.map.manyToMany.Emp;

public class Plumber2 {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("HQL_cfg.xml").buildSessionFactory();
		Session session = factory.openSession();

		Query query = session.createQuery("from Emp where eid=: x");
		query.setParameter("x", 1);
		List<Emp> list = query.list();

		for (Emp emp : list) {
			System.out.println(emp.getEname() + " :: " + emp.getEid());
		}
		session.close();
		factory.close();
	}
}
