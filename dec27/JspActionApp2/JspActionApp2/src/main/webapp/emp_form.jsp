<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Form</title>
</head>
<body>
	<form action="emp_add.jsp" method="post" >
		<div>
			<label>ID: </label>
			<input type="text" name="empId" placeholder="Enter ID" >
		</div>
		<div>
			<label>Name: </label>
			<input type="text" name="empName" placeholder="Enter Name" >
		</div>
		<div>
			<label>Salary: </label>
			<input type="text" name="salary" placeholder="Enter Salary" >
		</div>
		<button type="submit" >Add</button> 
	</form>
</body>
</html>