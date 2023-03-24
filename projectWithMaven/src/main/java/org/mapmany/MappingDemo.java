package org.mapmany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MappingDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Emp e1 = new Emp();
		Emp e2 = new Emp();

		e1.setEid(34);
		e1.setName("Ram");

		e2.setEid(35);
		e2.setName("Shyam");

		Project p1 = new Project();
		Project p2 = new Project();

		p1.setPid(12121);
		p1.setProjectName("Library managaement system");

		p2.setPid(432);
		p2.setProjectName("Chat bot");

		List<Emp> listEmp = new ArrayList<Emp>();
		List<Project> listProject = new ArrayList<Project>();

		listEmp.add(e1);
		listEmp.add(e2);

		listProject.add(p1);
		listProject.add(p2);

		e1.setProjects(listProject);
		p2.setEmps(listEmp);

		Session session = factory.openSession();

		session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		session.getTransaction().commit();

		session.close();
		factory.close();
	}

}
