package org.parth.projectWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		//opening session
		Session session = factory.openSession();
		//get-student: 1
//		Student student = (Student)session.get(Student.class,1);
		Student student = (Student)session.load(Student.class,2);
		
		Address address = (Address)session.get(Address.class, 1);
		
		
		System.out.println(student);
//		System.out.println(address);
		
		factory.close();
		session.close();
	}
}
