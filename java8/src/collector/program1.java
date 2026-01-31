package collector;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collector;

public class program1 
{ 
	public static void main(String[] args) 
	{
		
				 
		ArrayList<Integer>list=new ArrayList<>(List.of(1,4,5,6,7,2,8,9));
		
		
		Collector<Integer, ArrayList<Integer>, Integer> c1 =
                Collector.of(
                		     //container
                        ()-> new ArrayList<Integer>(),

                        // accumulator
                        (arr,element)->
                        {
                            if(arr.size() == 0)
                                arr.add(element);
                            int sum = arr.get(0) + element;
                            arr.set(0 , sum);
                            },

                        
                        //combiner
                        (arr1 , arr2) ->
                        {
                            
                            int sum = arr1.get(0) + arr2.get(0);
                            arr1.set(0, sum);
                            return arr1;
                        },
                        
                        //finisher
                        (arr) -> arr.get(0)
                );

		
		Integer sumof=list.stream()
		 .collect(c1);
		System.out.println(sumof);//43
		
		
		
		
		Map<String,String>map=new HashMap<>(Map.of());
		map.put("A", "B");
		map.put("D", "A");
		map.put("D", "B");
		
		Set<Entry<String,String>> obj =map.entrySet();
		
		
		Collector<String, HashMap<String,Integer> , String>c2=Collector.of
				( ()->new HashMap<String,Integer>(),
				
						//combiner
						(arr,element)->
				           {
				        	    if(arr.put(element, 1) !=null) 
				        	    
				        	    	arr.put(element, arr.get(element)+1);
				        	   
				        	  
				        	    },
				         
				           (m1,m2)->
				           {
				        	      
				           }, 
				           
				//(x)->x.get(x.get());
				           null);
		
		
		
		obj.stream() 
		.collect(c2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
