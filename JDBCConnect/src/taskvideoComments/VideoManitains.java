package taskvideoComments;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class VideoManitains
{
	public static void videoAdd() throws SQLException
	{
	      Connection con = DBConnection.getConnection();
		  Statement std = con.createStatement();
		  String query="insert into video(title,likes,views) values('Briyani Recipe',900,9000)";
		  int row= std.executeUpdate(query);
		  System.out.println(" row was affected !! " +row); 
		     
	}
	
	
	public static void showComments() throws SQLException
	{
		
		Connection con=DBConnection.getConnection();
		Statement std=con.createStatement();
		String query="select  co.comment  from video v inner join connects c on v.vid_id=c.v_id inner join comments co on co.com_id=c.c_id where vid_id=1";
		ResultSet res=std.executeQuery(query);
		res.next();
		
			System.out.println(res.getString(1));
		
		
	}
	

	public static void maxViews() throws SQLException
	{
		Connection con=DBConnection.getConnection();
		Statement std=con.createStatement();
		String query="select max(views)  from video v inner join connects c on v.vid_id= c.v_id inner join comments o on o.com_id = c.c_id";
		ResultSet res=std.executeQuery(query);
		
		res.next();
			System.out.println("Highest views video is : "  +res.getString(1));

	}
	
	
	public static void addComments() throws SQLException
	{
		Connection con=DBConnection.getConnection();
		Statement std=con.createStatement();
		String queryy="insert into connects values (8,2)";
		String query="insert into comments(comment)values('its very useful!')";
		// String quer="select  co.comment  from video v inner join connects c on v.vid_id=c.v_id inner join comments co on co.com_id=c.c_id where vid_id=1";
		
	   std.addBatch(queryy);
	   std.addBatch(query);
	  // std.addBatch(quer);
	
	   
	  int[] arr =	std.executeBatch();
		for(int a :arr)
		{
			 System.out.println( " row was acffected :"+a);
		}
			
	}
	

	<groupId>org.junit</groupId>
    <artifactId>junit-bom</artifactId>
    <version>5.11.0</version>
    <type>pom</type>
    <scope>import</scope>
	
	
	public static void main(String[] args) throws SQLException 
	{
		
		//videoAdd();
		//showComments();
		//maxViews();
		addComments();
		
	}


}
