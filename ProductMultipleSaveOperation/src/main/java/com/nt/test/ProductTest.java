package com.nt.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.model.Product;

public class ProductTest {
	public static void main(String[] args) {
		try {
			Configuration cfg=new Configuration();
			cfg.configure();
			SessionFactory sf=cfg.buildSessionFactory();
			Session ses=sf.openSession();
			Transaction tx=ses.beginTransaction();
			
			Product p1=new Product();
			p1.setProdId(101);
			p1.setProdCode("PEN");
			p1.setProdCost(5.0);
			ses.save(p1);
			
			
			Product p2=new Product();
			p2.setProdId(102);
			p2.setProdCode("BOOK");
			p2.setProdCost(20.0);
			ses.save(p2);
			
			
			Product p3=new Product();
			p3.setProdId(103);
			p3.setProdCode("textBook");
			p3.setProdCost(40.0);
			ses.save(p3);
			
			
			
			tx.commit();
			ses.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
