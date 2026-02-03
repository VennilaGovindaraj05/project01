package Mypractices;


class Dbconnection
{
	private static  Dbconnection connection=null;
	
	private Dbconnection()
	{
		System.out.println("Dbconnection constructor");
	}
	
	public static void save(User user)
	{
		System.out.println(user);
		System.out.println("connection was saving!!");
	}

public static Dbconnection getconnection()
{
	if(connection == null)
	{
		connection=new Dbconnection();
	}
return connection;

}


}


public class Task04desingpattern {

	public static void main(String[] args)
	{
		

	}

}
