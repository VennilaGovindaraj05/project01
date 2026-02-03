package Wrapperclass;

//using generics

public class Program02 <T>
{

	public T display( T String )
	{
		
		return String ;
	}
	
	
	public T sub(T i)//byte
	{
		return i;
		
	}
	
	
	
	public static void main(String[] args)
	{ 
		//string
		 Program02<String> obj=new  Program02<>();
	     String x=obj.display("nila");
	     System.out.println(x);
	     
	     //integer
	    Program02<Integer> obj1=new  Program02<>();
        Integer i=obj1.add(90);
        System.out.println(i);
	    
        //byte
	    Program02<Byte> obj2=new  Program02<>();
		byte c=100;
		Byte g=obj2.sub(c);
		System.out.println(g);
		
		//float
		 Program02<Float> obj3=new  Program02<>();
		  Float f=obj3.sub(23f);
		  System.out.println(f);
	}

	

}
