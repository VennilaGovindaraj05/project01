package Mypractices;

class Flight
{
	
	static int seat=10;
	
	public static synchronized void Booking(int seatCount) throws InterruptedException
	{
		System.out.println(Thread.currentThread().getName()+" Befor booking "+seat);
		System.out.println(Thread.currentThread().getName()+"Processing"+seat);
		if(seat==0)
		{
			System.out.println(Thread.currentThread().getName());
			Thread thread = new Thread();
			thread.wait();
		}
		if(seat>=seatCount)
		{
			seat-=seatCount;
			System.out.println(Thread.currentThread().getName()+"Ticket Booked Successfully.!"+seat);	
		}
		else
		{
		System.out.println(Thread.currentThread().getName()+"Seats not avaliables Try Again "+seat);
		}
		System.out.println(Thread.currentThread().getName()+ "After booking"  +seat);
		
	}
	
	
	public static void Cancleseat(int seatCount)
	{
		System.out.println(Thread.currentThread().getName()+"wating Thread");
		Thread thread = new Thread();
		thread.notifyAll();
	}
	
	public static void DisplayBooking()
	{
		System.out.println(Thread.currentThread().getName()+seat);
	}


}

class Passengers implements Runnable
{
	static Flight f1;
	int seatCount;
	boolean isCancelSeats;
	

	public Passengers(Flight f1,int seatCount, boolean isCancelSeats)
	{
		this.seatCount=seatCount;
		this.isCancelSeats=isCancelSeats;
	}

	@Override
	public void run()
	{
	   try
	   {
		Flight.Booking(seatCount);
       Thread.sleep(5000);
       Flight.Cancleseat(seatCount);
	   }
	   catch(InterruptedException e)
	   {
		   e.printStackTrace(); 
	   }
        
      	
}

}


public class ticketbookinginterthred
{

	public static void main(String[] args)
	{
		Flight f1=new Flight();
		Passengers p1=new Passengers(f1,5,true);
		Passengers p2=new Passengers (f1,2,false);
       
		Thread thread1=new Thread(p1);
		Thread thread2=new Thread(p2);
		
		thread1.start();
		thread2.start();
		
		Flight.DisplayBooking();
		
		
		
		
		
	}

}
