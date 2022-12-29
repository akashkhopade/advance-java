<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2><c:out value="Hello from JSTl"></c:out> </h2> 
	<h2><c:out value="${123+321}"></c:out></h2>
	<c:set var="i" value="7" ></c:set>
	<h3><c:out value="${i}"></c:out> </h3>
	<c:set var="j" value="${7}" ></c:set>
	<h3><c:out value="${j}"></c:out> </h3>
	<c:if test="${122%2==0}">
		<h3><c:out value="Even"></c:out> </h3>
	</c:if>
	<c:set var="marks" value="${40}" ></c:set>
	<c:choose>
		<c:when test="${marks>=75}">
			<c:out value="A"></c:out>
		</c:when>
		<c:when test="${marks<75 && marks>=60}">
			<c:out value="B"></c:out>
		</c:when>
		<c:otherwise>
			<c:out value="C"></c:out>
		</c:otherwise>
	</c:choose>
	
	<c:forEach begin="1" end="5" step="2" >
		<h3><c:out value="OK"></c:out></h3>
	</c:forEach>
	
</body>
</html>