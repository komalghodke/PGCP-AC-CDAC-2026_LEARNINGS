package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	boolean saveProduct(Product p);

	List<Product> findAllProduct();

	boolean removeById(int id);

	boolean modifyById(int id, int qty, double price);

	Product findById(int id);

	List<Product> findByPrice(double pr);

}
