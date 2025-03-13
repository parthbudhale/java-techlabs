package com.model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ConfigServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	private String dbURL;
	private String username;
	
	@Override
	public void init(ServletConfig config)throws ServletException{
		dbURL = config.getInitParameter("databaseURL");
		username = config.getInitParameter("username");	
}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/plain");
		
		PrintWriter pw = resp.getWriter();
		
		pw.println("database url:"+dbURL);
		pw.println("username"+username);
	}
	

}
