package com.raystec.servletForm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletTestForward")
public class ServletTestForward extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.print("Hii This is ServletTestForward Method");
		out.print("<h2>Sorry you have to accept terms and condition  !!!!!!!!!!</h2>");
		
		// We can include response of FormView.jsp .
		// Using object of RequestDispatcher.
	    // Using include() Method.
		
		RequestDispatcher rd = request.getRequestDispatcher("FormView.jsp");
		rd.include(request, response);
	}
}
