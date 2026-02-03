package Daemonlock;

class SaveThread01 implements Runnable//daemon thread
{

	@Override
	public void run()
	{
		while(true)
		{
			
			/*try {
				Thread.sleep(600);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}*/
			System.out.println(Thread.currentThread().getName()+"  Typing is saved");
		  
		}
	}
	
}

class Spellingcheck implements Runnable
{

	@Override
	public void run() 
	{
		System.out.println(Thread.currentThread().getName()+"  spelling  is  checking");
		
	}
	
}

class userThread implements Runnable //user define
{

	@Override
	public void run() 
	{
		for(int i=1;i<=10;i++)
		{ 
			System.out.println("user define thread is typing ..");
			
		}
		
	}
	
}

public class program1 
{
  public static void main(String[] args) throws InterruptedException 
  {
	

	  
	  SaveThread01 obj=new  SaveThread01();
	  Thread thread1=new Thread(obj);
	  userThread obj1=new userThread ();
	  Thread thread2=new Thread(obj1);
	 
	  
	
	  thread1.setDaemon(true);
	  thread1.start();
	  thread2.start();
	  
	  
	  
	/*for(int i=1;i<=10;i++)
	{
		System.out.println("srimental is typing");
		Thread.sleep(400);
	}
	 System.out.println("end"); */
  
  
  
  
  
  
  
  
  
  }
}
