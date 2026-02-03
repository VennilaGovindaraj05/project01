package ConnectionForms;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//login form 


@WebServlet("/log")
public class RegeServer extends HttpServlet
{
       public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
       {
    	       
    	    
    	      String name=req.getParameter("name");
    	     
    	      
    	      try {
				Connection con=DBConnection.getConnection();
				 
				     Statement std=con.createStatement();
				   String query="select*from LoginTable";				
				
				   ResultSet rs=std.executeQuery(query);
				
				   
				   boolean found=false;
				while(rs.next())
				{
					if(name.equals(rs.getString("name")))
					{
						 found=true;
						break;
					}
	
				}
					
					if(found)
					{
					res.sendRedirect("Sucess.html");
				    }
				else
				{
					res.sendRedirect("Invalid.html");
				}
				
				
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}
    	    
       }
}
