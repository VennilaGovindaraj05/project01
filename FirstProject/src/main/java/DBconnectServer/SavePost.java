package DBconnectServer;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


//using init-param to connect server


public class SavePost  extends HttpServlet
{
   public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException 
   { 
	 
	       ServletConfig conf=super.getServletConfig();
	       String dbUsername=conf.getInitParameter("dbUsername");
	       String dbPassword=conf.getInitParameter("dbPassword");
	   
	   
	   String name=req.getParameter("name");
       String gender=req.getParameter("gender");
       String password=req.getParameter("password");
       String email=req.getParameter("email");
        
       res.setContentType("text/html");
       
       try 
       {
	     
    	   Connection con=DBConnections.getConnection(dbUsername,dbPassword);
    	   
		 String insert ="insert into Employe(name,gender,password,email) values(?,?,?,?)";
        
		 PreparedStatement pst =	con.prepareStatement(insert);
		pst.setString(1, name);
		pst.setString(2, gender);
		pst.setString(3, password);
		pst.setString(4, email);
	
		int row =pst.executeUpdate();
		System.out.println("row was inserted  : " +row);
		
		
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	} catch (ClassNotFoundException e1) {
		
		e1.printStackTrace();
	}
       
      
	   
   }
	
 
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		
		   ServletConfig conf=super.getServletConfig();
	       String dbUsername=conf.getInitParameter("dbUsername");
	       String dbPassword=conf.getInitParameter("dbPassword");
	
		res.setContentType("application/json");
		PrintWriter out=res.getWriter();
	
		
		try {
			Connection con=DBConnections.getConnection(dbUsername,dbPassword);
		  
			Statement std=con.createStatement();
		  
			String query="Select*from Employe ";
		   
			ResultSet rs= std.executeQuery(query);
		   
		   StringBuilder bf=new StringBuilder(" [");
		   while(rs.next())
		   {
			   
			   if (bf.length() > 1) 
			   {
			        bf.append(" ");
			    }
			   
			   
			  bf.append(String.format("{\"name\" :\"%s\" ,\"gender\" : \"%s\",\"password\": \"%s\",\"email\" : \"%s\" }" 
					  ,rs.getString(1),
					  rs.getString(2),
					  rs.getString(3),
					  rs.getString(4))); 
		   
		   }
		  
			   bf.append("]"); 
			   out.println(bf.toString());
		 

		} catch (SQLException e) {
			
			e.printStackTrace();
			
		
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	
 
        
	}
}
