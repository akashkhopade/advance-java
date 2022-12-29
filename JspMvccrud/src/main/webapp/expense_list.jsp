<%@page import="com.akki.service.*" %>
<%@page import="com.akki.model.*" %>
<%@page import="java.util.List" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    	ExpenseService expenseService = new ExpenseServiceImpl();
        List<Expense> expenses = expenseService.getAll(0);
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="background-color:grey; text-align: center">Expense App</h1>
	<table border=1; style="margin-left:auto;margin-right:auto;">
		<thead> 
			<tr>
			<th>Item</th>
			<th>Price</th>
			<th>Quantity</th>
			<th>Date</th>
			<th>Delete</th>
			<th>Update</th>
			<th>ADD</th>
			</tr>
		</thead>
		<tbody>
			<% for(Expense expense : expenses) { %>
				<tr>
					<td><%=expense.getItem() %></td>
					<td><%=expense.getPrice() %></td>
					<td><%=expense.getQuantity() %></td>
					<td><%=expense.getEdate() %></td>
				    <td><a href="expense_delete.jsp?id=<%=expense.getId() %>">Delete</a></td>
				    <td><a href="expense_update_form.jsp?id=<%=expense.getId() %>">Update</a></td>
				    <td><a href="expense_add_form.jsp?id=<%=expense.getId() %>">ADD</a></td>
				</tr>
				<% } %>
		</tbody>
	
	</table>

</body>
</html>