package taskvideoComments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection
{
	public static Connection getConnection() throws SQLException
	{
		String url="jdbc:mysql://localhost:3306/videoTask";
		String username="root";
		String password="nila";
		return DriverManager.getConnection(url, username, password);
		
	}



}
