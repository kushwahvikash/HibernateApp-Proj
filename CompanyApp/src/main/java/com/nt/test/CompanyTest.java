package com.nt.test;


import java.io.Serializable;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.model.Company;

public class CompanyTest {
	public static void main(String[] args) {
		try {

			Configuration cfg = new Configuration();
			cfg.configure();
			SessionFactory sf = cfg.buildSessionFactory();
			Session ses = sf.openSession();
			Transaction tx = ses.beginTransaction();

			Company co = new Company();

			co.setCid(100);
			co.setCname("raj");
			co.setAddr("hyd");

			// Type Inference
			Map<String, Double> map = Map.of("p1", 2.1,"p2",3.2,"p3",4.2);

			co.setProjs(map);
			
			Serializable ser=ses.save(co);
			
			
			tx.commit();
			System.out.println("done :"+ser);
			ses.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
