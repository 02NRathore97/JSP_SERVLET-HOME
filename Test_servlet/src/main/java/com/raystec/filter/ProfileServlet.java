package com.raystec.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("ProfileServlet")
public class ProfileServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("Profile Servlet Executed");
		
		PrintWriter out = response.getWriter();
		
		out.print("<h1>");
		out.print("welcome to profile Page");
		out.print("<br>");
		out.print("This is Profile Page");
		out.print("</h1>");
	
		
	}
}
