package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CalculateServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		  response.setContentType("text/html");
		  PrintWriter out=response.getWriter();
		  int num1=Integer.parseInt(request.getParameter("num1"));
		  String btn=request.getParameter("btn");
		  if(btn.equals("sub")) {
			  int num2=Integer.parseInt(request.getParameter("num2"));
			  out.println("subtraction : "+(num1-num2));
		  }else {
			  int f=factorial(num1);
			  out.println("Factorial : "+f);
		  }
		  
	}

	private int factorial(int num1) {
		int f=1;
		for(int i=1;i<=num1;i++) {
			f=f*i;
		}
		return f;
	}

}
