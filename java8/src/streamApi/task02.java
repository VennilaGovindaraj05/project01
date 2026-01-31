package streamApi;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;

public class task02 	{
	
	public static void main(String args[])
	{
		
//		//1.numbeers string to numbers
//		
		String[] arr = {"one","two","three","four","five","six","seven","eigth","nine","ten"};
	
		Function<String,Integer>f=new Function<>()
				{

					@Override
					public Integer apply(String t) 
					{
						switch(t)
						{
						case "one":
							return 1;
						
						case "two":
						return 2;
						
						case "three":
							return 3;
							
						case "four":
							return 4;
							
						case "five":
							return 5;
							
						case "six":
							return 6;
							
						case "seven":
							return 7;
						case "eigth":
							return 8;
						case "nine":
							return 9;
						case "ten":
							return 10;
						}
						return -1;
					}
			         
				};
		
	 Arrays.stream(arr)
		.map(f).forEach(System.out::println);
		
		 
		 
		 //another method used map
	 System.out.println("using map");
		Map<String,Integer>hm=Map.of("one",1,  "two",2, "three",3, "four",4, "five",5, "six",6,  "seven",7,"eigth",8, "nine",9, "ten",10);
		 Arrays.stream(arr)
		  .map(hm::get)
		  .forEach(System.out::println);
	 
		 System.out.println("using hashmap");
		 HashMap<String,Integer>m=new HashMap<>();
		 m.put("one", 1);
		 m.put("two", 2);
		 m.put("three", 3);
		 m.put("four", 4);
		 m.put("five", 5);
		 m.put("six", 6);
		 
         Set<String>s1= m.keySet();//key get
		 Collection<Integer>s= m.values();//values get
		 Set<Entry<String,Integer>>e=m.entrySet();
		 
		 Arrays.stream(arr);
		 s.stream()
		.forEach(System.out::println);
		 
		// Given a string sentence, find the longest word using streams.
		 
		 System.out.println("find longest word");
		 String st="java is a programming language";
		
		 String[] st1 =st.split(" ");
		 Arrays.stream(st1).sorted((a,b)->b.length()-a.length()).limit(1).forEach(System.out::println);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
