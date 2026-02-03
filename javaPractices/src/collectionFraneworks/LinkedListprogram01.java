package collectionFraneworks;

import java.util.LinkedList;


public class LinkedListprogram01 
{

	public static void main(String[] args) 
	{
		LinkedList<Integer> obj = new LinkedList<>();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		
		obj.addFirst(67);
		obj.addLast(89);
		
		obj.remove(2);
		obj.remove(4);
		System.out.println(obj);

	}

}
