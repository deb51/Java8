package com.cgi;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hib.embadableAnnotation.Address;
import com.hib.embadableAnnotation.Person;

public class FileMain {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("CgiCfg.xml");// here give xml location
		SessionFactory sf = cfg.buildSessionFactory();// create session factory object
		// create class object
		FileDemo f = new FileDemo();
		f.setFileId(101);
		f.setFileName("pamfile1");
		f.setOwnerId(001);
		f.setCreationDate(new Date(336614400000L));

		FileDemo f1 = new FileDemo();
		f1.setFileId(102);
		f1.setFileName("pamfile2");
		f1.setOwnerId(002);
		f1.setCreationDate(new Date());

		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();

		session.save(f);
		session.save(f1);

		trans.commit();
		session.close();

	}
}
