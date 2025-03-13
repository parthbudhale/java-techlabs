package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/tests")

public class DoGet_doPost_Demo extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String name = req.getParameter("name");
		PrintWriter pw = resp.getWriter();
		pw.println("<h1> welcome"+(name!=null ? name:"Guess"));
	}

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		PrintWriter pw = resp.getWriter();
		if("admin".equals(username) && "password".equals(password));	
		{
			pw.print("login successfull");
		}
		else
		{
			pw.print("login Failed");
		}
	
	
	}
}

