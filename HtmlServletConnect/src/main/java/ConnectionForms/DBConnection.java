package ConnectionForms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection
{
		/**
		 * @return
		 * @throws SQLException 
		 * @throws ClassNotFoundException 
		 */
		public static Connection getConnection() throws SQLException, ClassNotFoundException 
		{
			
			 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/Forms";
			String username="root";
			String password="nila";
			return DriverManager.getConnection(url,username,password);
			 
		
		
		
		
		
		}



}
