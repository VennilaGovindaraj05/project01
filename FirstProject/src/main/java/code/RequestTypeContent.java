package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/request")
public class RequestTypeContent extends HttpServlet
{
   public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException
   {
	   BufferedReader b =req.getReader();
	   int i;
	   
	   while((i=b.read()) != -1)
	   {
		
		   char ch=(char)i;
		System.out.print(ch);   
	  
	   }
	   
	   
	   res.setContentType("application/json");
	   PrintWriter out =res.getWriter();
	   out.println("response was runned !!");
	   
	   
	   
	   
	   //readline : read 
	 /*   String j;
	    
	   while((j=b.readLine()) != null )
	   {
		
		   String ch=j;
		System.out.print(ch);   
	  
	   }*/
	   
	   
	   
   }
}
