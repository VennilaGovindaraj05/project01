package multi_Threading;


/*Thread life cycle
 * 
->NEW (new thread();)
->runnable(t1.strat();

->thread scheduler (like queue fifo)`
1.arrival time
2.priority based

->runing
1.wating .wait() .notify()
2.timedwaiting .sleep().join()

->terinated*/

class practices implements Runnable
{
	 
	@Override 
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
		  System.out.println(i);
		}
	}



}









public class Program2
{

	public static void main(String[] args)  throws InterruptedException 
	{
		practices obj=new practices();
		Thread t1=new Thread(obj);//new thread obj create
	 
	     System.out.println(t1.getState());//new state
	    t1.start();//start (print 3 time because it bit longe )
	    System.out.println(t1.getState());//runnable state (print 2 nd line because it just 1 line soit will print 2 line
	    t1.join();//terminate (finish the thread)
	    System.out.println(t1.getState());
	}

}
