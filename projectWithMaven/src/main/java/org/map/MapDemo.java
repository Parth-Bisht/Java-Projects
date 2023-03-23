package org.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Question q1 = new Question();
		q1.setQuestionId(1);
		q1.setQuestion("What is Java?");
		
		Answer a1 = new Answer();
		a1.setAnswerId(121);
		a1.setAnswer("Java is programming language");
		a1.setQuestion(q1);
		
		q1.setAnswer(a1);
		
		Question q2 = new Question();
		q2.setQuestionId(2);
		q2.setQuestion("What is Collection framework?");
		
		Answer a2 = new Answer();
		a2.setAnswerId(131);
		a2.setAnswer("API to work with objects in java");
		a2.setQuestion(q2);
		
		q2.setAnswer(a2);
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		session.save(q1);
		session.save(q2);
		session.save(a1);
		session.save(a2);
		session.getTransaction().commit();
		
		Question newQ = (Question)session.get(Question.class, 2);
		System.out.println(newQ.getQuestion());
		System.out.println(newQ.getAnswer().getAnswer());
		
		session.close();
		factory.close();
	}
}
