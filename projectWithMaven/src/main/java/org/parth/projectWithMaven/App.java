package org.parth.projectWithMaven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("Project Started");

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		// creating student
		Student st = new Student(1, "parth", "hld");
		
		//creating object of address class		
		Address ad = new Address();
		ad.setStreet("street1");
		ad.setCity("DELHI");
		ad.setOpen(true);
		ad.setAddedDate(new Date());
		ad.setX(12.2343434d);
		
		//reading image
		FileInputStream fis = new FileInputStream("src/main/java/pic.png");
		byte[] data = new byte[fis.available()];
		fis.read();
		ad.setImage(data);		
		
		//opening session
		Session session = factory.openSession();

		session.beginTransaction();
		session.save(st);
		session.save(ad);
		session.getTransaction().commit();

		session.close();
		System.out.println("Done!");
	}
}
