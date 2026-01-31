package java8;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class optionalclass 
{
	
	public static Optional<String> add(Optional<String> oc)
	{
		return oc;
	}

	public static void main(String[] args) 
	{
		//of
		Optional<String>obj=Optional.of("hii");//of(null)
		System.out.println(obj);//Optional[hii]//nullpointerexception
		System.out.println(obj.get());//->get the value ->hii
		
		//empty
		Optional<String>obj1=Optional.empty();
		System.out.println(obj1);//Optional.empty
		
		//ofnullable
		Optional<String>obj2=Optional.ofNullable(null);//(null)
		System.out.println(obj2);//Optional[hello]
		
		//get
		Optional<String>obj3=Optional.ofNullable("hello");//null
		System.out.println(obj3.get());//nosuchelementexception
//
//		Optional<String>obj4=Optional.of(null);
//	    System.out.println(obj4.get());
	
	    //isPresent()
	  
		Optional<String>obj5=Optional.ofNullable("hello");
	    System.out.println(obj5.isPresent());//true
	   
	    Optional<String>obj51=Optional.ofNullable(null);
	    //System.out.println(obj51.isPresent());
	   
	    if(obj51.isPresent())
	    {
	    	System.out.println(obj51.get());
	    }
	    else
	    {
	    	System.out.println("no data found"); 
	    }
	
	    
	    //isEmpty()
	    Optional<String>obj6=Optional.ofNullable(null);//"hello"
	    System.out.println(obj6.isEmpty()); //true    //false
	
	   //ifPresent()
	    Optional<String>obj7=Optional.ofNullable("helloooo");	
//	    Consumer<String>con=new Consumer<>()
//	    		{
//					@Override
//					public void accept(String t) 
//					{
//					   System.out.println(t.replace("h", "H"));	
//					}
//	    	
//	    		};
//	    obj7.ifPresent(con);//Helloo
	    
	    //using lambda
	    obj7.ifPresent((t)->System.out.println(t.replace("h", "H")));
	
	   //orElse()
       	
	    Optional<String>obj8=Optional.ofNullable(null);	//helloo
	    System.out.println(obj8.orElse("default value"));//helloo
	
	   //orElseGet() 
	    
	    Optional<String>obj9=Optional.ofNullable(null);//values
	  //  System.out.println(obj9.orElseGet(()->"Default"));
	    Supplier<String>sp=new Supplier<>()
	    		{
	          		@Override
					public String get() 
				{	
					return "Default";
				}};	    
	    
	    System.out.println(obj9.orElseGet(sp));//default //values
	
	    //orElseThrow
	    Optional<String>obj10=Optional.ofNullable(null);//java
      
	    try
	    {
	    String s=obj10.orElseThrow(()->{throw new RuntimeException("Runtime Exception try again!!");});//NoSuchElementException
	    System.out.println(s);
	    }
	    catch(RuntimeException e)
	    {
	    	System.out.println(e.getMessage());//java
	    }
	    
	    //.map(function)
	    Optional<String>obj11=Optional.ofNullable("JAVA IS A");
	    
	    Function<String,String>fun=new Function<String,String>()
	    		{

					@Override
					public String apply(String t) 
					{
					
						return t.toLowerCase();
					}
	    	
	    		};
	    	 Function<String,String>funn=new Function<String,String>()
		    		{

						@Override
						public String apply(String t) 
						{
						
							return t + " high value programming language ";
						}
		    	
		    		};   		
	obj11.map(fun).map(funn).ifPresent((x)->System.out.println(x));;
	    
	    
	    
	    
	    
	    
	
	}

}
