package collectionFraneworks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class stackinlist
{

	public static void main(String[] args)
	{
	//	System.out.println(" STACK ");
		
		//ArrayList<Float>arr=new ArrayList<Float>();
		//LinkedList<Float>arr=new LinkedList<Float>(); ->cant suuport
		//Vector<Integer>arr=new Vector<Integer>();
		
		
		Stack<Integer>st=new Stack<Integer>();
		
		st.push(1);
		st.add(2);
		st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st +"add the values in stack");
        
        
        System.out.println(st+"remove last position in stack used pop"); 
        System.out.println(st.pop()); 
       
        
        System.out.println(st +"get last posiion in stack used peek"); 
        System.out.println(st.peek());
        
        System.out.println(st.empty());//it return stack was fullor not it will return true or false
        System.out.println(st);
        
       System.out.println(st.search(4));
       System.out.println(st);
	}

}
