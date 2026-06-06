package com.demo.MySpringBoot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.MySpringBoot.Product.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{

}
