<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage='true'%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <%@include file="MyHeader.html" %>
       <h1>Error occured : <%=exception %></h1>
    <%@include file="MyFooter.html" %>
</body>
</html>