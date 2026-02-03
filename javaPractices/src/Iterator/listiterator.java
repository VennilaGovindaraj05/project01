package Iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;



public class listiterator {

	public static void main(String[] args) 
	{
		LinkedList<Integer> li=new LinkedList<>(Arrays.asList(1,7,8,9,3,2,4,10));
		System.out.println(li);
         
		ListIterator<Integer>it=li.listIterator();
	   
		
		
//		System.out.println("print (forward directions)");
//	  while(it.hasNext())
//	  {
//		  System.out.println(it.next());  
//	  }
//	
//	
//	  
//	  System.out.println("print (backward directions)");
//	  while(it.hasPrevious())
//	  {
//		  System.out.println(it.previous());
//	  }
//	  
	  
//	  //add()
//	  while(it.hasNext())
//	  {
//		  Integer x=it.next();
//		 if(x==8)
//		 {
//		  it.add(34);
//	  }
//	  }
//	  System.out.println(li);
	  
	  //set()

//	  while(it.hasNext())
//	  {
//		  Integer x=it.next();
//		 if(x==8)
//		 {
//		  it.set(100);
//	  }
//	  }
//	  System.out.println(li);
	  
	  
	  //nextIndex()

	  
     
		
	  while(it.hasNext())
	  {
		 
		 System.out.println( it.nextIndex());
		 it.next();
	  
	  }
	  
	  
	
	}

}
