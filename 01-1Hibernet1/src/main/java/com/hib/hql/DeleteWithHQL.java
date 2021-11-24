package com.hib.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hin.map.manyToMany.Emp;

public class DeleteWithHQL {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("HQL_cfg.xml").buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("delete from Emp as e where e.eid=: x");
		query.setParameter("x", 1);
		query.executeUpdate();

		tx.commit();
		session.close();
		factory.close();
	}
}
