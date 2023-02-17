package com.raystec.par_attr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mchange.v2.cfg.PropertiesConfigSource.Parse;

@WebServlet("Servlet_2")
public class Servlet_2 extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		processRequest(request, response);
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		processRequest(request, response);
		
	}
		public void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
			
			//parameter......
			int n1 = Integer.parseInt( request.getParameter("number1"));
			int n2 = Integer.parseInt( request.getParameter("number2"));
			
			
			//product........
			int product = n1 * n2;
			
		
			//attribute......
			int sum = (int)request.getAttribute("sum");
			
			 PrintWriter out = response.getWriter();
			 
			 out.print("<h1>");
			 out.println("Sum =  " + sum);
			 out.println("\nProduct = " + product);
			 out.print("</h1>");
						
			
			
}
		}
