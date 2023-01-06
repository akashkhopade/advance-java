package com.sarje;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sarje.dao.AccountDao;

public class Main {

	public static void main(String[] args) {		
		ApplicationContext appCntx = new ClassPathXmlApplicationContext("cfg.xml");
		AccountDao dao = (AccountDao)appCntx.getBean(AccountDao.class);
		dao.create();
		System.out.println("========================");
		dao.deposite();
		System.out.println("========================");
		dao.withdraw();
		System.out.println("========================");
		dao.detail();
		System.out.println("========================");
		dao.block();
	}

}
