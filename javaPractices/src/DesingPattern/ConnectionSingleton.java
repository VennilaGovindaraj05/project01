package DesingPattern;

public class ConnectionSingleton 
{

	private static  ConnectionSingleton conn = null;
	
	
	
	private ConnectionSingleton() 
	{
		System.out.println("connecting the singletondesign");
	}
	
	public void connection(User user)
	{
		System.out.println(user);
		System.out.println("given details is saveded");
	}
	

	//another class connect user2
	public void connection( singletonUser2  user2)
			
	{
		System.out.println(user2);
		System.out.println("given details is saveded");
	}
	
	
   public static ConnectionSingleton getInstances()
   {
	  if(conn==null)
	  {
		  conn=new ConnectionSingleton ();
	  }
	   
	return conn ;
	   
   }

   
	
	
	

}
