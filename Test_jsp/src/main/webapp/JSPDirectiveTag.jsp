<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>


<!--JSP Page Directive Tag  -->
<%@ page import="java.util.Random"%>

				<!-- OR  -->
				
<%@ page import="java.util.ArrayList, java.io.*" %>


<!-- JSP TagLib Directive Tag -->
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>JSP Directive Tag</title>
	</head>
	<body>
	
	<!-- JSP Include Directive Tag -->
	<%@include file="Header.jsp" %>
	
	  <h1>Random Number : 
			
		<% 
			Random random = new Random();
			int n = random.nextInt(10);	
		%>
		
		<%= n%>
		</h1>
		
		<c:set var="name" value="Neeraj Rathore"></c:set>
		<c:out value="${name}"></c:out>
		
		
	</body>
</html>