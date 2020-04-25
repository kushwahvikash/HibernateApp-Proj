package com.nt.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.model.EmpContruct;
import com.nt.model.Employee;
import com.nt.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		Session ses= HibernateUtil.getSf().openSession();
		Transaction tx=null;
		try(ses) {
			tx=ses.beginTransaction();
			EmpContruct ecob=new EmpContruct();
			Date d = new Date(System.currentTimeMillis());
			ecob.setStartdate(d);
			ecob.setEnddate(d);
			Employee eob=new Employee();
			eob.setEid(10);
			eob.setEname("Vikas");
			
			ses.save(eob);
			tx.commit();
			ses.close();
			
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}

}
