package com.sarje.service;

import com.sarje.dao.MyDao;

public class MyService {
	
	private MyDao myDao;
	
	public MyService(MyDao myDao) {
		System.out.println("parameterized constructor");
		this.myDao = myDao;
	}

	public MyDao getMyDao() {
		return myDao;
	}

	public void add() {
		System.out.println("add() called");
		myDao.save();
	}
	
}
