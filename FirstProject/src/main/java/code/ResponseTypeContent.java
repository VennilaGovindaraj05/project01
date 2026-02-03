package code;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/typeContent")
public class ResponseTypeContent extends HttpServlet
{
   public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException
   {
	   //text convert html
	   res.setContentType("text/html");
	  PrintWriter out = res.getWriter();
	  out.println("<h1> Type content was convert html </h1>");
	  
	  //text-plain
	  res.setContentType("text/plain");
	  PrintWriter out1 = res.getWriter();
	  out1.println("hello  srinithi");
	   
	  //application - jason
	  
	  res.setContentType("application/json");
	  PrintWriter out2=res.getWriter();
	  out2.println("{\"id\":101, \"name\":\"swetha\" ,\"salary\" : \"2000.00\"   }");
	  
	  //application - xml
	  res.setContentType("application/json");
	  PrintWriter out3=res.getWriter();
	  out3.println("<friends><name>Jansi</name><name>sri</name><name>swe</name> </friends>");
	  
	  
	  
	  
	  
	   
   }
	
}
