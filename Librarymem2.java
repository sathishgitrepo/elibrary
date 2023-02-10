package com.javatpoint.servlets;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//import com.sun.tools.javac.util.Log;

public class Librarymem2 {

	
		// TODO Auto-generated method stub
		
		    public static List<Double> list = new ArrayList<>();
		 
		    public void populateList() throws InterruptedException {
		    	System.out.println("in method proc");

								
		    	for (int i = 0; i < 1000000; i++) {
		            list.add(Math.random());
		           // Thread.sleep(300);
		        }
		    	System.out.println("addednew");
		    	
		      //  Log.info("Debug Point 2");
		    }
		    public void clearList() throws InterruptedException {
		    	System.out.println("in method clear1");
		    //	list.removeAll(list);
		     	//list.removeAll(list);
		// list.clear();
				//Thread.sleep(200);
		    	System.out.println("done clear1");

		      //  Log.info("Debug Point 2");
		    }
		    public  void memcall() throws InterruptedException {
		      //  Log.info("Debug Point 1");
		     	System.out.println("In main method - Processing");
		     	  try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		     	new Librarymem2().populateList();
		    //	Thread.sleep(10000);
		     //	new Librarymem2().clearList();
		    	
		     //	Thread.sleep(10000);
		       // Log.info("Debug Point 3");
		    	System.out.println("Procnew done1");
		    	try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		}
	


