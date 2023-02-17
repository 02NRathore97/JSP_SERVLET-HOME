package sessionTracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("SessionServlet_2")
public class SessionServlet_2 extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		
		
		/*
		 * Stateless Problem 
		 */
		
//		String name = request.getParameter("name");
//		
//		out.print("<h1>");
//		out.print("Hello....... Mr. " + name + "<br>");
//		out.print("Welcome Back To My Website");
//		out.print("</h1>");
		
		
		
		
		/*
		 * OR..........Session Tracking using Cookie
		 */
		
		//getting cookies
		
//		Cookie[] cookies = request.getCookies();
//		
//		boolean f = false;
//		String name = "";
//		
//		if(cookies == null) {
//			out.print("<h1> You are new user go to home page and submit your name....</h1>");
//			return;
//		}else {
//			for(Cookie c : cookies) {
//				String tname = c.getName();
//				if(tname.equals("user_name")) {
//					f = true;
//					name = c.getValue();
//				}
//			}
//		}
//		if(f) {
//			out.print("<h1>");
//			out.print("Hello....... Mr. " + name + "<br>");
//			out.print("Welcome Back To My Website");
//			out.print("</h1>");
//			
//		}
//		
		
		
		

		/*
		 * OR.......Session Tracking using url rewriting
		 */
		
//		String name = request.getParameter("user");
//		out.println("<h1 style='color:red;'>Welcome back " + name + "</h1>");
		
		
		/*
		 * OR.......Session Tracking using Hidden Form Field
		 */
		
//		String name = request.getParameter("name");
//		out.println("<h1 style='color:red;'>Welcome back " + name + "</h1>");
		
		
		/*
		 * OR.......Session Tracking using HttpSession
		 */
		
		HttpSession session = request.getSession();
		String name = (String) session.getAttribute("name");
		out.print("<h1>");
		out.print("Hello....... Mr. " + name + "<br>");
		out.print("Welcome Back To My Website");
		out.print("</h1>");
		
	}
}
