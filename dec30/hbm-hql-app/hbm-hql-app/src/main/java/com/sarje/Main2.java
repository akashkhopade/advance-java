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
		
		selectAll();
//		selectOrder();
//		selectWhere();
//		selectWhereOr();
//		selectWhereBetween();
//		selectWhereLike();
//		selectOneProp();
//		selectMoreProp();
//		selectDistinct();
//		selectGroupFun();
//		selectGroupBy();
//		selectGroupByHaving();
//		selectSubquery();
//		delete();
		update();
		sf.close();
		System.out.println("done");
	}

	private static void selectAll() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("from Employee");
		List<Employee> lst = q.list();
		lst.forEach(ele->System.out.println(ele)); 
		t.commit();
		s.close();
	}
	private static void selectOrder() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("from Employee order by salary");
		List<Employee> lst = q.list();
		lst.forEach(ele->System.out.println(ele)); 
		t.commit();
		s.close();
	}
	
	private static void selectWhere() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("from Employee where dept = :dpt");
		q.setString("dpt", "cs");
		List<Employee> lst = q.list();
		lst.forEach(ele->System.out.println(ele)); 
		t.commit();
		s.close();
	}
	
	private static void selectWhereOr() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("from Employee where dept = :dpt1 or dept = :dpt2");
		q.setString("dpt1", "cs");
		q.setString("dpt2", "it");
		List<Employee> lst = q.list();
		lst.forEach(ele->System.out.println(ele)); 
		t.commit();
		s.close();
	}
	
	private static void selectWhereBetween() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("from Employee where salary between :sal1 and :sal2");
		q.setFloat("sal1", 9089.50f);
		q.setFloat("sal2", 999999.50f);
		List<Employee> lst = q.list();
		lst.forEach(ele->System.out.println(ele)); 
		t.commit();
		s.close();
	}
	private static void selectWhereLike() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("from Employee where name like :ptrn");
		q.setString("ptrn", "r%");
		List<Employee> lst = q.list();
		lst.forEach(ele->System.out.println(ele)); 
		t.commit();
		s.close();
	}
	private static void selectOneProp() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("select name from Employee");
		
		List<String> lst = q.list();
		lst.forEach(ele->System.out.println(ele)); 
		t.commit();
		s.close();
	}
	
	private static void selectMoreProp() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("select name,salary from Employee");
		
		List<Object[]> lst = q.list(); 
		lst.forEach(ele->System.out.println(ele[0]+" "+ele[1])); 
		t.commit();
		s.close();
	}
	
	private static void selectDistinct() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("select distinct(dept) from Employee");
		
		List<String> lst = q.list();
		lst.forEach(ele->System.out.println(ele)); 
		t.commit();
		s.close();
	}
	
	private static void selectGroupFun() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("select sum(salary) from Employee");
		
		List<Double> lst = q.list();
		lst.forEach(ele->System.out.println(ele)); 
		t.commit();
		s.close();
	}
	
	private static void selectGroupBy() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("select dept,sum(salary) from Employee group by dept");
		
		List<Object[]> lst = q.list();
		lst.forEach(ele->System.out.println(ele[0]+" "+ele[1])); 
		t.commit();
		s.close();
	}
	private static void selectGroupByHaving() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("select dept,sum(salary) from Employee group by dept having sum(salary) > :sal");
		q.setFloat("sal", 30000.50f);
		List<Object[]> lst = q.list();
		lst.forEach(ele->System.out.println(ele[0]+" "+ele[1])); 
		t.commit();
		s.close();
	}
	
	private static void selectSubquery() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("from Employee where dept = (select dept from Employee where name=:nm)");
		q.setString("nm", "ram");
		List<Employee> lst = q.list();
		lst.forEach(ele->System.out.println(ele)); 
		t.commit();
		s.close();
	}
	
	private static void delete() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("delete from Employee where name = :nm");
		q.setString("nm", "rama");
		int i = q.executeUpdate();
		System.out.println(i);
		t.commit();
		s.close();
	}
	
	private static void update() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("update Employee set dept = :dpt where name = :nm");
		q.setString("dpt", "acc");
		q.setString("nm", "shivam");
		int i = q.executeUpdate();
		System.out.println(i);
		t.commit();
		s.close();
	}
	
}
