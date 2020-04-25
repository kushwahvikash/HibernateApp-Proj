package com.nt.test;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.model.Course;
import com.nt.model.Student;
import com.nt.util.HibernateUtil;

public class Test00 {
	public static void main(String[] args) {
		Session ses = HibernateUtil.getSf().openSession();
		Transaction tx = null;
		try {
			tx = ses.beginTransaction();

			Course c1 = new Course(131, "HIB", 200.0);
			Course c2 = new Course(132, "SPR", 300.0);
			Course c3 = new Course(133, "BOOT", 400.0);

			Student s1 = new Student();
			s1.setStdId(10);
			s1.setStdName("vikas");
			s1.setStdmail("V@mail.com");
			s1.setSobj(Arrays.asList(c1, c2));// link

			Student s2 = new Student();
			s2.setStdId(11);
			s2.setStdName("raju");
			s2.setStdmail("R@mail.com");
			s2.setSobj(Arrays.asList(c2, c3));// link

			Student s3 = new Student();
			s3.setStdId(12);
			s3.setStdName("Raja");
			s3.setStdmail("Raj@mail.com");
			s3.setSobj(Arrays.asList(c1, c3));// link

			ses.save(c1);
			ses.save(c2);
			ses.save(c3);
			ses.save(s1);
			ses.save(s2);
			ses.save(s3);
			tx.commit();

		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}

}
