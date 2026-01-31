import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



              // STATEMENT

public class SatementUsingMethods
{
	
	public static Connection ConnectionCreation() throws SQLException
	{
		String url="jdbc:mysql://localhost:3306/jdbc_create";
		String username="root";
		String password="nila";
		
		return DriverManager.getConnection(url, username, password);
	}
	
	
	
	
	public static void SelectAll() throws SQLException
	{ 
		Connection con=ConnectionCreation();
		Statement std=con.createStatement();
		String querry="Select*from employe";
		
		ResultSet res=std.executeQuery(querry);
		
		 while(res.next())
	     {
	    	  
	    	   System.out.println(res.getInt(1)+"  "+
	    	                     res.getString(2)+"  "+
	    	                     res.getString(3)+"  "+
	    	                    res.getInt(4)+"  "+
	    	                     res.getInt(5));  
	    	  
	     }    
	}
	
	

   
         public static void insertwithoutparameter() throws SQLException
         {

        	 Connection conn=ConnectionCreation();
     		Statement std=conn.createStatement();
     		String querry="insert  into  employe values(13,'mega','MANAGER',30000)";
        	 int rows = std.executeUpdate(querry);
        	 
        	 System.out.println("rows affected :"+rows);
        	 
        }


         
         public static void insertwithparameter(int id,String name,String job,int salary) throws SQLException
         {
        	   Connection connect =ConnectionCreation(); 
        	   Statement std=connect.createStatement();
        	   String query="insert into employe values("+id+",'"+name+"','"+job+"',"+salary+");";
        	   int row=std.executeUpdate(query);
        	   
        	   System.out.println("row affecteded :"+row);
        	 
         }
         
         
         // user defined insertions
         
         public static void userinsertion() throws SQLException
         {
        	   
        	 Scanner scan=new Scanner(System.in);
        	 Connection co=ConnectionCreation();
        	 Statement std=co.createStatement();
        	 
        	 System.out.println("Enter the user id :");
        	 int id=scan.nextInt();
        	 
        	 System.out.println("Enter the user name :");
        	 String name=scan.next();
        	 
        	 System.out.println("Enter the user job :");
        	 String job=scan.next();
        	 
        	 System.out.println("Enter the user salary :");
        	 int salary=scan.nextInt();
        	 
        	 String querry="insert into employe values("+id+",'"+name+"','"+job+"',"+salary+");";
        	 int rowss = std.executeUpdate(querry);
        	 
        	 System.out.println("row affecteded :"+rowss);
        	 
        		 
         }
         
         // update in without parameter 
         
         public static  void UpdateTable() throws SQLException
         {
        	    
        	   //update emp 4 -> analyst to HR
        	 
        	    Connection con = ConnectionCreation();
        	    Statement std =con.createStatement();
        
        	     String query="update employe set job='HR' where id=4";
        	    int row=std.executeUpdate(query);        	    
        	    System.out.println(row +" : row  was affected !!");
        	    
        	    
         }
         
         //upadte withparamtere

         public static  void UpdateTablewithparameter(int id) throws SQLException
         {
        	    
        	   //update emp 4 -> salary 45 to 85.
        	 
        	    Connection con = ConnectionCreation();
        	    Statement std =con.createStatement();
        
        	     String query="update employe set salary='85000' where id=4";
        	    int row=std.executeUpdate(query);        	    
        	    System.out.println(row +" : row  was affected !!");
        	    
        	    
         }
         //without parameter
         
         public static void deletedatas() throws SQLException
         {
        	   Connection con = ConnectionCreation();
           Statement std = con.createStatement();
           String query="delete from employe  where id=4";
           int row=std.executeUpdate(query);
           System.out.println("delete row was affected :" +row);
   
         }
         
         //delete with parameter
         
         public static void deletewithpara(String name) throws SQLException
         {
        	 
        	    Connection con =ConnectionCreation();
        	              Statement std =con.createStatement();
        	    String querry="delete from employe where job='Developer' "; // 2record deleted whoare all have developer role was deleted 
        	    String querry1="delete from employe where name='" + name +"';"; // jeeva was deleted
        	   // int row = std.executeUpdate(querry);
        	    int row=std.executeUpdate(querry1);
        	    System.out.println("deleted row was affected:" + row);
        	    
         }
         
         //drop the location column in department table .
         
         public static void dropColumn() throws SQLException
         {
        	 
        	     Connection con= ConnectionCreation();
        	     Statement std=con.createStatement();
        	     
        	     String query="alter table dept drop loc ";
        	     int row=std.executeUpdate(query);
        	     System.out.println("drop the location was affected :" +row);
       
        	     
         }
         
         
         public static void TableCreation() throws SQLException
         {
        	 
        	    Connection con=ConnectionCreation();
        	    Statement std=con.createStatement();
        	    String query="create table emp(id int , name varchar(20))";
        	    String query1="insert into emp values(101,'abc');";
        	    
        	   // System.out.println(query);
        	 //  int row =std.executeUpdate(query);
        	  // System.out.println("table creation wAS AFFECTED :"+row);
        	    
        	       int row1 =std.executeUpdate(query1);
         	   System.out.println("insertion was affected :" +row1);
        	    
        	    
         }
         
         //batchprocess
         
         public static void batchprocess() throws SQLException
         {
        	    Connection con  =ConnectionCreation();
        	     Statement std = con.createStatement();
        	     
        	     String createquery="create table product(id int ,productname varchar(30),proprice int )";
        	     String insertquery1="insert into product values(1,'chocolate',150)";
        	     String insertquery2="insert into product values(2,'cake',350)";
        	     String insertquery3="insert into product values(3,'brownie',250)";
        	   
        	    // update
        	    
        	    String updatequery="update product set proprice=270 where id = 2";
        	    
        	    // delete
        	    
        	    String deletequerry="delete from product where id=3";
        	    
        	    std.addBatch(createquery);
        	    std.addBatch(insertquery1);
        	    std.addBatch(insertquery2);
        	    std.addBatch(insertquery3);
        	    std.addBatch(updatequery);
        	    std.addBatch(deletequerry);
        	    
        	    
        	   int arr[]= std.executeBatch();
        	   
        	   for(int result : arr) 
        	   {
        	    System.out.println("rows waas created :"+result);
        	   }
        	    
         }
         
         
         // sql injections ( while 1 - 1 condition was true : it delete all the record )
         
         public static void sqlinjections() throws SQLException
         {
        	     Connection con=ConnectionCreation();
        	     Statement std=con.createStatement();
        	     String query="delete from employe where id=14 or '1'='1';";
        	 int row=std.executeUpdate(query);
        	 System.out.println(row);
        	 
         }
         
         
         
   public static void main(String[] args) throws SQLException
   {
	
	   //  SelectAll(); 
	   
	   // insertwithoutparameter();
	 //   insertwithparameter(14,"max","HR",22000);
	    
	  //  userinsertion();
	    
	    
	 // UpdateTable();
	    
	 // UpdateTablewithparameter(4);
	    
	   // deletedatas();
//	   
//	   deletewithpara("Hari") ; // with where condition
//	    deletewithpara("Jeeva") ; //without condition
	    
	  //  dropColumn();
	    
	  // TableCreation() ;
	   
	   
	 //  batchprocess() ;
	   sqlinjections() ;
	   
	   
	   
	   
	   
	   
	   
}
}
