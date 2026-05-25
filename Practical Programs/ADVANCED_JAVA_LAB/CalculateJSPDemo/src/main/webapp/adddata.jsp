<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="MyErrorPage.jsp" isELIgnored='false'%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- This is html comment -->
<%--this is jsp comment --%>
<%@include  file="MyHeader.html"%>
<%!
     int factorial(int n){
	int f=1;
	for(int  i=1;i<=n;i++){
		f=f*i;
	}
	return f;
}
%>
<%
   int num1=Integer.parseInt(request.getParameter("num1"));
   String btn=request.getParameter("btn");
   if(btn.equals("add")){
	   int num2=Integer.parseInt(request.getParameter("num2"));
	   int addition=num1+num2;
%>
<h1>Addition : <%=addition %></h1>
<%	   
   }else{
	   int f=factorial(num1);
%>
<h1>Factorial : <%=f %></h1>
<%  
   }
%>
<%@include file="MyFooter.html" %>
</body>
</html>