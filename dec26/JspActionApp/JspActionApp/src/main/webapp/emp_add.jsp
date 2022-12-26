<jsp:useBean id="emp" class="model.Employee" scope="session" ></jsp:useBean>
<jsp:setProperty name="emp" param="eid" property="empId" />
<jsp:setProperty name="emp" param="ename" property="empName" />
<jsp:setProperty name="emp" param="sal" property="salary" />

<%
	response.sendRedirect("emp_info.jsp");
%>