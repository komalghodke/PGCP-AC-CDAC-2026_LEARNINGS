package com.demo.loginServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String uname = request.getParameter("uname");
		String password = request.getParameter("passwd");
		if (uname.equals("admin1") && password.equals("admin1")) {
			out.println("you are admin");
		} else if (uname.equals("user1") && password.equals("user1")) {
			out.println("you are user");
		} else {
			out.println("invalid credentials, pls relogin");
			RequestDispatcher rd = request.getRequestDispatcher("LoginForm.html");
			rd.include(request, response);

		}

	}

}
