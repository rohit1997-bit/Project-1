package com.app_01.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login_verfication_servlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
	   String username = req.getParameter("username");
	   String password = req.getParameter("password");
	   
	   if(username.equals("admin") && password.equals("admin")) {
		   
		   res.sendRedirect("https://www.youtube.com");
	   }
	   else
	   {
		 PrintWriter  ps = res.getWriter();
		 ps.print("please try again...");
	   }
		
		
	}

}
