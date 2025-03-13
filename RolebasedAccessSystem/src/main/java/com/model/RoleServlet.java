package com.model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RoleServlet")
public class RoleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String username = request.getParameter("username");
		String role =request.getParameter("role");
		
		if(role.equals("admin"))
		{
			response.sendRedirect("admin.html");
		}
		else if (role.equals("user")) {
			
			response.sendRedirect("user.html");
			
		}
		else
		{
			response.sendRedirect("error.html");
		}
		
		
	}

}
