package com.hib.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class UpdateWithHQL {
	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure("HQL_cfg.xml").buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("update Emp as e set e.ename='dhruva'  where e.eid=2 ");
		query.executeUpdate();

		tx.commit();
		session.close();
		sf.close();
	}
}
