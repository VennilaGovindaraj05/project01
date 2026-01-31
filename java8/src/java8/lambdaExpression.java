package java8;

import java.util.function.BiConsumer;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
//import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class lambdaExpression
{
	// 1.PREDICATE
	public static boolean filter(Predicate<Integer> obj)
	{
		return obj.test(2);
	}
	
   //2.CONSUMER
	
	public static void forEach(Consumer<String> obj1)
	{
		obj1.accept("my name is nila");
	}
	
	//3.Supplier
	
	public static String generate(Supplier<String> obj2)
	{
		return obj2.get();
	}
	
	//4.function

	public static boolean map(Function<String,Boolean> obj3)
	{
		return obj3.apply("welcome home!");
		
	}
	
	public static String method(UnaryOperator<String> obj4)
	{
		return obj4.apply("hello");
		
	}
	
	
	
	//double parameter
	
	//1.BiPredicate
	public static boolean sample1(BiPredicate<String,Integer> obj)
	{
		return obj.test("brownies", 9 );//count the browines length and print true or false
	}
	
	//2.BiFunction
	
	public static String sample2(BiFunction<String,Integer,String> obj)
	{
		return obj.apply("the value is :", 25);
	}
	
	//3.BiConsumer
	
	
	
	
	
	
	
	
	
    public static void main(String[] args)
    {
//    	Predicate<Integer> obj = new Predicate<>()
//    			{
//					@Override
//					public boolean test(Integer t) {
//						
//						return t%2 == 0;
//					}
//    			};
//    	
//    	    System.out.println(filter(obj));
		
    	//LAMBDA EXPRESSION 
    	
    	    Predicate<Integer> obj=(t)->{return t%2 ==0;};
    	    System.out.println(filter(obj));
    	
    	/* Predicate<Integer> obj=(t)-> t%2 ==0;
 	      System.out.println(filter(obj));*/
    	    
    	
 	    System.out.println(filter((t)->t%2==0));
    	 
 	    //2.consumer
 	    
// 	   Consumer<String> obj1=new Consumer<>()
// 	   {
//
//		@Override
//		public void accept(String t) 
//		{
//			System.out.println(t);
//			
//		}
// 	    };
//    	 forEach(obj1);
//    	    
    	    
//    	Consumer<String> obj1=(String t)->System.out.println(t);    
//   	    forEach(obj1);
//    	    
//    	//3.supplier
//    	
//    	 Supplier<String>obj2=()->"Hello" ;  
//    	 
//    	 System.out.println(generate(obj2));
//    	    
//    	//4.function
//    	 Function<String,Boolean>obj3=(t)->t.contains("w");
//    	  System.out.println(map(obj3));  
//    	  
//    	 System.out.println(map((t)->t.contains("e"))); 	    
//    	   
    	 
    	 //5.UnaryOperator
    	 
    	 UnaryOperator<String>obj4=new UnaryOperator<>()
    	 {

			@Override
			public String apply(String t) 
			{
				
				return t.concat("o");
			} 
         };
    	 
    	  System.out.println(method(obj4));  
   
    
        System.out.println(method((t)->t.concat("e")));  
    
       UnaryOperator<String>obj41=(t)->t.toUpperCase();
      System.out.println(method(obj41));
    
    
      
      
      
      
      
      //doubleparameter
      
      System.out.println(" DOUBLE PARAMETER METHODS");
    
//    BiPredicate<String,Integer> res=new BiPredicate<>()
//    {
//
//		@Override
//		public boolean test(String t, Integer u)
//		{
//			
//			return t.length() ==u;
//		}
//    	
//     };
//   
//    	System.out.println(sample1(res));	
     
    		
//    		
    	 BiPredicate<String,Integer> res=(t,u)->t.length()==u;
   	     System.out.println(sample1(res));
//    		
//    		
//    		//2.BiFuncion
//    	 
//    	 BiFunction<String,Integer,String> res1=new  BiFunction<>()
//    	{
//
//			@Override
//			public String apply(String t, Integer u) 
//			{
//				
//				return  t +"  " +u;
//			}
//    		 
//    	};
//    		
    		System.out.println(sample2((t,u)-> t +"  " +u));
    		
    		
    		
    	
    }
}
