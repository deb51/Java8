package com.hin.map.manyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("ManyToMany.cfg2.xml").buildSessionFactory();

		Emp em = new Emp();
		Emp em1 = new Emp();

		em.setEid(1);
		em.setEname("deba");

		em1.setEid(2);
		em1.setEname("baba");

		Project pro = new Project();
		Project pro1 = new Project();

		pro.setPid(11);
		pro.setProject("HIBERNATE");

		pro1.setPid(22);
		pro1.setProject("SPRING");

		List<Emp> l1 = new ArrayList<Emp>();
		List<Project> l2 = new ArrayList<Project>();
		l1.add(em1);
		l1.add(em);

		l2.add(pro1);
		l2.add(pro);

		em.setProjects(l2);
		pro.setEmps(l1);
		Session session = factory.openSession();
		Transaction tra = session.beginTransaction();
		session.save(em1);
		session.save(em);
		session.save(pro1);
		session.save(pro);
		
		tra.commit();

		factory.close();
	}
}
