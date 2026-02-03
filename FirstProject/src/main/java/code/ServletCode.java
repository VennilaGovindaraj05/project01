package code;


  // METHODS


     
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/Connect")
public class ServletCode extends HttpServlet
{
	//GET
		     public void doGet(HttpServletRequest req,HttpServletResponse reso) throws IOException
		        {
		        	      PrintWriter o =reso.getWriter();
		             o.println("hello servlet was worked well!!");
		        
		        }
		  
	//Post
		     
	public void doPost(HttpServletRequest req,HttpServletResponse reso) throws IOException
	{
	PrintWriter o1=	reso.getWriter();
	o1.println("post was executed"); // it execute in console
		
	}

   //DELETE
	
	 public void doDelete(HttpServletRequest req,HttpServletResponse reso) throws IOException
     {
     	      PrintWriter oo =reso.getWriter();
          oo.println("Delete was worked well!!");
     
     }


   //put
	 
	 public void doPut(HttpServletRequest req,HttpServletResponse reso) throws IOException
     {
     	      PrintWriter o2 =reso.getWriter();
          o2.println("hello servlet was worked well!!");
     
     }









}



