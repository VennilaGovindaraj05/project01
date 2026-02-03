package collectionFraneworks;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class qqueue 
{

	public static void main(String[] args) 
	{
		//convert arraylist to priorityqueue using parameter constructor.
		
	    ArrayList<Integer>arr=new ArrayList<Integer>();
       Queue<Integer> q=new PriorityQueue<Integer>(arr);//default capacity -1
       q.add(24);
       q.add(2);
       q.add(9);
       q.add(8);
       q.add(1);
       q.add(3);
       q.add(15);
       q.offer(56); //add element
  
      System.out.println(q);
     q.poll();//it remove head 1 was removed
     
     
     
       System.out.println(q);
      q.remove();//it remove 2 
      
       //q.element(); 
       // q.peek();
       
       System.out.println(q);
       
       Queue<Character> q1=new PriorityQueue<Character>();
       //oder change by ascii values. 	/89m
       q1.add('G');
       q1.add('S');
       q1.add('E');
       q1.add('B');
       q1.add('Y');
       q1.add('A');
       q1.add('C');
       System.out.println(q1); 
       

	}

}
