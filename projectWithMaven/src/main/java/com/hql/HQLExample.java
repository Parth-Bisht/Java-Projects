package com.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.parth.projectWithMaven.Student;

public class HQLExample {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
		String query = "from Student as s where s.city=:x and s.name=:n";
		
		Query q = session.createQuery(query);
		
		q.setParameter("x","hld");
		q.setParameter("n", "naruto");
		
		List<Student> list = q.list();
		
		for(Student student: list) {
			System.out.println(student.getName());
		}
		
		session.close();
		factory.close();
	}
}
