package collectionFraneworks;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Mapp {

	public static void main(String[] args) 
	{
		
		Map<String,String>obj=new HashMap<>();
		
	    obj.put("sun", "name1");
		obj.put("moon", "name2");
		obj.put("stars", "name3");
		System.out.println(obj);
//		obj.put("erath", "name4");
//		obj.put("earth", "name5");
//		obj.put("hello", "name6");
//		obj.put("world", "name7");
//		obj.put("java", "name8");
//		obj.put("program", "name9");
//		obj.put("collections", "name10");
//		obj.put("frame", "name11");
//		obj.put("works", "name12");
//		obj.put("datatypes", "name13");
		//threshold to 12 to noe increase 24 double size increase
//		System.out.println("FB".hashCode()%16);//114252 % 16-> 12index la store this value
		
		
		
		
		//hashcode collision
		
		obj.put("FB", "NAME1");
		obj.put("Ea", "name2");
		
		obj.put("apple", "name3");//93029210 
		obj.put("papa", "name4");//2480066
		
		obj.put("AbyZ", "name5");
		obj.put("AbZ]", "name6");
		
		obj.put("Siblings", "name7");
		obj.put("Teheran", "name8");
		
		System.out.println(obj);
	
		System.out.println("FB".hashCode());//2236
		
		System.out.println("hashcode for apple-papa");
		
		System.out.println("apple".hashCode());//93029210
		System.out.println("Papa".hashCode());//2480066
		
		System.out.println("hashcode for Abyz-Abz");
		
		System.out.println("Abyz".hashCode());//2034466
	    System.out.println("Abz".hashCode());//65625
		
	    System.out.println("hashcode for siblings-Teheran");
		
	    System.out.println("siblings".hashCode());//166965745
		System.out.println("Teheran".hashCode());//231609873
		
		
		//important methods in map
		//1.keyset(); -> it will show key values all
		
		for( String s  :obj.keySet())
		{
			System.out.println(s);
		}
		
		//2.values();-> it will show values 
		
		for(String s:obj.values())
		{
			System.out.println(s);
		}
		
		//3.entrySet 
		for(Entry<String, String> s :   obj.entrySet())
		{
			System.out.println(s);
		}
	
	   obj.getOrDefault("moon", null);
	
	
	
	}

}
		