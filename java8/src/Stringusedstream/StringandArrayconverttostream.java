package Stringusedstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StringandArrayconverttostream 
{
	public static void main(String[] args)
	{
		
		String s="hello";
		s.chars().boxed().forEach(System.out::println);//given unicode
		
		//mapToObj
		
		s.chars().mapToObj(x->(char)x).forEach(System.out::println);
		
		//problems
		
		//split the words
		String s1="this is java program";
		String[] sarr=s1.split(" ");
		Arrays.stream(sarr).forEach(System.out::println);
		
		//vowel only print
		System.out.println("program 2:vowels only print");
		Predicate<Character>f1=(c)->c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
		Predicate<Character>f2=(c)->c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
	
		String v="this is a java projects";
		v.chars().mapToObj(x->(char)x)
		.filter(f1.or(f2)).forEach(System.out::println);
		
		//string used flatmap
		
		String[]st= {"one","two","three","four"};
		System.out.println(Arrays.toString(st));
		Arrays.stream(st).flatMap(x->Arrays.stream(x.split(" ")))
		.forEach(System.out::println);
		
		
		
		
		
		// stream using array
		
		int[]arr= {1,5,7,9,2};
		 Arrays.stream(arr).boxed().sorted((a,b)->b-a).forEach(System.out::println);
		
		 
		 
		 Integer[]arrr= {4,9,8,2,1,5,2};
		 Arrays.stream(arr).sorted().forEach(System.out::println);
	
		 
		 
		 //ArrayList
		 ArrayList<Integer>arr1=new ArrayList<>(List.of(1,2,3,4,5));
		 ArrayList<Integer>arr2=new ArrayList<>(List.of(6,7,8,9,10));
		 
		 ArrayList<ArrayList<Integer>>arr3=new ArrayList<>();
		 
		 arr3.add(arr1);
		 arr3.add(arr2);
		 System.out.println(arr3);
		 
		 //used nestedloop
		 
		 for(int i=0;i<arr3.size();i++)
		 {
			 ArrayList<Integer> a=arr3.get(i);
			 
			 for(int j=0;j<a.size();j++)
			 {
				 
				 
				 //System.out.println(j.get(i));
			 } 
		 }
		 
		 
		 //used stream
		 
		 arr3.stream().flatMap(x->x.stream())
		 .forEach(System.out::println);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
