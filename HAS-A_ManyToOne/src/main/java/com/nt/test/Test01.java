package com.nt.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.nt.model.Contract;
import com.nt.model.Quote;
import com.nt.util.HibernateUtil;

public class Test01 {
	public static void main(String[] args) {
		Session ses = HibernateUtil.getSf().openSession();
		Transaction tx = null;
		try (ses) {
			tx = ses.beginTransaction();

			Quote qt = new Quote();
			qt.setQteId(501);
			qt.setQteMinAmt(3.9);
			qt.setQteCode("rtm");

			Contract c1 = new Contract();
			c1.setConId(10);
			c1.setVendor("A");
			c1.setRegCode("a1");
			c1.setQob(qt);

			Contract c2 = new Contract();
			c2.setConId(11);
			c2.setVendor("B");
			c2.setRegCode("b2");
			c2.setQob(qt);

			Contract c3 = new Contract();
			c3.setConId(12);
			c3.setVendor("C");
			c3.setRegCode("c3");
			c3.setQob(qt);

			ses.save(qt);
			ses.save(c1);
			ses.save(c2);
			ses.save(c3);

			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}

}
