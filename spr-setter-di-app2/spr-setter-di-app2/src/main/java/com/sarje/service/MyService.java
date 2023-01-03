package com.sarje.service;

import com.sarje.dao.MyDao;

public class MyService {
	
	private MyDao myDao;

	public MyDao getMyDao() {
		return myDao;
	}

	public void setMyDao(MyDao myDao) {
		System.out.println("setMyDao() called");
		this.myDao = myDao;
	}
	
	public void add() {
		System.out.println("add() called");
		myDao.save();
	}
	
}
