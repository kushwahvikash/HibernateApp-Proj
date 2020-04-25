package com.nt.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.model.Address;
import com.nt.model.Employee;
import com.nt.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		Session ses= HibernateUtil.getSf().openSession();
		Transaction tx=null;
		try(ses) {
			tx=ses.beginTransaction();
			Address aob=new Address();
			aob.setHno("6-67");
			aob.setLoc("hyd");
			Employee eob=new Employee();
			eob.setEid(10);
			eob.setEname("Vikas");
			eob.setAddr(aob);
			ses.save(eob);
			tx.commit();
			ses.close();
			
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}

}
