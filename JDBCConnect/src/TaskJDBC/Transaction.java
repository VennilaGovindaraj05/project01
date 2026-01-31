package TaskJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

 public class Transaction 
 {
	public static void createAccountDetails() throws SQLException
	{
		
		Connection con=DBConnections.getConnection();
		Statement sts=con.createStatement();
		AccountCreate obj=new AccountCreate();
		
		String query="insert into AccountDeatils(acc_name,acc_num,acc_balance,mobile_no)values('"+obj.getAcc_name()+"' , "+obj.getAcc_num()+" ,"+obj.acc_balance+" , "+obj.mobile_no+");";	
		int row = sts.executeUpdate(query);
		System.out.println(row);
	
	}
	

	public static Connection shownDetails() throws SQLException
	{
		Connection con=DBConnections.getConnection();
		Statement std =con.createStatement();
		String query="select*from AccountDeatils";
		ResultSet res =std.executeQuery(query);		
        while(res.next())
        {
		System.out.println(res.getInt(1)+"  "+res.getString(2)+"  "+res.getInt(3)+"  "+res.getInt(4)+"  "+res.getInt(5));
        }
		return con;		
	}

	
	public static void deposite_details() throws SQLException
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the sender acc_number :");
		int nu1=scan.nextInt();
		
		System.out.println("Enter the recevier acc_number :");
		int nu2=scan.nextInt();
		
		
		Connection con=DBConnections.getConnection();
		Statement std =con.createStatement();
		String query="select*from AccountDeatils where acc_num ="+nu1;
		ResultSet res =std.executeQuery(query);
		
		System.out.println("Sender details !!");
		
		res.next();
		System.out.print("Name :" +res.getString(2)+
				"  "+"Account num :"+res.getInt(3)+
				"  "+"Balance : "+res.getInt(4)+"  "
				+"mobile number :"+res.getInt(5));
        con.close();
		
	try {
		
		System.out.println("Enter the deposite amount :");
		
		int amount=scan.nextInt();
		Connection conn=DBConnections.getConnection();
		String query1="update AccountDeatils set acc_balance = acc_balance - ? where acc_num = ?";
	
		PreparedStatement pst=conn.prepareStatement(query1);
		pst.setInt(1, amount);
		pst.setInt(2,nu1 );
		pst.executeUpdate();
		
		String query2="update AccountDeatils set acc_balance = acc_balance + ? where acc_num = ?";
		
		PreparedStatement pst1=con.prepareStatement(query2);
		pst1.setInt(1, amount);
		pst1.setInt(2,nu2 );
		pst1.executeUpdate();
		
		conn.close();
	
	}
	
	catch(SQLException e)
	{
		System.out.println("Transaction failed!");
         e.printStackTrace();	
         
    

	}
	
	}
	
     public static void withdraw() throws SQLException
     {
    	    
    	    Connection con=DBConnections.getConnection();
    	    System.out.println("Enter the amount :");
    	    
    	    
    	    
    	    
    	    
    	    
    	 
    	 
     }
	
	public static void main(String[] args) throws SQLException 
	{  
		
		createAccountDetails();
		//shownDetails();
		//deposite_details();
		

	}

}
