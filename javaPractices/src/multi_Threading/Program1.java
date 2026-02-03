package multi_Threading;

class Task01
{
	public void printTables(int x)
	{
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"x"+x+"="+(i*x)+"--"+Thread.currentThread().getName());
		}	
		
	}
}

class Thread01 implements Runnable
{
	Task01 obj;
	
	public Thread01(Task01 obj)
	{
		this.obj=obj;
	}
	
@Override
public void run()
{
 obj.printTables(2);
}
}


class Thread02 implements Runnable
{
	Task01 obj;
	
	public Thread02(Task01 obj)
	{
		this.obj=obj;
	}
	
@Override
public void run()
{
 obj.printTables(8);
}
}




public class Program1 {

	public static void main(String[] args)
	{
		
	Task01 obj=new Task01();
	Thread01 th1=new Thread01(obj);
	Thread02 th2=new Thread02(obj);		
Thread tread1=new Thread(th1);
Thread tread2=new Thread(th2);
tread1.start();
tread2.start();




	}

}
