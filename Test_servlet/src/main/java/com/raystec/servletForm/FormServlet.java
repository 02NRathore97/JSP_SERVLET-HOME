
package com.raystec.servletForm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		PrintWriter out = response.getWriter();
		out.print("<h1>Welcome to Form Servlet</h1>");
		
		String name = request.getParameter("user_name");
		String password = request.getParameter("user_password");
		String email = request.getParameter("user_email");
		String gender = request.getParameter("user_gender");
		String course = request.getParameter("user_course");
		
		String condition = request.getParameter("condition");
		
			
			if(condition!=null) {
				if(condition.equals("checked")) {
						out.print("<h1> Name : " + name + "</h1>");
						out.print("<h1> Password : " + password + "</h1>");
						out.print("<h1> Email : " + email + "</h1>");
						out.print("<h1> Gender : " + gender + "</h1>");
						out.print("<h1> Course : " + course + "</h1>");
						out.print("<h1> Condition : " + condition + "</h1>");
							
					}
			}else {
				
				// we can forward request to another Servlet.
				// Using object of RequestDispatcher.
				// Using forward() Method.
				RequestDispatcher rd = request.getRequestDispatcher("ServletTestForward");
				rd.forward(request, response);
				
			}
	}
}
