package com.javatpoint.servlets;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javatpoint.dao.DB;
@WebServlet("/AdminLogin")
public class  AdminLogin extends HttpServlet {
	
	
	//protected synchronized void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	protected  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.println("<head>");
		out.println("<title>Admin Section</title>");
		out.println("<link rel='stylesheet' href='bootstrap.min.css'/>");
		out.println("</head>");
		out.println("<body>");
		//synchronized
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		//synchronized(this)
		{
		if(email.equals("admin@jtp.com")&&password.equals("admin123")){
			

			Extcall verobj = new Extcall();
		/*	try {
			//	verobj.sendGET();
				//verobj.sendGET2();
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			*/
		
			Verifylogin verobj1 = new Verifylogin();
			try {
				verobj1.verifyFinal();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
/*
			Librarymem2 newobj2 = new Librarymem2 ();
			try {
				newobj2.memcall();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	/*		
			for(int i=1;i<=2;i++){  
				int abc = 7 + 9;
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		//	for (int i = 0; i < 20; i++){
			

			Verifylogin verobj1 = new Verifylogin();
			try {
				verobj1.verifyFinal();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			//}
			*/
			
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
			
				
			HttpSession session=request.getSession();
			
			synchronized(this)
			{
				
			{
			session.setAttribute("admin","true");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		//	}
			request.getRequestDispatcher("navadmin.html").include(request, response);
			request.getRequestDispatcher("admincarousel.html").include(request, response);
			
		}else{
			request.getRequestDispatcher("navhome.html").include(request, response);
			out.println("<div class='container'>");
			out.println("<h3>Username or password error</h3>");
			request.getRequestDispatcher("adminloginform.html").include(request, response);
			out.println("</div>");
		}
		
		
		request.getRequestDispatcher("footer.html").include(request, response);
		
		}
		out.close();
		/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		
	

}

