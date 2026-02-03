package multi_Threading;

class Reso
{
	public synchronized void numbers(String msg) throws InterruptedException
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+msg);
		   notify();
		   wait();
		
		}
		notify();
	}
}

class Th01 implements Runnable
{
	Reso reso;
    String msg;
    Th01 (Reso reso,String msg)
    {
    	this.reso=reso;
    	this.msg=msg;
    	
    }
	
	@Override
	public void run() 
	{
	 try {
		reso.numbers(msg);
	 } catch (InterruptedException e) {
		e.printStackTrace();
	 }
		
	}
	
}



public class interthreadcommuni {

	public static void main(String[] args) 
	{
	    Reso reso=new Reso();
	    Th01 t1=new Th01(reso ,"one");
	    Th01 t2=new Th01(reso,"two");
	    Thread thread1=new Thread(t1);
	    Thread thread2=new Thread(t2);
	    
	    thread1.setName("Thread 1  ");
	    thread2.setName("Thread 2  ");
	    
	    thread1.start();
	    thread2.start();
	    

	}

}
