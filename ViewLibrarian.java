package com.javatpoint.servlets;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javatpoint.beans.LibrarianBean;
import com.javatpoint.dao.LibrarianDao;
@WebServlet("/ViewLibrarian")
public class ViewLibrarian extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.println("<head>");
		out.println("<title>View Librarian</title>");
		out.println("<link rel='stylesheet' href='bootstrap.min.css'/>");
		out.println("</head>");
		out.println("<body>");
		
		request.getRequestDispatcher("navadmin.html").include(request, response);
		out.println("<div class='container'>");
		
		/*try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Extcall newobj1 = new Extcall();
		try {
			newobj1.sendGET();
			newobj1.sendGET2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		*/
		
		List<LibrarianBean> list=LibrarianDao.view();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*try {
			newobj1.sendGET();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		out.println("<table class='table table-bordered table-striped'>");
		out.println("<tr><th>Id</th><th>Name</th><th>Email</th><th>Password</th><th>Mobile</th><th>Edit</th><th>Delete</th></tr>");
		for(LibrarianBean bean:list){
			out.println("<tr><td>"+bean.getId()+"</td><td>"+bean.getName()+"</td><td>"+bean.getEmail()+"</td><td>"+bean.getPassword()+"</td><td>"+bean.getMobile()+"</td><td><a href='EditLibrarianForm?id="+bean.getId()+"'>Edit</a></td><td><a href='DeleteLibrarian?id="+bean.getId()+"'>Delete</a></td></tr>");
		}
		out.println("</table>");
		/*try {
		 Extcall verobj = new Extcall();
		 verobj.sendGET();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	*/
		Librarymem  newobj2 = new Librarymem ();
		try {
			newobj2.memcall();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		out.println("</div>");
		request.getRequestDispatcher("footer.html").include(request, response);
		out.close();
		
	}
}
