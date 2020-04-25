package com.nt.test;

import org.hibernate.Session;

import com.nt.model.Student;
import com.nt.util.HibernateUtil;

public class StudentTest {
	public static void main(String[] args) {
		Session ses = HibernateUtil.getSf().openSession();

		try (ses) {

			//Student s =(Student)ses.get(Class.forName("com.nt.model.Student"),11);

			Student s=(Student)ses.get(Student.class.getName(), 10);
			
			System.out.println("done::\t" + s);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
