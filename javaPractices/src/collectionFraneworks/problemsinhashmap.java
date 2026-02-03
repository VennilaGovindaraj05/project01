package collectionFraneworks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class problemsinhashmap {

	public static void main(String[] args) 
	{
		
		//frequqntly adding values 
		
		ArrayList<Integer>list=new ArrayList<>();
		list.add(1);
		list.add(31);
		list.add(7);
		list.add(2);
		list.add(1);
		list.add(7);
		list.add(8);
		
		/*
		 1 - first 0+1 =1; 
		 31 -first 0+1=1;
		 7 -first 0+1=1;
		 2 -first time 0+1=1;
		 1 -second time (so in hashmap key was stored only unqiue values 1 already exist so it was override it will second time shown so 2 was 2 time is there 
		7-second time (2)
	       8- 0+1=1
		
		
		final output  (output was comes in insertion order  )
		1-2 
		31-1
		7-2
		2-1
		8-1
		 */
		
		HashMap<Integer,Integer>obj=new HashMap<>();
		
		for(Integer i:list)
		{
			obj.put(i, obj.getOrDefault(i, 0)+1);
		}
		
		
		for(Map.Entry<Integer,Integer> val :obj.entrySet())
		
		{
		 
			System.out.println(val.getKey()+ " - "+val.getValue());
		
		}

	
	
//	String s="hello java programming";
		
		
       String s="hello java programming";
       String[]s1=s.split("");
		
		
		
		HashMap<String,Integer> lhm=new HashMap<>();
		
		for(String  i :s1)
		{
		 lhm.put(i, lhm.getOrDefault(i, 0)+1);
		 
		}
	
		for(Map.Entry<String, Integer> arr :lhm.entrySet())
		{
			System.out.println(arr.getKey()+ " - "+arr.getValue());
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
