package com.nt.test;

import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.model.Company;

public class Test {
	public static void main(String[] args) {
		try {
			
			Configuration cfg=new Configuration();
			cfg.configure();
			SessionFactory sf=cfg.buildSessionFactory();
			Session ses=sf.openSession();
			Transaction tx=ses.beginTransaction();
			
			Company c=new Company();
			c.setCid(101);
			c.setCname("vikas");
			c.setAddr("HYD");
			
			Map<String,Double> map=Map.of("p1",2.1,"p2",3.2,"p3",4.2);
			c.setProjs(map);
			
			
			
			ses.save(c);
			System.out.println("done");
			tx.commit();
			ses.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
