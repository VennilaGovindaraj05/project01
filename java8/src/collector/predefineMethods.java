package collector;

import java.util.Collection;
import java.util.IntSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class predefineMethods 
{
	public static void main(String[] args) 
	{
		//toList-> stream convert to toList 
		 List<Integer> list =Stream.of(1,3,5,6,7,8,2)
	     .sorted()
		.collect(Collectors.toList());
		System.out.println(list);
		
		//toSet() 
		Set<Integer> set =Stream.of(11,13,15,16,17,18,12)
		.collect(Collectors.toSet());
		System.out.println(set);
		
		//toCollection()-> stream convert any another typr also like linkedlist ,arraylist
		Collection c=Stream.of(1,3,5,6,7,8,2)
		.collect(Collectors.toCollection(()->new LinkedList()));
		System.out.println(c);
		
		//String joning
		
		
		
		//joning->jonining the words like string
		String s1 =Stream.of("A","D","K","L","P")
				.collect(Collectors.joining());
		System.out.println(s1);
		
		
	   //joning()->jonining the words using ,coma
		
				String s =Stream.of("A","D","K","L","P")
				.collect(Collectors.joining(","));
				System.out.println(s);
		
		
		//joning(delimiter)
		
		String s2=Stream.of("A","O","V","B","E")
		.collect(Collectors.joining(",", "[", "]"));
		System.out.println(s2);
		
		
		//counting
		
		//1.countiing
		
		Long count=Stream.of(1,3,5,6,7,8,2)
		.collect(Collectors.counting());
		System.out.println(count);
		
		//2.summingInt
		Integer in=Stream.of(1,3,5,6,7,8,2)
		.collect(Collectors.summingInt((x)->x));
		System.out.println(in);
		
		//3.summingLong
		        Long longsum=Stream.of(1,13,51,69,789,28,200)
				.collect(Collectors.summingLong((x)->x));
				System.out.println(longsum);
		
		//4.summingDouble
				Double sumdouble=Stream.of(1,3,5,6,7,8,2)
		         .collect(Collectors.summingDouble((x)->x));
			   System.out.println(sumdouble);
		
		
		//average
			   
      //1.AveragingInt
			   
			  Double d= Stream.of(1,3,5,6,7,8,2)   
		     .collect(Collectors.averagingInt((x)->x));
			  System.out.println(d);
		//2.AverageDouble
			   Double d1=Stream.of(70,51,63,78,89)
			  .collect(Collectors.averagingDouble((x)->x));
		       System.out.println(d1);
		
		//3.AverageDouble       
		       Double d2=Stream.of(1,3,5,6,7,8,2)
		       .collect(Collectors.averagingLong((x)->x));
		       System.out.println(d2);
		       
		//sum :avg,count,max.min       
		     IntSummaryStatistics sum= Stream.of(1,3,5,6,7,8,2)
		       .collect(Collectors.summarizingInt((x)->x));
		       System.out.println(sum);
		       
		
		  //MinBy
		       
		       Optional<Integer> op=Stream.of(1,3,5,6,7,8,2)
		       .collect(Collectors.minBy((a,b)->a-b));
		       System.out.println(op);
		 //MaxBy
		       Optional<Integer> op1=Stream.of(1,3,5,6,7,8,2)
				       .collect(Collectors.maxBy((x,y)->x-y));
				       System.out.println(op1);
		       
		  //Reducing
				       //1.reducing:add all given value
		  Optional<Integer> op2=Stream.of(1,3,5,6,7,8,2)
	        .collect(Collectors.reducing((x,y)->x+y));
			System.out.println(op2);
				       
	//2.reducing(identity)
			
//			Optional<Integer> op3=Stream.of(1,3,5,6,7,8,2)
//				.collect(Collectors.reducing(0,(a,b)->a+b));
//				       System.out.println(op3);
				       
	//3.reducing(identity,binaryoperator)
	
				  Stream.of("AAB","PS","ER","L");
				  
				       
		       
		       
	}

}
