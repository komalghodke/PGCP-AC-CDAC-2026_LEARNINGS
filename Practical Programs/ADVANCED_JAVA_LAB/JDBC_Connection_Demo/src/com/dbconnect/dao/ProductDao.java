package com.dbconnect.dao;

import java.util.List;

import com.dbconnect.model.Product;

public interface ProductDao {

	boolean saveProduct(Product p);

	boolean removeById(int pid);

	List<Product> findAll();

	Product findById(int id);

	List<Product> findAllSortedByName();

	boolean updateById(int pid, int qty, double pr);

}
