package com.nt.test;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.model.E_mail;

public class E_mailTest {

	public static void main(String[] args) {
		try {

			// configuration object
			Configuration cfg =new Configuration();

			// load cfg.xml file
			cfg.configure();

			// build session factory object
			SessionFactory sf = cfg.buildSessionFactory();

			// open session
			Session ses = sf.openSession();

			// begin transaction
			Transaction tx = ses.beginTransaction();

			// perform save operation
			E_mail e = new E_mail();
			e.setMailId(100);
			e.setT("vikas");
			e.setForm("raj");
			e.setSubject("fun");
			e.setText("enjoy hi how are you");

			Serializable s = ses.save(e);
			Integer id = (Integer)s;

			// commit
			tx.commit();
			System.out.println("done" + id);

			// close session
			ses.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
