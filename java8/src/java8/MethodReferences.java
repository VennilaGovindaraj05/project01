package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

interface music
{
	void recentplaylist();
	
}
interface A
{
	static void method(String st)
	{
		System.out.println(st);
	}
}

public class MethodReferences
{
        
	//supplier (construtor)
	
	public MethodReferences()
	{
		System.out.println("hello default constructor");
	}
	
	public MethodReferences(int x)
	{
		
	}
	
	
	

	//instance type;
	public static void recentplaylist()
	{
		System.out.println("1.TAMIL SONG-> NEYUM NANUM ANBAE !!");
		
	}
	
	
    public String converttostring(int x)
    {
    	switch(x)
    	{
    	case 1: return "one";
    	case 2:return "two";
    	case 3:return "three";
    	case 4:return "four";		
    	}
    	
    	return "default";
    	
    }
    
    
	public static void main(String[] args) 
	{
		music obj=MethodReferences::recentplaylist;
		obj.recentplaylist();
		
		//lambda
		
		Function<Float,Integer>fun=(x)->Math.round(x);
		System.out.println(fun.apply(12.6f));
		
		
		
		//method reference
		Function<Float,Integer>funn=Math::round;		
		System.out.println(funn.apply(5.6f));
		
		UnaryOperator<Double> sp=Math::sqrt;
		System.out.println(sp.apply(56.0));
		
		
		
		//interface a->method references
		
		Consumer<String> con=A::method;
		con.accept("helloo ");
	
		
		//instance converttostring
		//using stream
		
//		//lambda 
		
//		MethodReferences objj=new MethodReferences(0);		
//		Stream.of(1,2,3,5,6,2,4,4,3,1,2)
//		.map((x)->objj.converttostring(x))
// 	.forEachOrdered(System.out::println);		
		
		//function
		
		
		//arbitary method references
		
		ArrayList<String>list=new ArrayList<String>(Arrays.asList("hello","world","java","collections","stream"));
		Collections.sort(list, String::compareToIgnoreCase);
		System.out.println(list);
		
		LinkedList<Integer> arr=new LinkedList<Integer>(Arrays.asList(1,5,10,4,6,7,3,2,9,8));
//		Comparator<Integer>comp=new Comparator<Integer>()
//				{
//
//					@Override
//					public int compare(Integer o1, Integer o2) {
//					
//						return 01 - 02;
//					}
//			
//				};
				
		//Collections.sort(arr,Integer.MIN_VALUE);
		System.out.println(arr);
		
		
	//constructor method references
		
		//imperative
		
		Supplier<MethodReferences>supply=new Supplier<MethodReferences>()
				{

					@Override
					public MethodReferences get()
					{
						
						return new MethodReferences();
					}
		         };
		
		         
		         //lambda
		         
		         Supplier<MethodReferences>supplyy=MethodReferences::new;
		         MethodReferences obj1=supplyy.get();
		         System.out.println(obj1);
		         
		        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
	

}
