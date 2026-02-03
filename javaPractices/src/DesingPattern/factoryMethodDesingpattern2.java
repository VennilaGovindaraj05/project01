package DesingPattern;


interface Network
{
	 void connect();
}

class Airtel implements Network
{

	@Override
	public void connect()
	{
		System.out.println("airtel was connected to network");
		
	}
	
}

class vi implements Network
{

	@Override
	public void connect() 
	{
		System.out.println("vi was connected to network");
	}
}

class ConnectingNet
{
	
	private Network network;
	
	public void switchingNetwork(String service)
	{
		switch(service)
		{
		  
		case"Airtel":
			network=new Airtel();
			break;
			
		case"vi":
			network=new vi();
			break;
			
			default:
			network=null;
			break;
			
		}
	}
		public Network getNetwork()
		{
			return network;
		}
		
		
	}
	
	
	


public class factoryMethodDesingpattern2
{

	public static void main(String[] args)
	{
		 ConnectingNet connectnet=new  ConnectingNet();
         connectnet.switchingNetwork("Airtel");
         Network network=connectnet.getNetwork();
         network.connect();
         		
	}

}
