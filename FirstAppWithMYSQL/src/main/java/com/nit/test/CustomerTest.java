package com.nit.test;
import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nit.model.Customer;

public class CustomerTest {
public static void main(String[] args) {
	

try {
	// 1. create configuration  object
				Configuration cfg = new Configuration();

				// 2. load cfg.xml
				cfg.configure();

				// 3. build ses fact
				SessionFactory sf = cfg.buildSessionFactory();

				// 4. open one session
				Session ses = sf.openSession();
				// 5. begin Tx
				Transaction tx = ses.beginTransaction();
				// 6. perform save operation
				Customer c = new Customer();
				c.setCustId(100);
				c.setCustName("vikas");
				c.setCustAddrs("HYD");
				
				Serializable s=ses.save(c);
				Integer id=(Integer)s;
				//ses.save(c);
				// 7. commit
				tx.commit();

				// 8.close ses
				ses.close();
				System.out.println("done "+id);
	
                   }catch(Exception e) {
	           e.printStackTrace();
              }
      }
}