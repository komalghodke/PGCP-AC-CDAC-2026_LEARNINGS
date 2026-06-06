<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Product Data</h1>
<table border="2">
<tr>
    <th>Product Id</th>
    <th>Product Name</th>
    <th>Quantity</th>
    <th>Price</th>
    <th>MfgDate</th>
   <th>Cid</th>
   <th>Action</th>   
</tr>
<c:forEach var="p" items="${plist}">
<tr>
<td>${p.pid }</td>
<td>${p.pname }</td>
<td>${p.qty }</td>
<td>${p.price }</td>
<td>${p.mfgdate }</td>
<td>${p.cid }</td>
<td><a herf="#">Delete</a>/<a href="#">Edit</a></td>
</tr>

</c:forEach>
</table>
</body>
</html>