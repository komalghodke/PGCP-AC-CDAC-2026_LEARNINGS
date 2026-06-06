package com.demo.MySpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.MySpringBoot.Product.Product;
import com.demo.MySpringBoot.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDao pdao;

	@Override
	public List<Product> getAllProducts() {
		return pdao.findAll();
	}

}
