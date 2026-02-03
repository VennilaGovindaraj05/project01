package synchronaizationThred;

/*types of synchronization
1.synchronized non static method
2.synchronized static method
3.synchronized bloc

public void add()
{

synchronized(this)-> in (this)->call current class object we used res ->this because it call sop(line);
{
}
}
*/

//example program for non static synchronized 
class NonStaticRes 
{
	public  void printTables(int x)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(x+"x"+i+"="+(i*x));
		}
	}
}

 class th01 implements Runnable
{
   NonStaticRes res;

   th01(NonStaticRes res)
   {
	   this.res=res;
   }
	@Override
	public void run()
	{
	res.printTables(4);
	}
	
}


 class th02 implements Runnable
 {
    NonStaticRes res;

    th02(NonStaticRes res)
    {
 	   this.res=res;
    }
 	@Override
 	public void run()
 	{
 	res.printTables(8);
 	}
 	
 }

 
 //satic synchronized-> used static keyword in method

class Staticsynch
{
	public static synchronized void printTables()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("vankam" +Thread.currentThread().getName());
		}
	}
}

class th03 implements Runnable
{
	@Override
	public void run()
	{
		Staticsynch.printTables();
	}
	
}

//synchronized block

class  SynchrBlock
{
	public  void add() 
	{
		synchronized (this)
		{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		System.out.println("hello 1" + Thread.currentThread().getName());
		System.out.println("hello 2" + Thread.currentThread().getName());
		}
		System.out.println("hello 3" + Thread.currentThread().getName());
		System.out.println("hello 4" + Thread.currentThread().getName());
		System.out.println("hello 5" + Thread.currentThread().getName());  
		
	}
}
	
class th04 implements Runnable
		{
			SynchrBlock res3;
			th04 (SynchrBlock res3)
			{
				this.res3=res3;
			}
			
			@Override
			public void run()
			{
			res3.add();
			}
			
		}
	
	
	











public class program2 
{

	public static void main(String[] args)throws InterruptedException 
	{
		
		NonStaticRes res=new NonStaticRes();
		th01 th1=new th01(res);
		th02 th2=new th02(res);
		Thread thread1=new Thread(th1);
		Thread thread2=new Thread(th2);
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		
		//static synchronized
		Staticsynch res2=new Staticsynch();
		th03 th3=new th03();
		Thread thread3=new Thread(th3);
		thread3.start();
	    thread3.join();
		
		//synchronized block
		SynchrBlock res3=new SynchrBlock();
		th04 th4=new th04(res3);
		Thread thread4=new Thread(th4);
		
		thread4.start();
		thread4.join();
		
		
		
		
		
		
		
		
		
		
	}

}
