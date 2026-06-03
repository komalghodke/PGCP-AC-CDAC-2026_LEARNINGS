package com.demo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;

import com.demo.beans.Product;
import com.demo.service.ProductService;

public class TestJDBCCRUDDemo {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("myspringconfig.xml");
		ProductService pservice=(ProductService) ctx.getBean("productServiceImpl");
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
		System.out.println("1. Add new product\n2. delete Product by id\n3. update product byid");
		System.out.println("4. display all\n5.display by id\nice6. display by price\n7. exit\n choice :");
		System.out.println("Enter choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1->{
			boolean status=pservice.addNewProduct();
			if(status) {
				System.out.println("Product added successfully");
			}else {
				System.out.println("not Added");
			}
			
		}
		case 2->{
			System.out.println("Enter id");
			int id=sc.nextInt();
			boolean status=pservice.deleteById(id);
			if(status) {
				System.out.println("Product deleted successfully");
			}else {
				System.out.println("not Found");
			}
		}
		case 3->{
			System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("Enter qty");
			int qty=sc.nextInt();
			System.out.println("Enter price");
		    double price=sc.nextDouble();
		    boolean status=pservice.updateById(id,qty,price);
		    if(status) {
				System.out.println("Product updated successfully");
			}else {
				System.out.println("not Found");
			}
		}
		case 4->{
			List<Product> plist=pservice.getAll();
			plist.forEach(System.out::println);
			
		}
		case 5->{
			System.out.println("Enter id");
			int id=sc.nextInt();
			Product p=pservice.getById(id);
			if(p!=null) {
				System.out.println(p);
			}else {
				System.out.println("not found");
			}
		}
		case 6->{
			System.out.println("Enter price");
			double pr=sc.nextDouble();
			List<Product> plst=pservice.getByPrice(pr);
			if(plst!=null) {
				plst.forEach(System.out::println);
			}else {
				System.out.println("not found");
			}
		}
		case 7->{
			System.out.println("Thank you for visiting ........");
			sc.close();
		}
		default->{
			System.out.println("Wrong choice");
		}
		}
		
		}while(choice!=7);
		

	}

}
