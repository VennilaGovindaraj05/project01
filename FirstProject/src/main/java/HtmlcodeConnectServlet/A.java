package HtmlcodeConnectServlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// A server connect to B server.

@WebServlet("/A")	
public class A extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		req.setAttribute("name", "jansi");
		req.setAttribute("password", "jan123");
		req.getRequestDispatcher("B").forward(req, res);
		
	}

}
