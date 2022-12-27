<jsp:useBean id="emp" class="model.Employee" scope="session" ></jsp:useBean>
<jsp:setProperty name="emp" property="*" />
<%
	response.sendRedirect("emp_info.jsp");
%>