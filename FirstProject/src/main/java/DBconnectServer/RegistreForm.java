package DBconnectServer;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/regFor")
public class RegistreForm extends HttpServlet
{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
    {
    	 
       res.setContentType("text/html");
       PrintWriter out=res.getWriter();  
       out.println("<!DOCTYPE html>\r\n"
       		+ "<html>\r\n"
       		+ "<title>\r\n"
       		+ "    Regestration form\r\n"
       		+ "</title>\r\n"
       		+ "<body>\r\n"
       		+ "<form action=\"helloserver\"method=\"post\">"
       		+ "\r\n"
       		+ "<label for=\"name\">Name</label>\r\n"
       		+ "<input type=\"text\" name=\"name\">\r\n"
       		+ "\r\n"
       		+ "\r\n"
       		+ "<label for=\"gender\">Gender</label>\r\n"
       		+ "<input type =\"text\" name=\"gender\">\r\n"
       		+ "\r\n"
       		+ "<label for=\"password\">Password</label>\r\n"
       		+ "<input type =\"text\" name=\"password\">\r\n"
       		+ "\r\n"
       		+ "\r\n"
       		+ "<label for=\"email\">Email</label>\r\n"
       		+ "<input type=\"text\" name=\"email\">\r\n"
       		+ "\r\n"
       		+ "<button type=\"submit\"> SUBMIT  </button>\r\n"
       		+ "\r\n"
       		+ "</form>\r\n"
       		+ "\r\n"
       		+ "</body>\r\n"
       		+ "\r\n"
       		+ "\r\n"
       		+ "</html>");
       
       
    }
}
