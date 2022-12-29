<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form  action="expense_add.jsp" method="Post">
	<div>
		<label>Item:</label>
		<input type="text" name="item" placeholder="Enter Item">
	</div>
	
	<div>
		<label>Price:</label>
		<input type="text" name="price" placeholder="Enter price">
	</div>
	
	<div>
		<label>Quantity:</label>
		<input type="text" name="quantity" placeholder="Enter Quantity">
	</div>
	<div>
		<label>IDate:</label>
		<input type="text" name="edate" placeholder="Enter date">
	</div>
	<button type"submit" >Add</button>
	</form>
</body>
</html>