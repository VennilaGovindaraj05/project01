package Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class iterartorr {

	public static void main(String[] args) 
	{
//		ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(12,16,19,11,15,13,19));
//		
//		System.out.println(arr);
//		
//		Iterator<Integer> it=arr.iterator();		
//		
//		System.out.println(it.hasNext());//if their any elements cursor after if their menas return boolean	//op-> true	
//		System.out.println(it.next());//it return cursor after element//op->12
//		
//		System.out.println(it.hasNext());//true
//		System.out.println(it.next());//16
//		
//		System.out.println(it.hasNext());//true
//		System.out.println(it.next());//19
//		
//		System.out.println(it.hasNext());//true
//		System.out.println(it.next());//11
//		
//		System.out.println(it.hasNext());//true
//		System.out.println(it.next());///15
//		
//		System.out.println(it.hasNext());//true
//		System.out.println(it.next());//13
//		
//		System.out.println(it.hasNext());//true
//		System.out.println(it.next());//19
//		
//		System.out.println(it.hasNext());//false
//		//System.out.println(it.next());
//		
		
		System.out.println(" using loop ");
		System.out.println("iterator methods like  hasNext() , next() , remove()");
		ArrayList<Integer>ar=new ArrayList<>(Arrays.asList(12,16,19,11,15,13,19));
		
		
		Iterator<Integer> i=ar.iterator();
		
	
//		System.out.println(ar);
//	
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//			i.remove();
//		}
		
		
	System.out.println(ar);	
	while(i.hasNext())
	{
		//particular numbers only remove 
		Integer x=i.next();
		
		if(x == 12)
		{
			i.remove();
		}
	}
		
	System.out.println(ar);	
		
		
		
		
		
		
		
		
		
		
	}

}
