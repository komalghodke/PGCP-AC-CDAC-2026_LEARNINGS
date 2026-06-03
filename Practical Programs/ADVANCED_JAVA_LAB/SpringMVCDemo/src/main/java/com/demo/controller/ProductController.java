package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.Product;
import com.demo.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService pservice;

	@GetMapping("/viewProducts")
	public ModelAndView getAllProducts() {
		List<Product> plist = pservice.getAllProduct();
		return new ModelAndView("displayall", "plist", plist);
	}

	// show form to accept new productDetails
	public String addProductForm() {
		return "addproduct";
	}

	// retrieve data from form and insert into table
	private ModelAndView insertProduct() {
		return null;

	}
}
