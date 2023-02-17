<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
 


<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>JSTL sql</title>
	</head>
	<body>
		<center>
			<h1>All Usres are</h1>
			
			<sql:setDataSource driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/raystec" 
				user="root" password="root" var="ds"/>	
			<sql:query dataSource="${ds }" var="rs">SELECT * FROM raystec.authentication;</sql:query>
			
			<table border="1px solid black">
				<tr>
					<td>User ID</td>
					<td>User Name</td>
					<td>User Password</td>
				</tr>
				<c:forEach items="${rs.rows }" var="row">
					<tr>
						<td><c:out value="${row.AUTH_ID}"></c:out></td>
						<td><c:out value="${row.USERNAME}"></c:out></td>
						<td><c:out value="${row.PASSWORD}"></c:out></td>
					</tr>
				</c:forEach>
			</table>
		</center>
	</body>
</html>