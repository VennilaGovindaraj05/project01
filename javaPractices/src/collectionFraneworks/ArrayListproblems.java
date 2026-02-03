package collectionFraneworks;

import java.util.ArrayList;
import java.util.List;


/*1.Findout given arrayList is sorted or not?
2.Sort the given arrayList.
3.Findout secound minimun and maximum.
4.reverse the Given ArrayList use swapping don't use new ArrayList
5.move all the zeros into left side
6.move all the zeros into right side
7.move all the negative numbers into right side
8.remove Duplicates from ArrayList and print only unique elements
9.print the duplicate values
10.find the missing number
11.Findout given ArrayList is palindrome or not ?*/










public class ArrayListproblems
{
	
	

	//1.
	
	public static  boolean  sortedornot(ArrayList<Integer>arr1)
	{
		boolean res=true;
		
		for(int i=0;i<=arr1.size();i++)
		{
			for(int j=i+1;j<=arr1.size();j++)
			{
				if(arr1.get(i) < arr1.get(j))
				{	
					System.out.println("the given value was un sorted ");
					return true;
				} 
			   else
			   {
					System.out.println("the given number was  sorted");
				return false;
			   }
			
			}
			
		}
		
		
		return res;
	}
	
	
	//2.sorted
	

	public static void sorting(ArrayList<Integer>arr1)
	{
		
		for(int i=0;i<=arr1.size();i++)
		{
			for(int j=i+1;j<arr1.size();j++)
			{
				if(arr1.get(i)>arr1.get(j))//
				{
					int temp=arr1.get(i);
					arr1.set(i, arr1.get(j));
					arr1.set(j, temp);
					
					
				}
				
			}
		}	
	}
	
	//3.find 2min and max
	
	public static void findsecMinmax(ArrayList<Integer>arr2)
	{
		
		Integer  Firstmax=0;
        Integer secondMax=0;
        Integer Firstmin=50;
        Integer secondmin=50;
		
		for(int i=0;i<arr2.size();i++)
		{
			//max value find
			if(Firstmax<arr2.get(i))
			{
				secondMax=Firstmax;
				Firstmax=arr2.get(i);
			}
			if(arr2.get(i)!=Firstmax && arr2.get(i) >Firstmax)
			{
				secondMax=arr2.get(i);
			}
			
			//min value find
             
			if(Firstmin > arr2.get(i))
			{
				secondmin=Firstmin;
				Firstmin=arr2.get(i);
			}
			
			if(arr2.get(i) > Firstmin && arr2.get(i)<secondmin )
			{
				secondmin=arr2.get(i);
			}
			
		}
		//System.out.println(" find  first max values:" +Firstmax);
		System.out.println(" find  second max values:" +secondMax);
		//System.out.println(" find  first min values:" +Firstmin);
		System.out.println(" find  second min values:" +secondmin);
		

	}
	
	//4,reverse
	
	public static void reverse(ArrayList<Integer>arr3)
	{
		int derce=arr3.size()-1;																			
		
		  
		for(int i=0;i<arr3.size()/2;i++)
		{
			int temp=arr3.get(derce);
			arr3.set(derce, arr3.get(i));
			arr3.set(i,temp);
			derce--;
		}
		System.out.println("program 4. reverse values:" +arr3);
		
		
	}
	
	//5.move all zero into left
	public static void moveleftzero(ArrayList<Integer>arr4)
	{
		int zeros=0;
	  
		for(int i=0;i<arr4.size();i++)//1,4,0,7,0,5,0
		{
			if(arr4.get(i)==0)//0==0//7==0//0==0
			{
			int temp=arr4.get(i);//0//0
			arr4.set(i, arr4.get(zeros));//0
			arr4.set(zeros, temp);//0
			zeros++;
			
			}
		}
		System.out.println("program 5. moves zeros to left values:" +arr4);	
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args)
	{
		ArrayList<Integer>arr=new ArrayList<>();
		arr.add(1);
		arr.add(5);
		arr.add(8);
		arr.add(4);
		arr.add(2);
		arr.add(6);
		
		
		ArrayList<Integer>arr1=new ArrayList<>();
		arr1.add(1);
		arr1.add(4);
		arr1.add(0);
		arr1.add(7);
		arr1.add(0);
		arr1.add(5);
		arr1.add(0);
		//1.
		
	
		System.out.println("program 1."+arr);
		Boolean result=sortedornot(arr);
		System.out.println(result);
		System.out.println(arr);
//
//		//2.
		System.out.println("program 2");
		System.out.println("before given was sorted "+arr);
	    sorting(arr);
	    System.out.println("after given was sorted "+arr);
	    
	    //3.find sec min and max
	    
	    findsecMinmax(arr);
	    System.out.println(arr);
		
	    //4,reverse
		reverse(arr);

	    //5.move left side zero
		 moveleftzero(arr1);
		
		 
		 
		 //user define
		 
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	}

}
