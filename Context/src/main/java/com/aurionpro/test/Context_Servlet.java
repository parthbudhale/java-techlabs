package com.aurionpro.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Context")
public class Context_Servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/plain");
		PrintWriter pw = resp.getWriter();
		ServletContext context = getServletContext();
		String dbURL = context.getInitParameter("dbURL");
		String dbuser = context.getInitParameter("dbuser");

		pw.println("Application settings: ");
		pw.println("Database url :" + dbURL);
		pw.println("Database user name: " + dbuser);
	}

}