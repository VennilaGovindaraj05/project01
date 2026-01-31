package java8;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;


//static method references

interface practice
{
	static void add(String s,Integer i)
	{
		System.out.println(s+ " " +i);
	}
}



public class methodreferencespractices implements practice
{
	public static void add(String s,Integer i)
	{
		System.out.println(s+"the value is :" +i);
	}
	
	
      public static void main(String[] args) 
      {
    	  Function<Integer,String> fun=new Function<>()
    			  {

					
					@Override
					public String apply(Integer t)
					{
						String obj="the value is :" +t ;
						return obj;
					}
    		  
    			  };
    	    
    		
    			System.out.println(fun.apply(12));
		     
     	
    			
    			
    			
    			
    			//methodreferencespractices obj=new methodreferencespractices();
    			
//    			methodreferencespractices  objj=practice::add;
//     	      objj.add();
    		
    			
 //   			Stream.of(2,5,6,8,1,9)
//		     .map(fun)
//		     .forEach(System.out::println);
//        			  
    			  
    			  
    			  
    			  
    			  
    			  
    			  
    			  
    			  
    			  
    			  
    			  
	  }
}
