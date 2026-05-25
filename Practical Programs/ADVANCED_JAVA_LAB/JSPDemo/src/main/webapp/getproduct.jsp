<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.jspbeansdemo.model.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

//Product p=new Product();
//ProductService pservice=new ProductServiceImpl();
%>
<%-- <jsp:useBean id="pservice" class="com.demo.service.ProductserviceImpl"
 type="com.demo.service.ProductService">
</jsp:useBean> --%>


   <jsp:useBean id="p" class="com.jspbeansdemo.model.Product" scope="session">
   <%--   session.setAttribute("p",p);   --%>
      <%--  <jsp:setProperty property="pid" name="p" value='<%=Integer.parseInt(request.getParameter("pid"))%>'></jsp:setProperty>
       <jsp:setProperty property="pname" name="p" value='<%=request.getParameter("pname") %>'></jsp:setProperty>
       <jsp:setProperty property="qty" name="p" value='<%=Integer.parseInt(request.getParameter("qty"))%>'></jsp:setProperty>
       <jsp:setProperty property="price" name="p" value='<%=Double.parseDouble(request. getParameter("price"))%>'></jsp:setProperty>--%>
       <jsp:setProperty property="*" name="p"></jsp:setProperty>
   </jsp:useBean>
   
   
   <%--display product data --%>
   PID : <jsp:getProperty property="pid" name="p"></jsp:getProperty>
   Product Name : <jsp:getProperty property="pname" name="p"></jsp:getProperty>
   Product qty : <jsp:getProperty property="qty" name="p"></jsp:getProperty>
   Product price : <jsp:getProperty property="price" name="p"></jsp:getProperty>
</body>
</html>