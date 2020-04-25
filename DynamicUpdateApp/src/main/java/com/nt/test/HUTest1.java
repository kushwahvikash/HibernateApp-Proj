package com.nt.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.model.Student;
import com.nt.util.HibernateUtil;

public class HUTest1 {
	public static void main(String[] args) {
		Session ses=null;
		Transaction tx=null;
		try {
			ses=HibernateUtil.getSf().openSession();
		  tx=ses.beginTransaction();
			
			 Student s= ses.get(Student.class,101); 
			s.setStdFee(20.0);
			 
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
