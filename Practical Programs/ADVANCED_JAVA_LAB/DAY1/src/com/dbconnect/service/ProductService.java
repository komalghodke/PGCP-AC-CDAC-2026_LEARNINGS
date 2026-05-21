package com.dbconnect.service;

import java.util.List;

import com.dbconnect.model.Product;

public interface ProductService {

	boolean addNewProduct();

	boolean deleteById(int pid);

	boolean modifyById(int pid, int qty, double pr);

	List<Product> getAll();

	Product getById(int id);

	List<Product> getAllSortedByName();

}
