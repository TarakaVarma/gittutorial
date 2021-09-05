<%@page import="com.te.springmvc.emp.dto.EmployeeDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%  EmployeeDto emp = (EmployeeDto) request.getAttribute("EMP"); %>
<body>
 <%=emp.getId() %>
 <%=emp.getName() %>
</body>
</html>