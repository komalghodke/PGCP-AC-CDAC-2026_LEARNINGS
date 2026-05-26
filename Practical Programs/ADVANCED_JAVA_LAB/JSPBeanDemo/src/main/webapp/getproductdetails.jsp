<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Entry</title>
</head>
<body>
	<h2>Enter Product Details</h2>
	<form action="getproduct.jsp" method="post">
		Product pid : <input type="text" name="pid" id="pid" /><br />
		Product pname : <input type="text" name="pname" id="pname" /><br />
		Product Quantity : <input type="text" name="qty" id="qty" /><br />
		Product price : <input type="text" name="price" id="pr" /><br />
		<button type="submit" name="btn" id="btn" value="add">Submit</button>
	</form>
</body>
</html>
