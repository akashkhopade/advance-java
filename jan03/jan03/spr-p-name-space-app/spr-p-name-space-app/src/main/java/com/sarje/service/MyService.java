package com.sarje.service;

import com.sarje.dao.MyDao;

public class MyService {
	
	private int serviceId;
	private MyDao myDao;

	
	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		System.out.println("setServiceId() called");
		this.serviceId = serviceId;
	}

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
