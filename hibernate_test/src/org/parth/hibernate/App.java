package org.parth.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.parth.hibernate.entity.Users;

public class App{
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Users.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			// Create object of entity class type
			  Users user = new Users("PB", "1234", "parth", "bisht");
			  // Start transaction
			  session.beginTransaction();
			  // Perform operation
			  session.save(user);
			  // Commit the transaction 
			  session.getTransaction().commit();
			  System.out.println("Row added!");
			
			
		} finally {
			session.clear();
			factory.close();
		}
	}
}