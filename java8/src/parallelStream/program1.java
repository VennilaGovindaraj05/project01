package parallelStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class program1 
{
        
	public static void main(String[] args) 
	{ 
		
		Map<Integer,String>map=new TreeMap<>(Map.of(1,"name1",2,"name2",3,"name3",4,"name4"));
	
		Set<Entry<Integer, String>> set =map.entrySet();
		
		long l=set.parallelStream()
		
		
		.count();
		System.out.println(map);
		System.out.println(l);

		
	set.stream()
	.map((x)->x.getKey())
	
	.parallel()
	  .limit(3)
	.forEach(System.out::println);
		
		
		
		List<String>list=new ArrayList<>(List.of("hello","java","world","core"));
		list.parallelStream()
		.map((x)->x.toUpperCase())
		
		//call the running thread name
		.forEach((x)->
		
				{
					System.out.println(x+"-"+Thread.currentThread().getName());
				});
		
		
	
		
		
	}
            	
	
	
	
	
	
	
	
	
	
	
	
}
