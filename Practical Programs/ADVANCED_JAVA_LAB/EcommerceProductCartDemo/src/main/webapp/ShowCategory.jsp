<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import ="java.util.List, com.demo.model.Category" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%  
List<Category> clst = (List<Category>)request.getAttribute("clist");
%>
<form action="addproduct">
<select name = "catid">

<%
for(Category c : clst) {
	%> 
	<option value ="<%= c.getCid() %>"> <%= c.getCname() %>	</option>		
<%
}
%>
</select>
<button type = "submit" name ="btn" id ="add" value="add">Add Product</button>
<button type = "submit" name ="btn" id ="show" value="show">Show Cart</button>
</form>
</body>
</html>