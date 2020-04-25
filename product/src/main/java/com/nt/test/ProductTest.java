package com.nt.test;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.model.Product;

public class ProductTest {
	public static void main(String[] args) {
		try {

			Configuration cfg = new Configuration().configure();
			
			SessionFactory sf = cfg.buildSessionFactory();
			
			Session ses = sf.openSession();
			
			Transaction tx = ses.beginTransaction();
			
			Product p = new Product();
			
			p.setProdId(101);
			p.setProdCode("abc");

			Date d = new Date(System.currentTimeMillis());
			
			p.setMfgDate(d);
			p.setExpDate(d);
			p.setTestSlot(d);
			
			ses.save(p);
			
			tx.commit();

			ses.close();

		} catch (Exception e) {
         e.printStackTrace();
		}
	}

}
