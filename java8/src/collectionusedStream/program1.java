package collectionusedStream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class program1 
{
         public static void main(String[] args)
         {
           //map dosen't have stream 
        	    //so convert set and used stream.
        	    HashMap<Integer,Integer>hm=new HashMap<>();
        	    hm.put(2, null);
        	    hm.put(5, null);
        	    hm.put(10, null);
        	    hm.put(1, null);
            
        	    Set<Integer>s=hm.keySet();
        	    s.stream().forEach(System.out::println);
        	     
        	    //insertion based worked
        	    LinkedHashMap<String,Integer>lh=new LinkedHashMap<>();
        	    lh.put("harry", null);
        	    lh.put("dora", null);
        	    lh.put("bheem", null);
        	    lh.put("ninja", null);
        	    lh.put("mottu", null);
        	    
        	    HashSet<String>hs=new HashSet<>(lh);
        	    
        	    
        	   // Set<String> se=lh.keySet();
        	    //using sorted ->sorted the value
        	    //se.stream().sorted().forEach(System.out::println);        	    
        	    
        	    //word natural ordered
        	    PriorityQueue<String>pq=new PriorityQueue<>();
        	    pq.add("hello");
        	    pq.add("world");
        	    pq.add("core");//this one skiped
        	    pq.add("java");
        	   
        	    pq.stream().skip(1).forEach(System.out::println);
        	    
        	    
        	    //using set
        	    
        	    Set<Character>set=new TreeSet<>(Set.of('c','g','l','f','a'));        	    
        	    set.stream().forEach(System.out::println);//a,c,f,g,l
        	    
        	    TreeMap<Integer,String>tm=new TreeMap<>();
        	    TreeSet<Integer>arr=new TreeSet<>(tm);
        	    tm.put(1, null);
        	    tm.put(4, null);
        	    tm.put(7, null);
        	    tm.put(8, null);
        	    
			
		}
}
