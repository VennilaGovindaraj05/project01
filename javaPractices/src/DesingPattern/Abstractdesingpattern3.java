package DesingPattern;

//3.Abstract method : similar to factory method

interface DBConnection
{
	void databaseConnection();
}

class Mysql implements DBConnection
{

	@Override
	public void databaseConnection() 
	{
		System.out.println("MYSql cpnnected with DBConnection");
		
	}
	
}

class Datastructed implements DBConnection
{

	@Override
	public void databaseConnection() 
	{
	System.out.println("Datastructed connected with DBConnection");	
		
	}
	
}



public class Abstractdesingpattern3
{

	public static void main(String[] args)
	{
		
		//dynamic biniding and upcasting
		
		DBConnection dbcon=new Datastructed();  // Mysql();
		dbcon.databaseConnection();

	}

}
