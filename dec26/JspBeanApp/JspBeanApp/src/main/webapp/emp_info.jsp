<%@page import="model.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Emp Info</title>
</head>
<body>
	<%
		Employee emp = (Employee)session.getAttribute("e");
	%>
	<h3><%=emp.getEmpId()%></h3>
	<h3><%=emp.getEmpName()%></h3>
	<h3><%=emp.getSalary()%></h3>
</body>
</html>