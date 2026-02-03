package DBconnectServer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnections 
{ 
	
	public static Connection getConnection(String dbUsername,String dbPassword) throws SQLException, ClassNotFoundException
	{
		 Class.forName("com.mysql.cj.jdbc.Driver");

	 String url="jdbc:mysql://localhost:3306/servlet";	
	return  DriverManager.getConnection(url,dbUsername,dbPassword);
	 
	 
	
	
	
	
	
	}

}
