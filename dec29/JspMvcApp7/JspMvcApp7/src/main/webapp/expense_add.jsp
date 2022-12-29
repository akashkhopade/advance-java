<%@page import="com.sarje.model.User"%>
<%@page import="com.sarje.service.ExpenseServiceImpl"%>
<%@page import="com.sarje.service.ExpenseService"%>

<jsp:useBean id="expense" class="com.sarje.model.Expense" ></jsp:useBean>
<jsp:setProperty property="*" name="expense"/>

<%
	User user = (User)session.getAttribute("user");
	int uid = user.getUid();
	expense.setUid(uid);
	ExpenseService expenseService = new ExpenseServiceImpl();
	expenseService.add(expense);
	response.sendRedirect("expense_add_form.jsp"); 
%>