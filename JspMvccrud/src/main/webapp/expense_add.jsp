<%@page import="com.akki.service.*"%>

<jsp:useBean id ="expense" class="com.akki.model.Expense"/>
<jsp:setProperty property="*" name="expense"/>

<%
	
	ExpenseService expenseService = new ExpenseServiceImpl();
	expenseService.add(expense);
	response.sendRedirect("expense_list.jsp");
	
%>