package com.nt.test;

import java.util.ArrayList;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.model.StudentInfo1;

public class StudentInfoTest {
	public static void main(String[] args) {
		try {

			Configuration cfg = new Configuration();
			cfg.configure();
			SessionFactory sf =cfg.buildSessionFactory();
			Session ses = sf.openSession();
			Transaction tx = ses.beginTransaction();
			StudentInfo1 s1 = new StudentInfo1();
			s1.setStdId(100);
			s1.setStdName("vikas");
			s1.setStdFee(6.8);
			//List<Double> mrks = List.of(80.0, 98.0, 89.8);
			List<Double> mrks=new ArrayList<>();
			mrks.add(80.0);
			mrks.add(98.0);
			mrks.add(89.0);

			s1.setMarks(mrks);

			ses.save(s1);
			tx.commit();

			System.out.println("done");
			ses.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
