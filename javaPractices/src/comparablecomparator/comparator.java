package comparablecomparator;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;

class Program implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) 
	{
		
		if(o1 < o2)
		{
			return -1;
		}
		else if(o1 > o2 )
		{
			return 1;
			
		}
		return 0;
	}
	
}


public class comparator {

	public static void main(String[] args) 
	{
		Program customcomparator=new Program();
		
		TreeSet<Integer> ts=new TreeSet<>(customcomparator);
		ts.add(4);
		ts.add(8);
		ts.add(2);
		ts.add(9);
		ts.add(1);
		ts.add(5);
		System.out.println(ts);
		
		
		
		PriorityQueue<Integer> pq=new PriorityQueue<>(customcomparator);
		pq.add(11);
		pq.add(18);
		pq.add(12);
		pq.add(19);
		pq.add(21);	
		System.out.println(pq);
		System.out.println(pq.poll());

	}

}
