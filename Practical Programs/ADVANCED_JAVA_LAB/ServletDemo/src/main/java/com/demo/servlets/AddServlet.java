package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	private String msg;
	private int val;
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		 msg=config.getInitParameter("greet");
		 val=Integer.parseInt(config.getInitParameter("value"));
		System.out.println("in init method");
	}
	public void destroy() {
		System.out.println("in destroy method");
	}
      public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
    	  response.setContentType("text/html");
    	  PrintWriter out=response.getWriter();
    	  int num1=Integer.parseInt(request.getParameter("num1"));
    	  int num2=Integer.parseInt(request.getParameter("num2"));
    	  out.println("Data received "+num1+", "+num2);
    	  out.println("Message : "+msg+"Value : "+val);
    	  out.println("Addition : "+(num1+num2));
      }
      
      public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
    	  doGet(request,response);
      }
}
