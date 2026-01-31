import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCreation {

	public static void main(String[] args) throws SQLException 
	{
		String url="jdbc:mysql://localhost:3306/indexes";
		String username="root";
		String password="nila";

		// 1. Driver Manager .
		
		Connection con =DriverManager.getConnection(url, username, password);
		
		//2.statement
		
		Statement std =con.createStatement();
		
		//3.query
		 String query="Select* from employe";
	      ResultSet res =std.executeQuery(query);		
		
	      res.next();
	     System.out.println( res.getInt(1) + " "+res.getString(2)); //whle using like this only get one person data only
	      
	      // use loop it get all records
	     
	     while(res.next())
	     {
	    	  
	    	   System.out.println(res.getInt(1)+"  "+res.getString(2)+"  "+res.getString(3)+"  "+res.getInt(4)+"  "+res.getInt(5));
	    	  
	     }
	      System.out.println(res.next());
	      
	      
	  	      
	      
	      
	      
	}

}
