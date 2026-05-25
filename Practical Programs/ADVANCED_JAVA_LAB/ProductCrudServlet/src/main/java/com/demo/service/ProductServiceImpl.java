package com.demo.service;

import java.util.List;

import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;
import com.demo.model.Product;

public class ProductServiceImpl implements ProductService{
        private ProductDao pdao;

		public ProductServiceImpl() {
		
			this.pdao = new ProductDaoImpl();
		}

		@Override
		public List<Product> getAll() {
			return pdao.findAll();
		}

		@Override
		public boolean addProduct(Product p) {
			return pdao.saveProduct(p);
		}

		@Override
		public Product getById(int pid) {
			return pdao.findById(pid);
		}
        
}
