package DesingPattern;



class Thread01 implements Runnable
{
	
	private User user;
	
	
	public Thread01(User user)
	{
		this.user=user;
	}
	
	
	 Dbconnection  connection=Dbconnection.getconnection();
	
	@Override
	public void run() 
	{
		
		connection.save(user);
		System.out.println(Thread.currentThread().getName());
		
		
		
	}

		
	

	
}

class Thread02 implements Runnable
{
	
	User user;
	
	
}

class Thread03 implements Runnable
{
	
	User user;

	@Override
	public void run() {
		
		
	}
	
	
}

class Thread04 implements Runnable
{
	
	User user;

	@Override
	public void run() 
	{
		//User user=new User.UserDetails();
		DBConnection connection= Dbconnection.getconnection();
		connection.
		
	}
	
	
	
	
}






public class task004ThreaduseSingleton {

	public static void main(String[] args) 
	{
		

	}

}
