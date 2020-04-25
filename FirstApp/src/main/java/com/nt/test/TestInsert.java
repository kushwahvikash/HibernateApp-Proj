package com.nt.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.model.Student;

public class TestInsert {

	public static void main(String[] args) {
		try {
			// 1. create config obj
			Configuration cfg = new Configuration();

			// 2. load cfg.xml
			cfg.configure();

			// 3. build ses fact
			SessionFactory sf = cfg.buildSessionFactory();

			// 4. open one session
			Session ses = sf.openSession();
			// 5. begin Tx
			Transaction tx = ses.beginTransaction();
			// 6. perform save operation
			Student s = new Student();
			s.setStdId(10);
			s.setStdName("B");
			s.setStdFee(160.0);
			ses.save(s);
			// 7. commit
			tx.commit();

			// 8.close ses
			ses.close();
			System.out.println("done");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
