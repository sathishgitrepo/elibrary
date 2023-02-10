package com.javatpoint.servlets;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//import com.sun.tools.javac.util.Log;

public class Librarymem {

	
		// TODO Auto-generated method stub
		
		    public static  List<Double> list = new ArrayList<>();
		 
		 
		    public void populateList() throws InterruptedException {
		    	System.out.println("in method proc");

								
		    	for (int i = 0; i < 1000000; i++) {
		    		//for (int i = 0; i < 1000; i++) {
		            list.add(Math.random());
		           // Thread.sleep(300);
		        }
		    	System.out.println("addednew");
		    	
		      //  Log.info("Debug Point 2");
		    }
		    public void clearList() throws InterruptedException {
		    	System.out.println("in method for clearing");
		    	
		  // 	list.removeAll(list);
		       	System.out.println("in method for clear2");
		     
		list.clear(); 
		 
			//	Thread.sleep(1000);
		    	System.out.println("done clear");

		    //  //  Log.info("Debug Point 2");
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
		     	new Librarymem().populateList();
		    	Thread.sleep(1000);
		  new Librarymem().clearList();
		    	
		     //	Thread.sleep(10000);
		       // Log.info("Debug Point 3");
		    	System.out.println("Procnew done");
		    	try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		}
	


