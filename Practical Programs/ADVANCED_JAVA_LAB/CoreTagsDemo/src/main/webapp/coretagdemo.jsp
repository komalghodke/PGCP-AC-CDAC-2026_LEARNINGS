<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <c:set var="i" value="${param.n1 }"></c:set> --%>
	<c:set var="i" value="12"></c:set>
	<c:out value="${i }"></c:out>
	<c:if test="${i<5}">
		<h2>i is smaller than 5</h2>
	</c:if>
	<c:if test='${i>=5 }'>
		<h2>i is greater than 5</h2>
	</c:if>
	<c:forEach var="j" begin="1" end="10">
		<h3>Hello ${j}</h3>
	</c:forEach>

	<c:choose>
		<c:when test='${i==1 }'>Monday</c:when>
		<c:when test='${i==2}'>Tuesday</c:when>
		<c:when test='${i==3 }'>Wednesday</c:when>
		<c:otherwise>Sunday</c:otherwise>
	</c:choose>


</body>
</html>