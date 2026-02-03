package HtmlcodeConnectServlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/code")
public class Connections extends HttpServlet
{ 
	public void doGet(HttpServletRequest req ,HttpServletResponse res)
	{
		String name=req.getParameter("username");
		String password=req.getParameter("password");
		
		System.out.println(name + " - "+password);
	}

}
