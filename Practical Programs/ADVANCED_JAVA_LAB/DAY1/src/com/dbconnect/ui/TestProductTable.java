package com.dbconnect.ui;

import java.util.List;
import java.util.Scanner;

import com.dbconnect.model.Product;
import com.dbconnect.service.LoginService;
import com.dbconnect.service.LoginServiceImpl;
import com.dbconnect.service.ProductService;
import com.dbconnect.service.ProductServiceImpl;

public class TestProductTable {
	public static void main(String[] args) {
		// Check user is valid or not
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username:");
		String uname = sc.next();
		System.out.println("Enter Password: ");
		String passwd = sc.next();
		LoginService lservice = new LoginServiceImpl();
		ProductService pservice = new ProductServiceImpl();
		String role = lservice.validateUser(uname, passwd);
		if (role != null) {
			if (role.equals("admin")) {
				System.out.println("you are admin");
				int choice = 0;
				do {
					System.out.println("1. Add new Product\n2. Delete product by id\n3. Update product by id "
							+ "\n4. Display All\n 5. Display by id \n 6. display in sorted order\n 7.exit\n Choice :");
					choice = sc.nextInt();
					switch (choice) {
					case 1 -> {
						boolean status = pservice.addNewProduct();
						if (status) {
							System.out.println("product aadded successfully");
						} else {
							System.out.println("error occured");
						}
					}
					case 2 -> {
						System.out.println("Enter id");
						int pid = sc.nextInt();
						boolean status = pservice.deleteById(pid);
						if (status) {
							System.out.println("deleted successfully");
						}
						System.out.println(pid + " not found");
					}
					case 3 -> {
						System.out.println("Enter id");
						int pid = sc.nextInt();
						System.out.println("Enter new qty");
						int qty = sc.nextInt();
						System.out.println("Enter price");
						double pr = sc.nextDouble();
						boolean status = pservice.modifyById(pid, qty, pr);
						if (status) {
							System.out.println("updation done");
						} else {
							System.out.println(pid + " not found");
						}
					}
					case 4 -> {
						List<Product> plist = pservice.getAll();
						plist.forEach(System.out::println);
					}
					case 5 -> {
						System.out.println("enter id to search");
						int id = sc.nextInt();
						Product p = pservice.getById(id);
						if (p != null) {
							System.out.println(p);
						} else {
							System.out.println(id + " not found");
						}
					}
					case 6 -> {
						List<Product> plist = pservice.getAllSortedByName();
						plist.forEach(System.out::println);
					}
					case 7 -> {
						System.out.println("Thank you for visiting .........");
						lservice.closeMyConnection();
					}
					default -> {
						System.out.println("wrong choice");
					}
					}
				} while (choice != 7);

			} else if (role.equals("user")) {
				System.out.println("you are user role");
			} else {
				System.out.println("invalid Credentials, Pls relogin");
			}
		} else {
			System.out.println("invalid Credentials, Pls relogin");
		}
	}
}
