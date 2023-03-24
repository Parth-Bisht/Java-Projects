package org.map;

import java.util.ArrayList;
import java.util.List;

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
		
		Answer a2 = new Answer();
		a2.setAnswerId(131);
		a2.setAnswer("With the help of java we can create softwares");
		a2.setQuestion(q1);
		
		Answer a3 = new Answer();
		a3.setAnswerId(141);
		a3.setAnswer("Java has different types of frameworks.");
		a3.setQuestion(q1);	
		
		List<Answer> list = new ArrayList<Answer>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		q1.setAnswers(list);
		
		Session session = factory.openSession();
		
//		session.beginTransaction();
//		session.save(q1);
//		session.save(a1);
//		session.save(a2);
//		session.save(a3);
//		session.getTransaction().commit();
		
		Question q = (Question)session.get(Question.class, 1);
		System.out.println(q.getQuestion());
		
		for(Answer a: q.getAnswers()) {
			System.out.println(a.getAnswer());
		}
		
		session.close();
		factory.close();
	}
}
