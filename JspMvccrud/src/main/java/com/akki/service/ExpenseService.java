package com.akki.service;

import java.util.List;

import com.akki.model.Expense;

public interface ExpenseService { 
	
	void add(Expense expense);
	
	List<Expense> getAll(int uid);
	
	void removeById(int id);
	
	Expense getById(int id);
	
	void modify(Expense expense);

}
