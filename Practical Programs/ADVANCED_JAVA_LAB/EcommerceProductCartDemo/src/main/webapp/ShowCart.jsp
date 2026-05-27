<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List,com.demo.model.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="paymentpage.jsp">
     <h3>UserName : ${user.uname}</h3>
     <h3>Your Cart</h3>
      <%
         double sum=0; 
          List<Product> cart=(List<Product>)session.getAttribute("cart");
      %> 
      <table>
      <tr><th>Product id</th><th>Name</th><th>Price</th></tr>
     <%for(Product p:cart){ 
            sum=sum+p.getPrice();
     %>
           <tr><td><%=p.getPid() %>></td><td><%=p.getPname() %>></td><td><%=p.getPrice() %>></td></tr>
        
    
     <%} %>
     </table>
     <h5>Total bill amount :     <%=sum %></h5>
     <button type="submit" name="btn" id="btn">Payment</button>
   </form>
</body>
</html>