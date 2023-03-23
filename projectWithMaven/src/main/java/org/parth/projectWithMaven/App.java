package org.parth.projectWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Project Started");

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		// creating student
		Student st = new Student(2, "saurav", "hyd");

		Session session = factory.openSession();

		session.beginTransaction();
		session.save(st);
		session.getTransaction().commit();

		session.close();
	}
}
