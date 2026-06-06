package com.demo.MySpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.MySpringBoot.Product.Product;
import com.demo.MySpringBoot.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService pservice;
	
	@GetMapping("/products")
	public List<Product> getAllProduct(){
		List<Product> plist=pservice.getAllProducts();
		return plist;
	}

}
