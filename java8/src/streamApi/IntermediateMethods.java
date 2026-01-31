package streamApi;

import java.util.Comparator;
import java.util.stream.Stream;

public class IntermediateMethods
{
     public static void main(String[] args) 
     {
    	     //filer()
		 Stream<String>s1=Stream.of("helo","java","core");
		 Stream s2=s1.filter((x)->x.length()==4);//helo->helo.length==4//true
		 s2.forEach(System.out::println);
    	 
    	     Stream.of("cake","pizza","burger").filter((x)->x.length()==5).forEach(System.out::println);
    	  
    	     
    	     //map() ->change date type onto another type
    	     System.out.println("map() -> get string: return int");
         Stream.of("chocolate","momos","brownie").map((x)->x.length()).forEach(System.out::println);    	 
    	     
         //maptoInt
         System.out.println("maptoInt() -> get string: return only integer");
         Stream.of("vennila","srinithi","swetha").mapToInt((x)->x.length()).forEach(System.out::println);
    	  
         //maptoLong
         System.out.println("maptoLong() -> get string: return only long");
         Stream.of("vennilaa").mapToLong((x)->x.length()).forEach(System.out::println);
   	  
    	       //maptoDouble
         System.out.println("maptoDouble() -> get string: return only double");
         Stream.of("jansii").mapToDouble((x)->x.length()).forEach(System.out::println);
         
    	    //sorted
         System.out.println("sorted() ->sorted by natural order");
         Stream.of(10,3,8,5,1,2,6,7).sorted().forEach(System.out::println);
    	 
    	  //sorted(comparator)->natural change descending (user defined)
         
		   System.out.println("sorted(comparator object pass) ->sorted by descending order");
    	   Comparator<Integer>c=new Comparator<>()
    			   {

					@Override
					public int compare(Integer o1, Integer o2) 
					{
						if(o1<o2)
						{
						return 1;
						}
						else if(o1>o2)
						{
						return -1;
						}
						
						else
						{
							return 0;
						}
					}
    		   
    			   };
    	 

    		         Stream.of(10,1,8,5,1,2,2,7).sorted(c).forEach(System.out::println);
    	 
    	                //distinct
    		         
      			 System.out.println("distinct() ->remove dulpicate");
      			 Stream.of(10,1,8,5,1,2,2,7).distinct().forEach(System.out::println);
    	             
      			 
      			 //limit()
      			 System.out.println("limit() ->");
      			 Stream.of(10,1,8,5,1,2,2,7).limit(4).forEach(System.out::println);//first 4 values print another value didn't print
    	  
      			 //skip()
      			 System.out.println("skip() ->remove dulpicate");
      			 Stream.of(10,1,8,5,1,2,2,7).skip(3).forEach(System.out::println);//first 3value skip another print
    	 
    	 
	 }
}
