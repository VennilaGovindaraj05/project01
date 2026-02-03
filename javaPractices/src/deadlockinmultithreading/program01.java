package deadlockinmultithreading;

class Resources1
{
	public synchronized void add(Resources2 r2)
	{
		System.out.println(Thread.currentThread().getName()+"  - Add method enters");
		r2.sub(this);
	}
}

class Resources2
{
	public synchronized void sub(Resources1 r1)
	{
		System.out.println(Thread.currentThread().getName()+"  -Sub method enters  ");	
	      r1.add(this);
	}
	
}

class Thread01 implements Runnable
{
	
	Resources1 r1;
    Resources2 r2;
	
	Thread01(Resources1 r1, Resources2 r2)
	{
		this.r1=r1;
		this.r2=r2;
	}

	@Override
	public void run() 
	{
		
		r1.add(r2);
		
	}
	
}


class Thread02 implements Runnable
{
	
	Resources2 r2;
	 Resources1 r1;
	
	Thread02(Resources2 r2, Resources1 r1)
	{
		this.r2=r2;
		this.r1=r1;
	}

	@Override
	public void run() 
	{
	    r2.sub(r1);	
	
	}
	
}





public class program01 {

	public static void main(String[] args) 
	{
		Resources1 r1=new Resources1();
		Resources2 r2=new Resources2();
		
		
		Thread01 t1=new Thread01(r1,r2);
		Thread02 t2=new Thread02(r2,r1);
		
		
		Thread thread1=new Thread(t1);
		Thread thread2=new Thread(t2);
		
		
		thread1.setName("Thread01");
		thread2.setName("Thread2");
		
		thread1.start();
		thread2.start();
		
		
		
		
		
      
	}

}
