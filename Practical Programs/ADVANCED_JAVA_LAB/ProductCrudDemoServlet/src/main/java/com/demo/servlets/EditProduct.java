package com.demo.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.demo.model.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;


@WebServlet("/editproduct")
public class EditProduct extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int pid=Integer.parseInt(request.getParameter("pid"));
		ProductService pservice=new ProductServiceImpl();
		Product p=pservice.getById(pid);
		if(p!=null) {
			out.println("<form action='updateproduct' method='post'>");
			out.println("Product id: <input type='text' name='pid'  id='id' value='"+p.getPid()+"' readonly/><br/>");
			out.println(" Product Name : <input type='text'  name='pname' id='nm' value='"+p.getPname()+"'><br/>");
			out.println("Product qty :<input type='text' name='qty' id='q' value='"+p.getQty()+"'/><br/>");
		     out.println(" Product price :<input type='text' name='price' id='pr' value='"+p.getPrice()+"'/><br/>");
		     out.println("MFG date :<input type='date' name='mfgdate'  id='dt' value='"+p.getMfgdate().toString()+"'/><br/>");
		     out.println("<button type='submit' name='btn' id='btn' value='update'>Update product</button>");
			out.println("</form>");
		}
		
		
	}

}
