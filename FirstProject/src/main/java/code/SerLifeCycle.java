package code;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/lifecycle")
public class SerLifeCycle extends HttpServlet
{
	
	     // in url la it show method not found (and it will print only one time in the concole)
         public void init()
         {
        	    System.out.println("init method was work");
        	    
         }

       public void service(HttpServletRequest req , HttpServletResponse res)
       {
    	      System.out.println("hello this is serive method ");
       }
       
       
       public void destory()
       {
    	      System.out.println(" destory!!");
       }  













}
