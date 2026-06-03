package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	boolean addNewProduct();

	List<Product> getAll();

	boolean deleteById(int id);

	boolean updateById(int id, int qty, double price);

	Product getById(int id);

	List<Product> getByPrice(double pr);

}
