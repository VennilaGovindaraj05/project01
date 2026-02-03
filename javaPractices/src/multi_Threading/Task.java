package multi_Threading;

 class program
{

	
	public void printTables(int x)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"x"+x+"="+(i*x)+"--"+Thread.currentThread().getName());
		}
	}
}
	
	class ThreadTask1 implements Runnable
	{
		program obj;
		
		public ThreadTask1(program obj)
		{
			this.obj=obj;
		}
		
    @Override
	public void run()
	{
	 obj.printTables(9);
	}
		
	}

	
   public class Task
	{
	public static void main(String[] args)
	
	{
		program prom =new program();
		ThreadTask1 th1=new ThreadTask1(prom);
		Thread t1 = new Thread(th1);
		t1.start();
	
	
	
	}
	


}