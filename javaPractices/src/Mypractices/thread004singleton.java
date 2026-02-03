package Mypractices;

import Mypractices.User.UserDetails;

class Thread01 implements Runnable
{
	
	User user;
	
	Thread01(User user)
	{
		this.user=user;
	}
	
	 
	@Override
	public void run() 
	{
		Dbconnection connection=Dbconnection.getconnection();
		connection.save(user);
		System.out.println(Thread.currentThread().getName());
		
		
		
	}

		
	

	
}

class Thread02 implements Runnable
{
	
	User user;
	
	Thread02(User user)
	{
		this.user=user;
	}
	

	@Override
	public void run() {
		Dbconnection connection=Dbconnection.getconnection();
		connection.save(user);
		System.out.println(Thread.currentThread().getName());
		
	}
	
	
}

class Thread03 implements Runnable
{
	
	User user;
	
	Thread03(User user)
	{
		this.user=user;
	}
	

	@Override
	public void run() {
		Dbconnection connection=Dbconnection.getconnection();
		connection.save(user);
		System.out.println(Thread.currentThread().getName());
		
	}
	
	
}

class Thread04 implements Runnable
{
	
	User user;
	
	Thread04(User user)
	{
		this.user=user;
	}

	@Override
	public void run() 
	{
		Dbconnection connection=Dbconnection.getconnection();
		connection.save(user);
		System.out.println(Thread.currentThread().getName());
	}
	
	
	
	
}








public class thread004singleton {

	public static void main(String[] args) 
	{
		User.UserDetails user=new User.UserDetails();
		 User build=user.id(11).name("nila").password("jsfhiew").build();
		User build1=user.id(12).name("jansi").password("uwruqw").build();
		 User build2=user.id(13).name("sun").password("tegjekh").build();
		 User build3=user.id(14).name("jan").password("gfdvghlh").build();
		
		Thread01 t1=new Thread01(build);
		Thread02 t2=new Thread02(build1);
		Thread03 t3=new Thread03(build2);
		Thread04 t4=new Thread04(build3);

		Thread thread =new Thread(t1);
		thread.setName("Thread-1");
		thread.start();
		//thread.join();
		
	    Thread thread2 =new Thread(t2);
		thread2.setName("Thread-2");
		thread2.start();
		//thread2.join();
		
		Thread thread3 =new Thread(t3);
		thread3.setName("Thread-1");
		thread3.start();
		//thread3.join();
		
		Thread thread4 =new Thread(t4);
		thread4.setName("Thread-1");
		thread4.start();
		//thread.join();
	}

}
