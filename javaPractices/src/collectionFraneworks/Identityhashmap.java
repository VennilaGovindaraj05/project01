package collectionFraneworks;

import java.util.IdentityHashMap;

public class Identityhashmap 
{
  public static void main(String[] args)
 {
	IdentityHashMap<String,String>ihm=new IdentityHashMap<>();
	
	  String  s="hello";
	  String s1=new String("hello");
	  
	  ihm.put(s, null);
	  ihm.put(s1, null);
	  
	  System.out.println(s.hashCode());
	  System.out.println(s1.hashCode());
	  
	  System.out.println(System.identityHashCode(s));
	  System.out.println(System.identityHashCode(s1));

	  
	  System.out.println(ihm);
	  
	  String v="world";
	  String v1="world";
	  ihm.put(v, null);
	  ihm.put(v1, null);
	  
	  System.out.println(v.hashCode());
	  System.out.println(v1.hashCode());
	
	  System.out.println(System.identityHashCode(v));
	  System.out.println(System.identityHashCode(v1));

	  System.out.println(ihm);
	  
	 
//	

	  
}
}
