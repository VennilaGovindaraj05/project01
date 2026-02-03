package enumaration;

import java.util.Collection;
import java.util.EnumMap;
import java.util.Map.Entry;
import java.util.Set;



enum DayofWeek
{
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY;
	
}



public class enummap
{
	public static void main(String[] args)
	{
		EnumMap<DayofWeek,String>em=new EnumMap<>(DayofWeek.class);
		em.put(DayofWeek.FRIDAY, "Degree'30.C");
		em.put(DayofWeek.WEDNESDAY, "Degree 60'C");
		em.put(DayofWeek.MONDAY, "Degree 120'C");
		em.put(DayofWeek.TUESDAY, "Degree 170'C");
		em.put(DayofWeek.SUNDAY, "Degree 100'C");
		em.put(DayofWeek.SATURDAY, "Degree 10'C");
		em.put(DayofWeek.THURSDAY, "Degree 500'C");
		
		System.out.println(em);
		
		System.out.println(em.containsKey(DayofWeek.MONDAY));//true
		System.out.println(em.containsValue("Degree 10'C"));//true
		System.out.println(em.get(DayofWeek.TUESDAY));//it get the values
		System.out.println(em.remove(DayofWeek.WEDNESDAY));//remove wednesday
		System.out.println(em);
		
		System.out.println(em.size());//total size print 6
	               
//		Set<Entry<DayofWeek,String>> ent =em.entrySet();
//	    System.out.println(ent);
		
		System.out.println(em.entrySet());
	    
	    System.out.println(em.keySet());
   
//	    Collection<String> val= em.values();
//	    System.out.println(val);

         System.out.println(em.values());
	    
	    
	    
	    
	}

}
