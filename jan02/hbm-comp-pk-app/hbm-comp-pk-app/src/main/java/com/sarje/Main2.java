package com.sarje;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.sarje.model.Student;
import com.sarje.model.StudentPk;

public class Main2 {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		ssrb.applySettings(cfg.getProperties());
		StandardServiceRegistry ssr = ssrb.build();
		SessionFactory sf = cfg.buildSessionFactory(ssr);
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		StudentPk studentPk = new StudentPk(2, 12);
		Student student = (Student)s.get(Student.class, studentPk);
		System.out.println(student);
		t.commit();
		s.close();
		sf.close();
		System.out.println("done");
	}

}
