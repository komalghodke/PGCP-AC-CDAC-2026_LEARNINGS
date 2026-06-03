package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
   private ProductDao pdao;

	@Override
	public boolean addNewProduct() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter pid");
		int pid=sc.nextInt();
		System.out.println("Enter pname");
		String pnm=sc.next();
		System.out.println("Enter qty");
		int qty=sc.nextInt();
		System.out.println("Enter price");
		double price=sc.nextDouble();
		System.out.println("Enter date(dd-mm-yyyy");
		String dt=sc.next();
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println("Enter cid");
		int cid=sc.nextInt();
		Product p=new Product(pid,pnm,qty,price,ldt,cid);
		return pdao.saveProduct(p);
	}

	@Override
	public List<Product> getAll() {
		return pdao.findAllProduct();
	}

	@Override
	public boolean deleteById(int id) {
		return pdao.removeById(id);
	}

	@Override
	public boolean updateById(int id, int qty, double price) {
		return pdao.modifyById(id,qty,price);
	}

	@Override
	public Product getById(int id) {
		return pdao.findById(id);
	}

	@Override
	public List<Product> getByPrice(double pr) {
		return pdao.findByPrice(pr);
	}
}
