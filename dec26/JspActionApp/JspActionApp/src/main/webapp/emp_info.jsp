<%@page import="model.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="emp" class="model.Employee" scope="session" ></jsp:useBean>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Emp Info</title>
</head>
<body>
	
	<h3><jsp:getProperty name="emp" property="empId" /></h3>
	<h3><jsp:getProperty name="emp" property="empName" /></h3>
	<h3><jsp:getProperty name="emp" property="salary" /></h3>
</body>
</html>