package com.sarje;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.sarje.model.Clerk;
import com.sarje.model.Employee;

public class Main4 {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		ssrb.applySettings(cfg.getProperties());
		StandardServiceRegistry ssr = ssrb.build();
		SessionFactory sf = cfg.buildSessionFactory(ssr);
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("from Clerk");
		List<Clerk> lst = q.list();
		lst.forEach(ele->System.out.println(ele));
		t.commit();
		s.close();
		sf.close();
		System.out.println("done");
	}

}
