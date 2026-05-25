package com.demo.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.demo.model.Product;
import com.demo.service.ProductServiceImpl;
import com.demo.service.ProductService;

@WebServlet("/insertdata")
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pid=Integer.parseInt(request.getParameter("pid"));
		String pname=request.getParameter("pname");
		int qty=Integer.parseInt(request.getParameter("qty"));
		double price=Double.parseDouble(request.getParameter("price"));
		String dt=request.getParameter("mfgdate");
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		Product p=new Product(pid,pname,qty,price,ldt);
		ProductService pservice=new ProductServiceImpl();
		boolean status=pservice.addProduct(p);
		RequestDispatcher rd=request.getRequestDispatcher("displayall");
		rd.forward(request, response);
		
	}

}
