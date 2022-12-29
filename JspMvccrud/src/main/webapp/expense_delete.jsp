<%@page import="com.akki.service.*"%>

<jsp:useBean id ="expense" class="com.akki.model.Expense"/>
<jsp:setProperty property="*" name="expense"/>

<%
	String p1 = request.getParameter("id");
    int id = Integer.parseInt(p1);
	ExpenseService expenseService = new ExpenseServiceImpl();
	expenseService.removeById(id);
	response.sendRedirect("expense_list.jsp");
	
%>