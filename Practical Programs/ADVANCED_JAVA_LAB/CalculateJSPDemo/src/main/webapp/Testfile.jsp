<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date,java.util.List,java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
    public void jspInit(){
	   System.out.println("jsp init method");
   }

public void jspDestroy(){
	   System.out.println("jsp destroy method");
}
%>
<%@include file="MyHeader.html" %>
<%
    int i=10;
   session.setAttribute("user",10);
   List<Integer> list=new ArrayList<>();
   Date dt=new Date();
%>
    <h1> This is testing of JSP page header and footer  ---->  <%=i %></h1>
    <%@include file="MyFooter.html" %>
</body>
</html>