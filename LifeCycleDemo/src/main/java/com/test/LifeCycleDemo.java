package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LifeCycleDemo")
public class LifeCycleDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LifeCycleDemo() {
    	System.out.println("servlet life cycle has started");
        
    }

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet object are created.Init() method called");
	}

	
	public void destroy() {
		System.out.println("Destroy method called");
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("processing request : Service() method called");
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("life cycle demo example");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("Handling request");
		pw.println("Service method implementation");
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
