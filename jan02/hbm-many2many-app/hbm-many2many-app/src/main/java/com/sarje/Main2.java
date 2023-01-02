package com.sarje;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.sarje.model.Course;


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
		Query q = s.createQuery("from Course");
		List<Course> lst = q.list();
		lst.forEach(ele->{
			System.out.println(ele);
			ele.getSubjects().forEach(el->System.out.println(el));
		});
		
		t.commit();
		s.close();
		sf.close();
		System.out.println("done");
	}

}
