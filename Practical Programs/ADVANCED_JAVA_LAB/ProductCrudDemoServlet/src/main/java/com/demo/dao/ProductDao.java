package com.demo.dao;

import java.util.List;

import com.demo.model.Product;

public interface ProductDao {

	List<Product> findAll();

	boolean saveProduct(Product p);

	Product findById(int pid);

	boolean modifyById(Product p);

	boolean removeById(int pid);

}
