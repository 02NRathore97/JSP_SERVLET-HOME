package sessionTracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("SessionServlet_1")
public class SessionServlet_1 extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		PrintWriter out = response.getWriter();
		
		/*
		 * Stateless Problem 
		 */
		
//		String name = request.getParameter("name");
//		
//		out.print("<h1>");
//		out.print("Hello....... Mr. " + name + "<br>");
//		out.print(" Welcome To My Website");
//		out.print("<br>");
//		out.print("<a href='SessionServlet_2'>Go To Servlet_2</a>");
//		out.print("</h1>");
		
		
		
		
			/*
			 * 	OR.......Session Tracking using Cookie
			 */
		
		
//		String name = request.getParameter("name");
//		
//		out.print("<h1>");
//		out.print("Hello....... Mr. " + name + "<br>");
//		out.print(" Welcome To My Website");
//		out.print("<br>");
//		out.print("<a href='SessionServlet_2'>Go To Servlet_2</a>");
//		out.print("</h1>");
//		
//		//create a cookie
//		Cookie c = new Cookie("user_name", name);
//		response.addCookie(c);
		
		
		
		
		
		
		/*
		 * OR.......Session Tracking using url rewriting
		 */
		
		
//		String name = request.getParameter("name");
//		out.print("<h1> Your Name is : " + name + "</h1>");
//		out.print("<a href='SessionServlet_2?user="+ name +"'>Go To Second Servlet</a>");
		
		
		
		/*
		 * OR.......Session Tracking using Hidden Form Field
		 */
		
//		String name = request.getParameter("name");
//		out.print("<h1> Your Name is : "+ name +"</h1>");
//		
//			//hidden form field
//		out.println(""
//					+"<form action='SessionServlet_2'>"
//					+"<input type='hidden' name='name' value='"+ name +"'/>"
//					+"<button> Go To Second Servlet </button>"
//					+"</form>");
		
		/*
		 * OR.......Session Tracking using HttpSession
		 */
		
		String name = request.getParameter("name");
		
		
		out.print("<h1>");
		out.print("Hello....... Mr. " + name + "<br>");
		out.print(" Welcome To My Website");
		out.print("<br>");
		out.print("<a href='SessionServlet_2'>Go To Servlet_2</a>");
		out.print("</h1>");
		
		HttpSession session = request.getSession();
		session.setAttribute("name", name);
		
	}
}
