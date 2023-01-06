package com.sarje.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sarje.model.Product;

@Repository
public interface ProductDao extends CrudRepository<Product, Integer> {

}
