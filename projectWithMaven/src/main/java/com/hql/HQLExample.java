package com.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
		
		System.out.println("_________________________");
		
		Transaction tx = session.beginTransaction();
//		Query q2 = session.createQuery("delete from Student as s where s.city=:c");
//		q2.setParameter("c", "ntl");
//		int r = q2.executeUpdate();
//		System.out.println("Deleted: ");
		
//		Query q2 = session.createQuery("update Student set city=:c where name=:n");
//		q2.setParameter("c", "delhi");
//		q2.setParameter("n", "naruto");
//		int r = q2.executeUpdate();
//		System.out.println(r+"objects updated");
			
		tx.commit();
		
		Query q3 = session.createQuery("select q.question,q.questionId,a.answer from Question as q INNER JOIN q.answers as a");
		List<Object []> list3 = q3.getResultList();
		for(Object[] arr: list3) {
			System.out.println(Arrays.toString(arr));
		}
		
		session.close();
		factory.close();
	}
}
