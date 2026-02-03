package HtmlcodeConnectServlet;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


 @WebServlet("/vali")
public class login extends HttpServlet
{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
    {
    	    
    res.setContentType("text/html");
    	res.getWriter().println("<!DOCTYPE html>\r\n"
    			+ "<html>\r\n"
    			+ "\r\n"
    			+ "<body>\r\n"
    			+ " <form action=\"validate\"method=\"get\">\r\n"
    			+ " <label for=\"username\">username</label> \r\n"
    			+ "<input type=\"text\" name=\"username\">\r\n"
    			+ "<label for=\"password\">password</label>\r\n"
    			+ "<input type=\"=text\"name=\"password\">\r\n"
    			+ "<button type=\" submit \">submi </button>\r\n"
    			+ "\r\n"
    			+ " </form>\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "</body>\r\n"
    			+ "\r\n"
    			+ "\r\n"
    			+ "</html> " );
    	
    	
    	
    	  
    	
    	
    	 
    }
}
