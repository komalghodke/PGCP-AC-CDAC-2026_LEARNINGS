package com.demo.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/register")
public class RegisterMeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		out.println("<form action='display'>");
		out.println("<input type='hidden' name='name' id='nm' value='"+name+"'/>");
		out.println("Email: <input type='email'  name='email' id='email'/>" );
		out.println("<button type='submit' name='btn' id='btn'>Submit</button>");
		out.println("</form>");
	}

}
