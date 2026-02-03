package Iterator;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;



public class concurrentmodificationexception
{
	
	public static void main(String[] args) 
	{
		
		ArrayList<Integer> ar=new ArrayList<>(Arrays.asList(1,4,5,7,9,2,6,10,2));
		
              //  Iterator<Integer> it=ar.iterator();
//		       
//                //using  arraylist references ar add elements in iterator it will throw concurrentmodificationexception
//                while(it.hasNext())
//                {
//                	System.out.println(it.next());
//                	ar.add(45);
//                }
//		
                
//                CopyOnWriteArrayList<Integer> co=new CopyOnWriteArrayList<>(ar);
//                
//               ListIterator<Integer> it=co.listIterator();
// 		       
//   
//                while(it.hasNext())
//                { 
//                	if(it.nextIndex() == 4)
//                	{
//                	
//                	co.add(1,45);
//               
//                	}       
//               
//                	 
//                }
//                System.out.println(co);   
//               
        		
                
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(1, "name1");
		hm.put(6, "name1");
		hm.put(4, "name1");
		hm.put(8, "name1");
		hm.put(2, "name1");
		
		for(Map.Entry<Integer, String> s :hm.entrySet())
		{
		     System.out.println(s);  
		    
		}
		
		
		ConcurrentHashMap<Integer,String> ch=new ConcurrentHashMap<>(hm);
		Iterator<Map.Entry<Integer, String>> ss=ch.entrySet().iterator();
		
		while(ss.hasNext())
		{
			ss.next();
			
		
			ch.put(3, "name2");
			
			
		}
		System.out.println(ch);
		
		
		Queue<Integer>q= new ArrayDeque<>(Arrays.asList(1,3,5,8,2,6,7));
		
		ConcurrentLinkedQueue<Integer> cq=new ConcurrentLinkedQueue<>(q);
		
		Iterator<Integer> i=cq.iterator();
	
		
		while(i.hasNext())
		{
			i.next();
	        cq.add(10);
		}
		
		System.out.println(cq);
		
		
		
		
		
		
		
            
	}

}
