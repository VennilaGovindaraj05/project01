package collectionFraneworks;

//vector(list);

import java.util.Vector;

public class type3inlist 
{

	public static void main(String[] args)
	{
 		Vector<Integer> arr=new Vector<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(8);
		arr.add(9);
		System.out.println(arr.capacity());//default value was 10
		arr.add(10);
		arr.add(11);
		 System.out.println(arr);
//		arr.ensureCapacity(50);
//		System.out.println(arr);
//		
//	 
		System.out.println(arr.capacity());//10*2=20 now it was 20capcity
//		 arr.trimToSize();//it was trim the size 
		
 //      arr.addElement(23);//23 was add in tha array
       System.out.println(arr);
//       arr.addFirst(1);
//       System.out.println(arr);//add one elements in 1st index 1
//       arr.addLast(9);
//       System.out.println(arr);//add one elements in last index 1
//       
//       arr.removeElementAt(5);
//       System.out.println(arr);
       
//       arr.removeAllElements();
//       System.out.println(arr);//it remove all elemts
       
//      System.out.println( arr.removeLast());   // it get last elements
//      System.out.println(arr);
//     
//      System.out.println(arr.removeFirst());//it will remove first index value
//      System.out.println(arr);
//       
//       
//       
//      
//     arr.setElementAt(100, 7);//it set 100 to the 7th index
//     System.out.println(arr);
//     

      
      
      
      
      
      
	}

}
