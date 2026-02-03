package Mypractices;


interface Messageservice
{
	void messagePassing();
}

class Email implements  Messageservice
{

	@Override
	public void messagePassing() 
	{
	   System.out.println("Message serive text passed to your email account!! check it");
	}
	
}
class WhatsApp implements  Messageservice
{

	@Override
	public void messagePassing() 
	{
	   System.out.println("Message serive text send it your what'sapp!! check it");
	}
	
}
class Sms implements  Messageservice
{

	@Override
	public void messagePassing() 
	{
	   System.out.println("Message serive msg passed to your messagenger !! check it");
	}
	
}


public class task07abstract {

	public static void main(String[] args)
	{
		 Messageservice mesage=new Email();
		 mesage.messagePassing();

	}

}
