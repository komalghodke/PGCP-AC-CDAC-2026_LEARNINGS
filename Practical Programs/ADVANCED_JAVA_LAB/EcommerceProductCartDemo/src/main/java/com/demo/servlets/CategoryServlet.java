package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.demo.model.Category;
import com.demo.model.MyUser;
import com.demo.service.CategoryService;
import com.demo.service.CategoryServiceImpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "CategoryServlet", urlPatterns = { "/category" })
public class CategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// To Retrieve list of Categories from Database
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		MyUser u=(MyUser)session.getAttribute("user");
		if(u!=null) {
				CategoryService cservice = new CategoryServiceImpl();
				List<Category> clist = cservice.getAllCategories();
				request.setAttribute("clist", clist);
				RequestDispatcher rd = request.getRequestDispatcher("ShowCategory.jsp");
				rd.forward(request, response);
		}else {
			out.println("Invalid Credentials, Please Re-Login!");
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.include(request, response);
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    doPost(request,response);
	}
}
