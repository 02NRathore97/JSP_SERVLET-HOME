<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>JSP_2</title>
	</head>
	<body>
		<h1>This is JSP  _ 2</h1>
		<%
			response.sendRedirect("JSP_SendRedirect_3.jsp"); 
		%>
	</body>
</html>