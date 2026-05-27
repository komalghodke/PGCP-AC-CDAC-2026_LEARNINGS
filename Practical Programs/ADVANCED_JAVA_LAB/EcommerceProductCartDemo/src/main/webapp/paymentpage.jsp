<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
         <h2>Your Payment is received, Your order is delivered in 3 days</h2>
         <h3>Thank you for shopping with us.   Do visit again</h3>
        <%session.invalidate();%>        
        <jsp:include page="Login.jsp"></jsp:include>
</body>
</html>