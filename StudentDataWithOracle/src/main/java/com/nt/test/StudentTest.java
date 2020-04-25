package com.nt.test;

import java.io.FileInputStream;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.model.Student1;

public class StudentTest {
	public static void main(String[] args) {
		try {

			Configuration cfg = new Configuration();

			cfg.configure();

			SessionFactory sf = cfg.buildSessionFactory();

			Session ses = sf.openSession();

			Transaction tx = ses.beginTransaction();

			FileInputStream fis = new FileInputStream("E:/download/photo/th.jpg");

			byte[] barr = new byte[fis.available()];
			fis.read(barr);

			String lt = "hi,hello,how are you";
			char[] carr = lt.toCharArray();

			Student1 s = new Student1();

			s.setStdId(100);
			s.setStdName("vikas");
			s.setStdImg(barr);
			s.setStdResTxt(carr);

			ses.save(s);
			
			tx.commit();
			System.out.println("done");
			fis.close();
			ses.close();
		} catch (Exception e) {
        System.out.println("done");
		}
	}

}
