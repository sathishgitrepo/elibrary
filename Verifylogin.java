package com.javatpoint.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import com.elibrary.price.price;
import com.javatpoint.dao.DB;

public class Verifylogin {
	
	public  void verifyFinal() throws IOException, InterruptedException { 
	/*
		Extcall verobj = new Extcall();
		try {
			verobj.sendGET();
			//verobj.sendGET2();
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		*/
		
	/*	Librarymem newobj2 = new Librarymem ();
		try {
			newobj2.memcall();
		} catch (InterruptedException e) {
			// TODO Auto-genepricerated catch block
			e.printStackTrace();
		}
		
	*/
		String product = "Laptop";
		int quantity = 100;
	/*	price obj3 = new price();
		  try {
		    	obj3.pricecalc(product,quantity);
		    	
		//mypriceobj.pricecalc(product, quantity);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		*/
		try {
			Connection con=DB.getCon();
			PreparedStatement ps;
			ps = con.prepareStatement("select * from e_librarian");
			ResultSet rs=ps.executeQuery();
			Thread.sleep(3500);
			//int status=ps.executeUpdate();
			//con.close();

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Connection con=DB.getCon();
			PreparedStatement ps;
			ps = con.prepareStatement("select * from e_librarian");
			ResultSet rs=ps.executeQuery();
			//Thread.sleep(1000);
			//int status=ps.executeUpdate();
			//con.close();

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			Connection con=DB.getCon();
			PreparedStatement ps;
			ps = con.prepareStatement("select * from e_book");
			ResultSet rs=ps.executeQuery();
			//Thread.sleep(500);
			//int status=ps.executeUpdate();
		//	con.close();

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			Connection con=DB.getCon();
			PreparedStatement ps;
			ps = con.prepareStatement("select * from e_issuebook order by issueddate desc");
			ResultSet rs=ps.executeQuery();
			Thread.sleep(500);
			//int status=ps.executeUpdate();
		//	con.close();

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		}
	
	
	}


