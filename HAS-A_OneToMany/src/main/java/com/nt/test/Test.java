package com.nt.test;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.model.Module;
import com.nt.model.Project;
import com.nt.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		Session ses = HibernateUtil.getSf().openSession();
		Transaction tx = null;
		try (ses) {
			tx = ses.beginTransaction();
			Module mod1 = new Module();
			mod1.setModId(25);
			mod1.setModCode("m1");

			Module mod2 = new Module();
			mod2.setModId(26);
			mod2.setModCode("m2");

			Module mod3 = new Module();
			mod3.setModId(27);
			mod3.setModCode("m3");

			List<Module> mobs = Arrays.asList(mod1, mod2, mod3);
			Project p = new Project();
			p.setPrjId(503);
			p.setPrjName("NIT");
			p.setMobs(mobs);

			ses.save(p);
			ses.save(mod1);
			ses.save(mod2);
			ses.save(mod3);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}

}
