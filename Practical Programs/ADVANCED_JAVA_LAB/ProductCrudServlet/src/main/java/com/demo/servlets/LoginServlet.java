package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.demo.model.MyUser;
import com.demo.service.LoginService;
import com.demo.service.LoginServiceImpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		  response.setContentType("text/html");
		  PrintWriter out=response.getWriter();
		  String username=request.getParameter("uname");
		  String password=request.getParameter("passwd");
		  LoginService lservice=new LoginServiceImpl();
		  MyUser user=lservice.validateUser(username,password);
		  if(user!=null) {
			  RequestDispatcher rd=request.getRequestDispatcher("displayall");
			  rd.forward(request, response);
		  }else {
			  out.println("invalid credentials, pls relogin");
			  RequestDispatcher rd=request.getRequestDispatcher("LoginForm.html");
			  rd.include(request, response);
		  }
	}
}
