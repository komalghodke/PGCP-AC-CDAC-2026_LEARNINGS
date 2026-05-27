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

       <h1>Category Id :  ${param.cid}</h1>
       <form action="addtocart">
		       <c:forEach var="p" items="${plist}">
		            <input type="checkbox" name="prod" value="${p.pid}:${p.pname}:${p.price}">
		            <label>${p.pname} ------> ${p.price }</label>
		       </c:forEach>
		       <button type="submit" name="btn" id="addcart" value="addcart">Add To Cart</button>
		       <button type="submit" name="btn" id="showcart" value="showcart">Show Cart</button>
       </form>
       
</body>
</html>