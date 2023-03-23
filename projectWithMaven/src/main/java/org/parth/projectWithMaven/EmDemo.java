package org.parth.projectWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Student st = new Student();
		st.setId(5);
		st.setCity("CHINE");
		st.setName("kimyoung");
		
		Certificate certificate = new Certificate("android","2 months");

		st.setCerti(certificate);
		
		Student st2 = new Student();
		st2.setId(6);
		st2.setCity("aligarh");
		st2.setName("yusuf");
		
		Certificate certificate1 = new Certificate("web","6 months");

		st2.setCerti(certificate1);
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		session.save(st);
		session.save(st2);
		session.getTransaction().commit();
		
		factory.close();
		session.close();
	}

}
