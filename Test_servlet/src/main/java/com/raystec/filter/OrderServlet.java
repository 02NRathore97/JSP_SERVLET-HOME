package com.raystec.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("OrderServlet")
public class OrderServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		System.out.println("Order Servlet");
		
		PrintWriter out = response.getWriter();
		
		out.print("<h1>");
		out.print("OrderServlet at " + request.getContextPath());
		out.print("</h1>");
	}

}
