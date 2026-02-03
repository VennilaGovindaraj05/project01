package collectionFraneworks;

import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) 
	{
		
		TreeMap<Integer,Integer>obj=new TreeMap<>();
		obj.put(1, null);
		obj.put(8, null);
		obj.put(7,null);
		obj.put(3, null);
		obj.put(10, null);
		obj.put(2, null);
		obj.put(9,null );
		obj.put(5,null );
		
		 System.out.println(obj);
      System.out.println(obj.get(1));	

	}

}
