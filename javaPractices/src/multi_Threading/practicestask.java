package multi_Threading;

class Note1 implements Runnable
{
	@Override
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("one");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
	}
}

class Note2 implements Runnable
{
	@Override
	public void run()
	{
		for(int i=1;i<=10;i++)
			
		{ 
			
			System.out.println("two");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			
		}
	}
}


class Note3 implements Runnable
{
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
			
		{ 
			System.out.println(Thread.currentThread().getName());
		
		}
	}
}




public class practicestask 
{

	public static void main(String[] args)throws InterruptedException
	
	{
		Note1 n1=new Note1();//one
		Note2 n2=new Note2();//two
		
		Thread thread1=new Thread(n1);
		Thread thread2=new Thread(n2);
		
		
		
		
		thread1.start();
		thread1.join();
		thread2.start();
		thread2.join();
		
		Note3 n3=new Note3();//thread2
		Thread thread3=new Thread(n3);
		thread3.start();
		thread3.join();
		
		System.out.println(Thread.currentThread().getName());//main
		
		 
		
	
		
		
	}

}
