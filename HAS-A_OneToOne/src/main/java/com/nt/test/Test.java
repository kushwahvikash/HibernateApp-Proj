package com.nt.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
 import com.nt.model.Employee;
import com.nt.model.PanCard;
import com.nt.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		Session ses = HibernateUtil.getSf().openSession();
		Transaction tx = null;
		try {
			tx = ses.beginTransaction();

			PanCard p1 = new PanCard(123, "PY1", "Raja");
			PanCard p2 = new PanCard(124, "HR2", "Golu");

			Employee e1 = new Employee();
			e1.setEmpId(11);
			e1.setEmpName("Raju");
			e1.setEmpSal(4.8);
			e1.setPan(p1);

			Employee e2 = new Employee();
			e2.setEmpId(12);
			e2.setEmpName("Golu");
			e2.setEmpSal(9.7);
			e2.setPan(p2);

			ses.save(p1);
			ses.save(p2);
			ses.save(e1);
			ses.save(e2);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}
}
