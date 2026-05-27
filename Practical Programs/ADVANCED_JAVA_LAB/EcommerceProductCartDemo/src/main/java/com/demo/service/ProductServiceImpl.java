package com.demo.service;

import java.util.List;

import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;
import com.demo.model.Product;

public class ProductServiceImpl implements ProductService{
      private ProductDao pdao;

	  public ProductServiceImpl() {
		super();
		this.pdao = new ProductDaoImpl();
	  }

	  @Override
	  public List<Product> getAllProductByCid(int catid) {
		return pdao.findAllProductByCid(catid);
	  }
      
}
