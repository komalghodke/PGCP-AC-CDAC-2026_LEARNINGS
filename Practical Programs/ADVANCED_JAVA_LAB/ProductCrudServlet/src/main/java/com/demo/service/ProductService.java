package com.demo.service;

import java.util.List;

import com.demo.model.Product;

public interface ProductService {

	List<Product> getAll();

	boolean addProduct(Product p);

	Product getById(int pid);

}
