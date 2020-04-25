package com.nt.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.model.Student;
import com.nt.util.HibernateUtil;

public class HUTest {
	public static void main(String[] args) {
		Session ses=null;
		Transaction tx=null;
		try {
			ses=HibernateUtil.getSf().openSession();
		  tx=ses.beginTransaction();
			
			 Student s= new Student(); 
			 s.setStdId(101);
			 s.setStdName("raj");
			 s.setStdFee(1000.0);
			 ses.save(s);
			
			tx.commit();
			
			} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		finally {
			if(ses!=null) 				
			ses.close();
		}
	}

}
