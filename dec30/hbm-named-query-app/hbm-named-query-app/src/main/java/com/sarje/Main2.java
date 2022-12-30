package com.sarje;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.sarje.model.Employee;

public class Main2 {
	private static SessionFactory sf;
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		ssrb.applySettings(cfg.getProperties());
		StandardServiceRegistry ssr = ssrb.build();
		sf = cfg.buildSessionFactory(ssr);
		
//		selectAll();
		selectAll1();

		sf.close();
		System.out.println("done");
	}

	private static void selectAll() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Query q = s.getNamedQuery("selAll");
		
		List<Employee> lst = q.list();
		lst.forEach(ele->System.out.println(ele)); 
		t.commit();
		s.close();
	}
	
	private static void selectAll1() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Query q = s.getNamedQuery("selAll_1");
		
		List<Employee> lst = q.list();
		lst.forEach(ele->System.out.println(ele)); 
		t.commit();
		s.close();
	}
	
}
