package synchronaizationThred;
class R1
{
	

	public void printTables(int x)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"x"+x+"="+(i*x)+"--"+Thread.currentThread().getName());
		}
	}
}


class T01 implements Runnable
{
	R1 r;
	T01(R1 r)
	{
		this.r=r;
	}
	public void run()
	{
		r.printTables(2);
	}
}

class T02 implements Runnable
{
	R1 r;
	T02(R1 r)
	{
		this.r=r;
	}
public void run()
{
 r.printTables(4);
}

}

public class Task 
{
	public static void main(String args[])
	{
	R1 r=new R1();
	T01 t1=new T01(r);
	T02 t2=new T02(r);
	Thread thread1=new Thread(t1);
	Thread thread2=new Thread(t2);
	
	thread1.setName("Thread-1");
	thread2.setName("Thread-2 ");
	 

	thread1.start();
	thread2.start();
	}

}
