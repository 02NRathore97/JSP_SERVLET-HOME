<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Function </title>
</head>
<body>
	
		<c:set var="name" value="Neeraj Rathore" scope="application"></c:set>
		<h1><c:out value="${name}"></c:out></h1>
		
		<!--Length of name  -->
		<h1>Length of name is = <c:out value="${fn:length(name)}"></c:out></h1>
		
		<!--toLowerCase of name  -->
		<h1>LowerCase of name is = <c:out value="${fn:toLowerCase(name)}"></c:out></h1>
		
		<!--Contains of name  -->
		<h1> Name Contains = <c:out value="${fn:contains(name,'Neeraj')}"></c:out></h1>
		
		
</body>
</html>