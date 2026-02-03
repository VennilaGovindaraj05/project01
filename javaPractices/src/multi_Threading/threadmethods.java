package multi_Threading;


 //isAlive 
/*class multi implements Runnable
{
	
	public void run()
	{
     for(int i=1;i<=10;i++)
	{
		System.out.println(Thread.currentThread().getName()+"--"+Thread.currentThread().isAlive());
	}
	
	}
}*/

//sleep()
class multi01 implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			Thread.yield();
			System.out.println(i);
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}


//priority

class multi03 implements Runnable
{

	@Override
	public void run()
	{
		for(int a=1;a<=10;a++)
        {
		 System.out.println(a);
		 System.out.println(Thread.currentThread().getName());
        }	
		
	}
	
}


public class threadmethods
{

	public static void main(String[] args) 
	{
		
		//multi m1=new multi();//isalive
		
		multi01 m2=new multi01(); //sleep
		
		multi03 m3 =new multi03();
		
		Thread thread1=new Thread(m2);
		Thread thread2=new Thread(m3);
		
		thread1.setPriority(Thread.MAX_PRIORITY);//10
		thread1.start();
		thread2.start();
	         
		
		
        /* for(int j=1;j<=5;j++)
         {
		 System.out.println(Thread.currentThread().getName()+"--"+thread.isAlive());
         }*/
	     
	     System.out.println(thread1.getState());
	     System.out.println(thread2.getState());
	
	      
	
	
	
	
	
	
	
	
	
	
	}

}
