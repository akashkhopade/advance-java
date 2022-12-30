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
		selectOneProp();

		sf.close();
		System.out.println("done");
	}

	private static void selectAll() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		SQLQuery q = s.createSQLQuery("select * from Employee");
		q.addEntity(Employee.class);
		
		List<Employee> lst = q.list();
		lst.forEach(ele->System.out.println(ele)); 
		t.commit();
		s.close();
	}
	
	private static void selectOneProp() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		SQLQuery q = s.createSQLQuery("select name from Employee");
		
		List<String> lst = q.list();
		lst.forEach(ele->System.out.println(ele)); 
		t.commit();
		s.close();
	}
	
}
