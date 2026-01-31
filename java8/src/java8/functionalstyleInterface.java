package java8;

import java.util.ArrayList;
import java.util.Arrays;

//interface updation in corejava 

@FunctionalInterface
interface V
{
	void s();
	//void v();//not allowed
}



interface S
{
	void v();//single abstract method
	default void abc()//ddefault method allowed
	{
		
	}

   static void method11()//static method allowed
   {
	   
   }

}

class f //imperative
{

	public static ArrayList<Integer> list=new ArrayList<>(Arrays.asList(2,7,9,1,10,6,8,3,4,5));
	
	public static ArrayList<Integer> findoddnumbers(ArrayList<Integer> arr)
	{
		ArrayList<Integer> al=new ArrayList<>();
		
		
		for(int i:list)
		{
  	    if(i%2 != 0)   
		{
  	         al.add(i);
			
		}
		}
	
  		return al;
	}
	
}





interface program
{
	void add();	//one interface
	
	   String toString();
	   int hashCode();
	    // Object clone();
	    boolean equals(Object o);
	   
	    default void method()
	    {
	    	System.out.println("default method interface");
	    }
	   
	    static void method2()
	    {
	    	System.out.println("static method in intereface");
	    }
	   
}

class Sample implements program
{
 
	int x=1;
	
	@Override
	public void add() 
	{
		System.out.println("add implements in sample ");
		
	}
	
    public int getvalue()
    {
    	//x++;
    	return x;
    }

//    public String toString()
//    {
//    	return "hello";
//   }
   
}


public class functionalstyleInterface 
{
 
	
	
	public static void display(program obj)
	{
		obj.add();
		obj.method();
		program.method2();
		
	}
	
	
	public static void main(String[] args)
	{
		
	//	Sample s=new Sample();//imperative
		
		display(()->System.out.println("hello lambda"));	//one line declarative (using lambda)

		
		
//		display(s);
//	    System.out.println( s.getvalue());    //(using ++ given 2()diffrent value (so it impurefuntion ))
	   
	   
	   
//	     System.out.println(s.getvalue());         //(using return given 1 value (it was pure function))
//	   
//	     
//	     System.out.println(findoddnumbers(list));	   
		
//	     System.out.println("object class method allowed in interface ");
//	     System.out.println(s.toString() );
//	  
//	     System.out.println(s.hashCode());
//	     System.out.println(s.equals(s));
//	     System.out.println(s.getClass());
	      
	
	
	}

}

