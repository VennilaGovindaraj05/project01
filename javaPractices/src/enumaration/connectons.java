package enumaration;

public enum connectons 
{
	
	CONTINUE(100),
	PAGENOTFOUND(404),
	INTERNALSEVERERROR(0105);
	
	int statuscode;

	connectons(int statuscode)//constructor
	{
		this.statuscode=statuscode;
	}

	public int getstatuscode()
	{
		return statuscode;
		
	}

//	public String toString()
//	{
//		return this.statuscode;
//	}

}
enum sample
{
	METHOD
	{
		 void add()
		{
			int a = 10;
			int b=5;
			int res=a+b;
			System.out.println(res);
		}
	}
}
	
   enum program
	{
      A("hello"),
      B(""),
      C(""),
      D("");
		
	   String s="value";
	  
	program(String value)
	{
		this.s=value;
	}
	
	public String toString()
	{
		return s;
		
	}
	
	
	}
	
	
