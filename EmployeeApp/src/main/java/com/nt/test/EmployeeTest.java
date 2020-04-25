package com.nt.test;



import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.model.Employee;

public class EmployeeTest {
	public static void main(String[] args) {

		try {

			Configuration cfg = new Configuration();
			cfg.configure();
			SessionFactory sf = cfg.buildSessionFactory();
			Session ses = sf.openSession();
			Transaction tx = ses.beginTransaction();

			Employee eo = new Employee();
			eo.setEmpId(101);
			eo.setEmpName("aj");
			eo.setEmpSal(3.0);
			Set<String> s = Set.of("nit", "htc", "mno");
			eo.setPrjs(s);
			ses.save(eo);

			tx.commit();
			System.out.println("done");
			ses.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
