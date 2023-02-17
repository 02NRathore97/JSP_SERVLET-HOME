<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title> JSP Scripting Tag</title>
	</head>
	<body>
		<!--JSP Comments  Tag-->
		<%-- --%>
		
		
		
		<!--JSP Declaration Tag  -->
		<%! 
		
			int a = 5;
			int b = 10;
			String name = "Neeraj";
			
			public int doSum(){
				return a + b ; 
			}
			
			public String reverseName(){
				StringBuffer sb = new StringBuffer(name);
				return sb.reverse().toString(); 
			}
			
		%>
		
		<!-- JSP Scripting Tag -->
		<% 
			out.println(a);
			out.println("<br>");
			out.println(b);
			out.println("<br>");
			out.println(doSum());
			out.println("<br>");
			out.println(reverseName());
		%>
		
		
		<!--Expression Tag -->
		<h1>Sum is = <%= doSum() %></h1>
		<h1>Reverse is = <%= reverseName() %></h1>
	</body>
</html>