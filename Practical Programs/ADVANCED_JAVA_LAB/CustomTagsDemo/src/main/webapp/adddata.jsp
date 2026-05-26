<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="mytag" uri="/calculate"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to JSP custom tags</h1>
	<h5>Calculate addition of 2 numbers</h5>
	<mytag:mycalculate num1='<%=request.getParameter("num1")%>'
		num2='<%=request.getParameter("num2")%>'>

	</mytag:mycalculate>
	<mytag:hello lname="K" fname="G"></mytag:hello>

</body>
</html>