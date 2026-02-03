package Iterator;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class descendingiterator {

	public static void main(String[] args)
	{
		TreeSet<Integer> ts=new TreeSet<>();
	
		ts.add(9);
		ts.add(5);
		ts.add(3);
		ts.add(2);
		ts.add(1);
		ts.add(8);
		ts.add(7);
		
		
		
		//ascending oreder 
		System.out.println(ts);
		
	    Iterator<Integer> it = ts.descendingIterator();		

	    //descending order
	    while(it.hasNext())
	    {
	    	System.out.println(it.next());
	
	    }
	
	
	
	   TreeMap<Integer,String> tm=new TreeMap<>();
	   tm.put(2, "name-2");
	   tm.put(1, "name-1");
	   tm.put(4, "name-4");
	   tm.put(8, "name-8");
	   tm.put(3,"name-3");
	
	   
	  Set<Integer> s= tm.keySet();
	  Iterator<Integer> i=s.iterator();
	
	  //key values only print like ascending order
	  while(i.hasNext())
	    {
	    	System.out.println(i.next());
	
	    }
	
	
	  //values only print 
	  Collection<String> v= tm.values();
	  Iterator<String> t= v.iterator();
	  while(t.hasNext())
	    {
	    	System.out.println(t.next());
	
	    }
	
	  
	  //both key-value are print using entryset()

	  Set<Map.Entry<Integer, String>> n  = tm.entrySet();
	  
	  Iterator<Map.Entry<Integer, String>>  o = n.iterator();
	  while(o.hasNext())
	  {
		  System.out.println(o.next());
	  }
	  
	  
	  
	  
	  
	  
	  
	}

}
