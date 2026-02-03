package collectionFraneworks;

import java.util.ArrayList;
import java.util.Vector;

//vector use thread 



	
	class Thread01 implements Runnable
	{
		Vector<Integer> vecc;
		
		 Thread01(Vector<Integer>vecc)
		{
			this.vecc=vecc;
			
		}

		@Override
		public void run()
		{
	        
			for(int i=0;i<=5;i++)
			{
				System.out.println("one");
			}
		}
		
		
	}
	
	class Thread02 implements Runnable
	{
		Vector<Integer>vecc;
		
		 Thread02(Vector<Integer>vecc)
		{
			this.vecc=vecc;
			
		}

		@Override
		public void run()
		{
	        
			for(int i=0;i<=5;i++)
			{
				System.out.println("two");
			}
		}
		
		
	}
	
	class Thread03 implements Runnable
	{
  
		ArrayList<Integer> obj;
		Thread03(ArrayList<Integer> obj)
		{
			this.obj=obj;
			
		}
		
		
		@Override
		public void run() 
		{
			for(int i=0;i<=5;i++)
			{
				System.out.println("1");
			}
			
		}
		
		
	}
	
	class Thread04 implements Runnable
	{
  
		ArrayList<Integer> obj;
		Thread04(ArrayList<Integer> obj)
		{
			this.obj=obj;
			
		}
		
		
		@Override
		public void run() 
		{
			for(int i=0;i<=5;i++)
			{
				System.out.println("2");
			}
			
		}
		
		
	}
	
	class Thread05 implements Runnable
	{
		Vector<Integer>vec;
		
		 Thread05(Vector<Integer>vec)
		{
			this.vec=vec;
		}

		@Override
		public void run() 
		{
			for(int i=0;i<=5;i++)
			{
				System.out.println("java");
			}
		}
		
	}
	public class program1vect 
	{

	public static void main(String[] args) throws InterruptedException 
	{
		Vector<Integer> arr=new Vector<>();
		Thread01 ob1=new Thread01(arr);
		Thread02 ob2=new Thread02(arr);
		Thread thread1=new Thread(ob1);
		Thread thread2=new Thread(ob2);

		thread1.setName("Thread-01");
		thread2.setName("Thread-02");
		
		
		
		
		thread1.start();
	//	thread1.join();
		thread2.start();
	//	thread2.join();
		
	ArrayList<Integer> arr2=new ArrayList<>();
	Thread03 obj3=new Thread03(arr2);
	Thread04 obj4=new Thread04(arr2);
	
	Thread thread3=new Thread(obj3);
	Thread thread4=new Thread(obj4);
	thread3.start();
	thread4.start();
		
		
	
	Vector<Integer>vec=new Vector<>();
	Thread05 r=new Thread05(vec);
	Thread th=new Thread(r);
	
	th.start();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
