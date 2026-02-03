package synchronaizationThred;

public class block 
{
	//instances block
	{
		System.out.println("this is instances block");
	}
	block()
	{
		System.out.println("this is block constructor");
	}
	
	static {
		System.out.println("this is static block");
	}
	
public static void main(String args[])
{
	block obj=new block();
	System.out.println("this is main method");
}
}
