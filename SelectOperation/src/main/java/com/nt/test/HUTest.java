package com.nt.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.model.Student;
import com.nt.util.HibernateUtil;

public class HUTest {
	public static void main(String[] args) {
		Session ses = HibernateUtil.getSf().openSession();
		Transaction tx = null;
		try (ses) {

			Student s = ses.get(Student.class, 100);
			Student s1 = ses.get(Student.class, 100);
			Student s2 = ses.get(Student.class, 100);
			System.out.println(s);
			System.out.println(s1);
			System.out.println(s2);

		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}

	}

}
