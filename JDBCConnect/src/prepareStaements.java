import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;


class product
{
	int id;
	String productname;
	int proprice;
	
	public product(int id, String productname, int proprice) 
	{	
		this.id = id;
		this.productname = productname;
		this.proprice = proprice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getProprice() {
		return proprice;
	}

	public void setProprice(int proprice) {
		this.proprice = proprice;
	}

}
  
	   static ArrayList<product>arr=new ArrayList<>();
	   
	   public static void productList()
	   {
		   arr.add(new product(5,"milk",25));
		   arr.add(new product(6,"chips",15));
		   arr.add(new product(7,"sweets",115));
		   arr.add(new product(8,"donuts",225));
		   arr.add(new product(9,"bread",35));
		   arr.add(new product(10,"peanut butter",150));
		   arr.add(new product(11,"curd",55));
		   
		   
		   
	   }
	   
   












public class prepareStaements 
{
	public static Connection Connections() throws SQLException
	{
		String url="jdbc:mysql://localhost:3306/jdbc_create";
		String username="root";
		String password="nila";
		
		return DriverManager.getConnection(url, username, password);
	}
	
	
	
	public static  void insertion(int id,String productname,int proprice) throws SQLException
	{
		Connection con=Connections();
		
//		String query="insert into product values(?,?,?)";
//		PreparedStatement pst =con.prepareStatement(query);
//		pst.setInt(1, id);
//		pst.setString(2,productname );
//        pst.setInt(3,proprice);		
//        System.out.println( pst.execute());
        
        
        
        String query1="insert into product values(?,?,?)";
		PreparedStatement pstt =con.prepareStatement(query1);
		pstt.setInt(1, id);
		pstt.setString(2,productname );
        pstt.setInt(3,proprice);		
        
        int row=pstt.executeUpdate();
        System.out.println("row was affected :" +row);
        
       
	    
	}
	
	
	public static void upadation(int id,int proprice) throws SQLException
	{
		Connection con=Connections();
		String query="update product set  proprice = ? where id=?";
		  PreparedStatement pst=con.prepareStatement(query);
		  pst.setInt(1, id);
		  pst.setInt(2,proprice);
		
		  int row =pst.executeUpdate();
		  System.out.println("row was updated :" +row);

		
	}
	

	  public static void delete(int id) throws SQLException
	  {
		Connection con = Connections();
		 String query="delete from product where id=?";
		 PreparedStatement pst =con.prepareStatement(query);
		  pst.setInt(1, id);
		  
		  int row =pst.executeUpdate();
		  System.out.println("row was updated :" +row); 
		  
	  }
	
	/*  public static void selection(int id,String productname,int proprice) throws SQLException
	  {
		  Connection con=Connections();
		  String query="select*from product";
		  PreparedStatement pst=con.prepareStatement(query);
		 
		  pst.setInt(1, id);
		  pst.setString(2, productname);
		  pst.setInt(3, proprice);
		  
		  boolean res=pst.execute();
		  System.out.println(res);
		  
	  }*/
	  
	  
	  // bulk list insertion in product table 
	 
	public static void bulkinsertion()
	{
		
		
		
		
		
	}
	
	
	
	 public static void main(String[] args) throws SQLException 
	{
		// insertion(3,"honey",500);
		// insertion(4,"icecream",50);
	
		// upadation(250,3);	
	
	     //    delete(4);
	
		// selection();
	
	
	
	
	
	
	
	}

}
