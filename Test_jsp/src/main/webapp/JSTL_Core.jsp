<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>

<!-- JSP TagLib Directive Tag -->
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>JSTL</title>
	</head>
	<body>
		<h1>JSTL Example</h1>
		
		<!--JSTL set  -->
		<c:set var="i" value="23" scope="application"></c:set>
		
		<!--JSTL out  -->
		<h1><c:out value="${i}"></c:out></h1>
		
		<!--JSTL if  -->
		<c:if test="${i==23}">
			<h1>True</h1>
		</c:if>
		
		<!--JSTL choose, when, otherwise : java switch  -->
		<c:choose>
			<c:when test="${i>0}">
				<h1>This is my case first</h1>
				<h3>Number is positive</h3>
			</c:when>
			<c:when test="${i<0}">
				<h1>This is my case second</h1>
				<h3>Number is negative</h3>
			</c:when>
			<c:otherwise>
				<h1>This is default case</h1>
				<h3>The number zero</h3>
			</c:otherwise>
		</c:choose>
		
		<!--JSTL foreach  -->
		<c:forEach var="a" begin="1" end="10">
			<h5>Neeraj <c:out value="${a}"></c:out></h5>
		</c:forEach>
		
		<!--JSTL redirect  -->
		<%-- <c:redirect url="https://www.google.com"></c:redirect> --%>
		
		<c:url var="myURL" value="https://www.google.com">
			<c:param name="Q" value="This is my URL"></c:param>
		</c:url>
		<h1><c:out value="${myURL}"></c:out></h1>		
		
		
		
		<!--JSTL remove  -->
		<%-- <c:remove var="i"/>  
		<h1><c:out value="${i}">This is default value</c:out></h1> --%>
	</body>
</html>