<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String name = request.getParameter("name");
	String address = request.getParameter("addr");
	%>
	Name:
	<%=name%>
	address:
	<%=address%>

	<h3>Using EL language</h3>
	Name-------->${param.name} Address------->${param.addr}

	<jsp:include page="printdetails.jsp">
		<jsp:param name="msg" value="Welcome to JSP actions"></jsp:param>
	</jsp:include>




</body>
</html>