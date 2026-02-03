package collectionFraneworks;

import java.util.WeakHashMap;

public class Weakhashmap
{
   public static void main(String[] args)
   {
	   WeakHashMap<String,String> whm=new WeakHashMap<>();
	   
	   //non literal way
	   String s=new String("hello");
	   whm.put(s, null);
	   System.out.println(whm);
	   
	   s=null;
	   System.gc();//it will destroyed
	   System.out.println(whm);
	   
	   //literal way
	   String v="world";
	   String v1="world";
	   
	   whm.put(v, null);
	   System.out.println(whm);
	   
	   v=null;//we given null in vreference (jvm internally used reference )
	   System.gc();//(it will not destroyed) jvm also store one references so it will print entries
	   System.out.println(whm);
	   
	   
	   
 }
}
