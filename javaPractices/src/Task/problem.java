package Task;

interface A
{
	default void add()
	{
		System.out.println("hello");
	}
  
	default void sub()
	{
		System.out.println("java");
	}








}

interface B
{
	default void add()
	{
		System.out.println("world");
	}
}






public class problem implements A,B
{
	@Override
	public void add()
	{
		
		A.super.add();
	    B.super.add();
	}

	
	
	public static void main(String[] args) 
	{
	        problem obj=new problem();
	         obj.add();
	
	
	
	
	
	
	
	
	}

	
	

}
