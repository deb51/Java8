package com.hib.oneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToMAnyMain {
	public static void main(String[] args) {

		// create session factory object
		SessionFactory sf = new Configuration().configure("ManyToOneCfg.xml").buildSessionFactory();

		// create entity object

		Question question = new Question();
		question.setQuestion_id(101);
		question.setQuestion("What do you like");

		Answer ans = new Answer();
		ans.setAns_id(001);
		ans.setAnswer("i like traveling");
		ans.setQuestion(question);

		Answer ans1 = new Answer();
		ans1.setAns_id(002);
		ans1.setAnswer("I like music");
		ans1.setQuestion(question);

		Answer ans2 = new Answer();
		ans2.setAns_id(003);
		ans2.setAnswer("I like eating");
		ans2.setQuestion(question);

		List<Answer> list = new ArrayList();
		list.add(ans);
		list.add(ans1);
		list.add(ans2);

		question.setAnswer(list);

		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		session.save(question);
		session.save(ans);
		session.save(ans1);
		session.save(ans2);
		trans.commit();
		session.close();
		sf.close();

	}
}
