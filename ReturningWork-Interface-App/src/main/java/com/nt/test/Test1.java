package com.nt.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.Session;
import org.hibernate.jdbc.ReturningWork;

import com.nt.util.HibernateUtil;

public class Test1 {
	public static void main(String[] args) {
		Session ses = HibernateUtil.getSf().openSession();
		try (ses) {
			ses.doReturningWork(
					new ReturningWork<Integer>() {			
				public Integer execute(Connection con) throws SQLException {
					String sql = "INSERT INTO STUDENT VALUES (10,70.9,'raju')";
					Statement st = con.createStatement();
					int count = st.executeUpdate(sql);
					System.out.println(count);
					return count;

				}
			});
			System.out.println("............bye..................");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
