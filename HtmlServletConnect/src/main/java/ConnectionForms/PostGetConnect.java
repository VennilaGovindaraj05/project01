package ConnectionForms;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


//registration form post

@WebServlet("/Reg")
public class PostGetConnect extends HttpServlet
{   

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{

		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		
		
		 try {
			Connection con=DBConnection.getConnection();
		
			String query="insert into  LoginTable(name,email,password) values(?,?,?)";
			
		    PreparedStatement pst= con.prepareStatement(query);
		    pst.setString(1,name);
		    pst.setString(2, email);
		    pst.setString(3, password);
		    
		 int row =  pst.executeUpdate();
		   
		 System.out.println("row was affected !!" +row);
		 
         req.getRequestDispatcher("HomePage.html").forward(req, res);
		 
		    
		 } 
		 catch (SQLException e) 
		 {
			e.printStackTrace();
		 } 
		 catch (ClassNotFoundException e) 
		 {
			
			e.printStackTrace();
		}
		
		
	 
		
	}
	

}
