<%@page import="com.sarje.model.User"%>
<%@page import="com.sarje.service.ExpenseServiceImpl"%>
<%@page import="com.sarje.service.ExpenseService"%>
<%@page import="com.sarje.model.Expense"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="cache_control_page.jsp" %> 
<%
	User user = (User)session.getAttribute("user");
	if(user!=null && user.getUname()!=null){
		int uid = user.getUid();
		ExpenseService expenseService = new ExpenseServiceImpl();
		List<Expense> expenses = expenseService.getAll(uid);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Expense List</title>
</head>
<body>
	<%@ include file="user_menu.jsp" %>
	<table>
		<thead>
			<tr>
				<th>Item</th>
				<th>Price</th>
				<th>Quantity</th>
				<th>Date</th>
				<th>Delete</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<% for(Expense expense : expenses){ %>
				<tr>
					<td><%=expense.getItem()%></td>
					<td><%=expense.getPrice()%></td>
					<td><%=expense.getQuantity()%></td> 
					<td><%=expense.getEdate()%></td>
					<td><a href="expense_delete.jsp?id=<%=expense.getId()%>" >Delete</a></td>
					<td><a href="expense_update_form.jsp?id=<%=expense.getId()%>" >Update</a></td>
				</tr>
			<% } %>
		</tbody>
	</table>
</body>
</html>
<% }else{	
	response.sendRedirect("logout.jsp");
} %>