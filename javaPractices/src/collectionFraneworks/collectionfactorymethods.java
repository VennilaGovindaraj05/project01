package collectionFraneworks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class collectionfactorymethods
{

	public static void main(String[] args) 
	{
		//using like this we cannot change or modify because of mrthod is IMMUTABLE
	   List<Integer> list  =  List.of(1,2,3,4,7,9,10,45); 
	    
	  // list.add(123);
	   //list.remove(4);
	   LinkedList<Integer>ll=new LinkedList<>(list);
	  ll.add(1234);	
	   ll.isEmpty();
	   System.out.println(ll);
	   
	   //asList ->it was mutable sizze was fixed
	   
	   List<Integer> lis= Arrays.asList(1,2,3,56,7,8,99,100);
	   lis.set(0, 200);
	   
	   System.out.println(lis);
	  
	   ArrayList<Integer>arl=new ArrayList<>(lis);
	   arl.add(450);
	   System.out.println(arl);

	
	   //set litral way set.of(); -> immutable cannot change or modify
 	   Set<Integer> set =Set.of(7,9,10,3,4,5);
 	   //set.add(45);
 	   //System.out.println(set);
	   HashSet<Integer>hs=new HashSet<>(set);
	   hs.add(350);
	   System.out.println(hs);
	
	   Map<String,String>map=Map.of("A", "name-1", "A","name-2", "C", "name-3", "D","name-4");
	   System.out.println(map);
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
