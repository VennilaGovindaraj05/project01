package TaskJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnections 
{
	
	public static Connection getConnection() throws SQLException
	{
		String url="jdbc:mysql://localhost:3306/TaskJDBC";
		String username="root";
		String password="nila";
		return DriverManager.getConnection(url, username, password);
		
	}

	
	
}