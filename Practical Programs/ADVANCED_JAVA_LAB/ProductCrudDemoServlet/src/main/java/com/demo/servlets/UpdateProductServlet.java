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
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;


@WebServlet("/updateproduct")
public class UpdateProductServlet extends HttpServlet {

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       int pid=Integer.parseInt(request.getParameter("pid"));
	       String pname=request.getParameter("pname");
	       int qty=Integer.parseInt(request.getParameter("qty"));
	       double price=Double.parseDouble(request.getParameter("price"));
	       LocalDate mfgdate=LocalDate.parse(request.getParameter("mfgdate"),DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	       ProductService pservice=new ProductServiceImpl();
	       Product p=new Product(pid,pname,qty,price,mfgdate);
	       boolean status=pservice.updateById(p);
	       RequestDispatcher rd=request.getRequestDispatcher("displayall");
	       rd.forward(request, response);
	}

}
