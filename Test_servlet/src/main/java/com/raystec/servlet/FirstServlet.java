package com.raystec.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/FirstServlet")
public class FirstServlet implements Servlet {
	
	ServletConfig conf;

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
		this.conf = conf;
		System.out.println("Creating object");
		
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Servicing");
		PrintWriter out = response.getWriter();
		out.print("<h1>This is me form service mehtod</h1>");
		
	}

	public void destroy() {
		// TODO Auto-generated method stub
		
		System.out.println("Going to destroy servlet object");
		
	}
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return this.conf;
	}
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "This servlet is created by me";
	}

}
