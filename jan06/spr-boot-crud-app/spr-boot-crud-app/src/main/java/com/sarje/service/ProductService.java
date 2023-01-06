package com.sarje.service;

import java.util.List;

import com.sarje.model.Product;

public interface ProductService {
	void add(Product product);
	void modify(Product product);
	void removeById(int id);
	Product getById(int id);
	List<Product> getAll();
}
