package com.akki.dao;
import java.util.List;

import com.akki.model.Expense;

public interface ExpenseDao {
	void save(Expense expense);
	
	List<Expense> selectAll(int uid);

	void deleteById(int id);
	
	Expense selectById(int id);
	
	void update(Expense expense);
}
