package com.demo.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.MyUser;
import com.demo.model.Product;


@WebServlet("/addtocart")
public class AddToCartServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] products=request.getParameterValues("prod");  // ["1:xx:34","3:yyy:45"]
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String btn=request.getParameter("btn");
		HttpSession session=request.getSession();
		MyUser u=(MyUser)session.getAttribute("user");
		if(u!=null) {
			if(btn.equals("addcart")) {
				           //retrieve existing cart from session
							List<Product> cart=(List<Product>) session.getAttribute("cart");
							//create a new cart when you visit this servlet first time
							if(cart==null) {
						          cart=new ArrayList<>();
							}
							//add all selected products into cart
							for(String s:products) {
								String[] arr=s.split(":");
								Product p=new Product(Integer.parseInt(arr[0]),arr[1],Double.parseDouble(arr[2]));
								cart.add(p);		
							}
							//save new cart into session
							session.setAttribute("cart", cart);
							cart.forEach(System.out::println);
							RequestDispatcher rd=request.getRequestDispatcher("category");
							rd.forward(request, response);
			}else {
				 RequestDispatcher rd = request.getRequestDispatcher("ShowCart.jsp");
				  rd.forward(request, response);
			}
			
		}else {
			out.println("Invalid Credentials, Please Re-Login!");
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.include(request, response);
		}
		
	}

}
