package collectionFraneworks;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class arraydequeueinQueue 
{
	
	//arraydequqe maintain insertion oreder
	

	public static void main(String[] args) 
	{
		
		ArrayList<Integer>ae=new ArrayList<>();
		Deque<Integer>arr=new LinkedList<Integer>(ae);
		
		arr.add(100);
		arr.add(101);
		arr.add(102);
		arr.add(103);
		arr.add(104);
		
		System.out.println("converting linkedlist in arraydeque"  +   arr);
		
		
		Deque<Integer>dq=new ArrayDeque<Integer>();//upcasting
		dq.add(1);
		dq.add(3);
		dq.add(7);
		dq.add(9);
		dq.add(2);
		System.out.println( "converted values are added!!.."   +   dq);
		
		dq.addFirst(200);
		dq.addLast(300);
		System.out.println(  "addfirst elements in array and lasst elements in arrayy"   +  dq);
		
		
		
		dq.contains(arr);
		System.out.println(dq);
		
		
	
		
	}

}
