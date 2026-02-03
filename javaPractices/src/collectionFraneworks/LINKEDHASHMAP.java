package collectionFraneworks;

import java.util.LinkedHashMap;

public class LINKEDHASHMAP
{

	public static void main(String[] args) 
	{
		LinkedHashMap<String,String> obj=new LinkedHashMap<>(16,0.75f,true);
		
//		obj.put("bread", 50);+
//		obj.put("chocolate", 75);
//		obj.put("jam", 25);
//		obj.put("apple", 150);
//		obj.put("brownie", 100);
//		obj.put("cake", 200);
//		
//		System.out.println("bread".hashCode()); // hashcode 94001400 ->same index -8
//		System.out.println("chocolate".hashCode());//12
//		System.out.println("jam".hashCode());//6
//		System.out.println("apple".hashCode());//10
//		System.out.println("brownie".hashCode());//2
//		System.out.println("cake".hashCode());//hashcode 3045944-->same index -8
		
		
		obj.put("Aa", "name1");
		obj.put("AB", "name2");
		obj.put("AC", "name3");
		obj.put("Ad", "name4");
		obj.put("AZ", "name5");
		
		
		obj.get("Ad"); //using acces ad was go to tail so we can acces frequantly
		System.out.println(obj);


	
	
	
	
	}

}
