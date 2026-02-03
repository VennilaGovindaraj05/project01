package synchronaizationThred;


//used synchronized keyword that thread will be not stuffled 
//its comes thread0 thread1
class Resources
{
	public synchronized void count()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"--"+"srinithi azhagukutty");
		    try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}




class T1 implements Runnable
{
	Resources reso;
	
	T1(Resources reso)
	{
		this.reso=reso;
	}

    public void run()
    {
    	reso.count();
    }

}


class T2 implements Runnable
{
	Resources reso;
	T2(Resources reso)
	{
		this.reso=reso;
	}
	public void run()
	{
		reso.count();
	}
	
}
public class program1 
{
	
	public static void main(String args[])
	{
	

	Resources reso=new Resources();
	T1 t1=new T1(reso);
	T2 t2=new T2(reso);
	
	Thread thread1=new Thread(t1);
	Thread thread2=new Thread(t2);
	
	  thread1.setName("First Thread");
	  thread2.setName("Secound Thread");
	
	thread1.start();
	thread2.start();
	
	
	
	
	
	
	
	
	}

}
