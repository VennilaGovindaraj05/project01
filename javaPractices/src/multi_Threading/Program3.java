package multi_Threading;



//Ananymous inner class using thread

public class Program3
{

	public static void main(String[] args)
	{
	 Thread thread=new Thread()
     {
		 public void run()
		 {
			 for(int i=1;i<=10;i++)
			 {
				 System.out.println(i);
			 }
		 }
     };
	 
thread.start();


      Runnable r1=new Runnable()
      {
    	  
    	  public void run()
    	  {
    		  for(int i=0;i<=5;i++)
    		  {
    			  System.out.println(i);
    		  }
    	  }
    	  
       };
      Thread t1=new Thread(r1);
      t1.start();
	} 

}
