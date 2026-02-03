package Mypractices;

//factory desing

interface Factorydesing
{
	
	void connectingpayments();
	
}

class Gpay implements Factorydesing
{

	@Override
	public void connectingpayments()
	{
	System.out.println("now you can use gpay its was connected !!");
		
	}
	
}

class Phonepe implements Factorydesing
{

	@Override
	public void connectingpayments() 
	{
		
		System.out.println("now you can use phonepe its was connected !!");
	}
	
}

class Paytm implements Factorydesing
{

	@Override
	public void connectingpayments() 
	{
		
		System.out.println("now you can use paytm its was connected !!");
	}
	
}

class Onlinepayments
{
	private Factorydesing factorys;
	
	public void switchingpayments(String service)
	{
		switch(service)
		{
		case "gpay":
			factorys=new Gpay();
			break;
			
		case "phonepe":
			factorys=new Phonepe();
			break;
			
		case "paytm":
		factorys=new Paytm();
		break;
		
		default:
			factorys=null;
			break;
		
		}
	}
	public Factorydesing getmakingpayment()
	{
		return factorys;
	}
		
		
}



public class task06factorydesing 
{

	public static void main(String[] args) 
	{
		Onlinepayments onlinepayment=new Onlinepayments();
		onlinepayment.switchingpayments("gpay");
		Factorydesing factorys=onlinepayment.getmakingpayment();
		factorys.connectingpayments();
		
		
		
		
	}

}
