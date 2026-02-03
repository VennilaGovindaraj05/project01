package synchronaizationThred;

class Bus
{
	public int seat=5;
	public synchronized void bookSeats(int seatcount) throws InterruptedException
	{
		
	
		    
			System.out.println(Thread.currentThread().getName()+"  before seat booking  "+seat+"  SEATS AVALIABLE  ");
			//Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+"  processing!!  "+seat+" SEATS  AVALIABLE  ");
			if(seat==0)
			{
				System.out.println(Thread.currentThread().getName()+" The seat is waitinggg ");
				wait();
			}
			
			
			if(seat>=seatcount)
			{
				seat-=seatcount;
				System.out.println(Thread.currentThread().getName() + " Ticket Booked Successfullyy  ");
			    
			}
			else
			{  
				System.out.println(Thread.currentThread().getName() + "--Seats not Avaliable--");
			}
		
			//System.out.println(Thread.currentThread().getName()+"  After seat booking  "+seat+ "  SEATS AVALIABLE  ");
			
	
	}
	
	
	public  synchronized void  cancelSeat(int seatcount)
	{
		System.out.println(Thread.currentThread().getName() +"  seats cancle ");
		seat+=seatcount;
		notifyAll();
		
	}

	public void displayBookingdetails()
	{
		
		
		System.out.println(" Seats are Avaliable : "+ seat);
		
	}
	
	}

class Person implements Runnable
{
	private Bus bus;
	private int seatcount;
	private boolean isCancleseats;
	Person(Bus bus, int seatcount ,boolean isCancleseats)
	{
	this.bus=bus;
	this.seatcount=seatcount;
	this.isCancleseats=isCancleseats;
	}
	
	@Override
	public void run()
	{
		if(isCancleseats)
		{
			
			try {
				bus.bookSeats(seatcount);
				Thread.sleep(5000);
				bus.cancelSeat(seatcount);
				
			} catch (InterruptedException e) {
		
				e.printStackTrace();
			}
		}
		else
		{
			try {
				bus.bookSeats(seatcount);
				
			
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}





public class TicketBookingtask 
{
	
	public static void main(String args[]) throws InterruptedException
	{
		Bus bus=new Bus();
		Person per1=new Person(bus,5,true);
		Person per2=new Person(bus,3,false);
		Person per3=new Person(bus,2,false);
	
		
		Thread t1=new Thread(per1);
		Thread t2=new Thread(per2);
		Thread t3=new Thread(per3);
		
		
		
		t1.setName("Person 1");
		t2.setName("Person 2");
		t3.setName("Person 3");
	
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		
		
		bus.displayBookingdetails();
		
	}
}
