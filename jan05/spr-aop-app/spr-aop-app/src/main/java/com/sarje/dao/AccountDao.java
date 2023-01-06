package com.sarje.dao;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDao {
	public void create() {
		System.out.println("create account");
	}
	public void deposite() {
		System.out.println("deposite");
	}
	public void withdraw() {
		System.out.println("withdraw");
	}
	public void detail() {
		System.out.println("account detail");
	}
	public void block() {
		System.out.println("block account");
		int i = 12/0;
	}
}
