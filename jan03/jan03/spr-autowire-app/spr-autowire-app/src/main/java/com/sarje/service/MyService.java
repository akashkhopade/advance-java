package com.sarje.service;

import com.sarje.dao.MyDao;

public class MyService {
	
	private MyDao myDao;
	
	public MyService() {
		System.out.println("no-arg constructor");
	}
	
	public MyService(MyDao myDao) {
		System.out.println("param constructor");
		this.myDao = myDao;
	}

	public MyDao getMyDao() {
		return myDao;
	}

	public void setMyDao(MyDao myDao) {
		System.out.println("setMyDao() ==========");
		this.myDao = myDao;
	}
	
	public void add() {
		System.out.println("add() called");
		myDao.save();
	}
	
}
