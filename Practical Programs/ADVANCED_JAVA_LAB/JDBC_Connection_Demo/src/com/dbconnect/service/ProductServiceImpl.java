package com.dbconnect.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.dbconnect.dao.ProductDao;
import com.dbconnect.dao.ProductDaoImpl;
import com.dbconnect.model.Product;

public class ProductServiceImpl implements ProductService {
	private ProductDao pdao;

	public ProductServiceImpl() {
		this.pdao = new ProductDaoImpl();
	}

	@Override
	public boolean addNewProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter pid");
		int pid = sc.nextInt();
		System.out.println("enetr name");
		String nm = sc.next();
		System.out.println("enter qty");
		int qty = sc.nextInt();
		System.out.println("enter price");
		double pr = sc.nextDouble();
		System.out.println("enetr mfg date (dd/mm/yyyy)");
		String dt = sc.next();
		LocalDate ldt = LocalDate.parse(dt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Product p = new Product(pid, nm, qty, pr, ldt);
		return pdao.saveProduct(p);
	}

	@Override
	public boolean deleteById(int pid) {
		return pdao.removeById(pid);
	}

	@Override
	public boolean modifyById(int pid, int qty, double pr) {
		return pdao.updateById(pid, qty, pr);
	}

	@Override
	public List<Product> getAll() {
		return pdao.findAll();
	}

	@Override
	public Product getById(int id) {
		return pdao.findById(id);
	}

	@Override
	public List<Product> getAllSortedByName() {
		return pdao.findAllSortedByName();
	}

}
