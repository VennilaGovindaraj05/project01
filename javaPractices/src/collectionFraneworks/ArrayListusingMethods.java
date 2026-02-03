package collectionFraneworks;

import java.util.ArrayList;




public class ArrayListusingMethods 
{
	
	//arraylist using method with arguments
	

		public static void sorting(ArrayList<Integer>arr1)
		{
			
			for(int i=0;i<=arr1.size();i++)
			{
				for(int j=i+1;j<arr1.size();j++)
				{
					if(arr1.get(i)>arr1.get(j))
					{
						int temp=arr1.get(i);
						arr1.set(i, arr1.get(j));
						arr1.set(j, temp);
						
						
					}
					
				}
			}	
		}
		
		//arraylist using return types
		
		public static  ArrayList<Integer> method2( ArrayList<Integer> arr2 )
		{
			int x=5;
			int y=2;
			int res=x+y;
			System.out.println(res);
			return arr2;
		}
		
       public static void method3(ArrayList<? extends Number> arr3)
       {
		   arr3.removeFirst();
		 System.out.println(arr3);
    	   
       }



	public static void main(String[] args) 
	{
		ArrayList<Integer>arr=new ArrayList<>();
		arr.add(15);
		arr.add(25);
		arr.add(3);
		arr.add(9);
		arr.add(1);
		arr.add(2);
		arr.add(5);
		
		//arugement passing method
		System.out.println("Before swap :" +arr);
		sorting(arr);
		System.out.println("After swap :" +arr);
		
		//return type method callinf
		method2(arr);
		
		//using <?>generic removefirst number
	    method3(arr);

	}

}
