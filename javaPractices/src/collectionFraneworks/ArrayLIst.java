package collectionFraneworks;

import java.util.ArrayList;
import java.util.Arrays;

//List -> ArrayList

public class ArrayLIst {

	public static void main(String[] args) 
	{
        
		ArrayList<Integer>arr=new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		System.out.println(arr);
        System.out.println(arr.size());//its given array size
        System.out.println(arr.isEmpty());//its return t or f array have or not
        System.out.println(arr.contains(9)); //its return t or f based we given value in array
	  
        //object type array convert arraylist ->array(object)
        
        Object[]arr1=arr.toArray();
        System.out.println(Arrays.toString(arr1));//object array
        
        
         Integer[] inarr =new Integer[arr.size()];
         arr.toArray(inarr);
	     System.out.println(Arrays.toString(inarr));//integer array
	   
	     arr.addAll(arr);
	   
	  // ArrayList<Integer>arr1=new ArrayList<>();
	  
	
        
	
	
	}

	
}
