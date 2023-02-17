package com.raystec.par_attr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("Servlet_1")
public class Servlet_1 extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		//parameter......
		String n1 = (String) request.getParameter("number1");
		String n2 = (String) request.getParameter("number2");
		
		//parsing.......
		int nn1 = Integer.parseInt(n1);
		int nn2 = Integer.parseInt(n2);
		
		//addition........
		int sum = nn1 + nn2;
	
		//attribute......
		request.setAttribute("sum", sum);
		
		//forward.........
		RequestDispatcher rd = request.getRequestDispatcher("Servlet_2");
		rd.forward(request, response);
		
	}
	
}

