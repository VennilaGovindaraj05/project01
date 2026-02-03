package Mypractices;

import java.util.Scanner;

public class Task02Bank {
	
	static int accNumber;
	static String accholderName;
	static int balances;
	static Scanner scan=new Scanner(System.in);
	
	
	
	static void deposite(double amount )
	{
		 int res=balances +=amount;
		 System.out.println((double)res);
		// System.out.println("update amount "+amount);
		
	}
	
	static void withdraw(double amount)
	
	{
		if(amount <= balances)
		{  
			int res =balances -=amount;
			System.out.println("Amount withdrwa " +double amount);//typecasting int - double
			
		}
	
		else
		{
			System.out.println("insufficeient balance try again");
		}
	
	}
	
	static void bankDetails()
	{
		
		System.out.println("Enter the acoount holder name :");
		accholderName=scan.next();
		
		System.out.println("Enter the acoount number:");
		accNumber=scan.nextInt();
		
		System.out.println("Enter the blances");
		 balances=scan.nextInt();
		
	}
	
	


	public static void main(String[] args)
	{
		
		
		
		System.out.println("Transcation details");
		bankDetails();
		for(int i=0;i<=5;i++)
		{
			
			int choice=scan.nextInt();
			
			if(choice==1)
			{
				System.out.println("enter the deposite amount");
				int amt=scan.nextInt();
				deposite(amt);
			}
			else if(choice == 2)
			{
				System.out.println("enter the  withdraw amount");
				int amtt=scan.nextInt();
				withdraw(amtt);
			}
			
			else if(choice==3)
			{
				System.out.println("exist");
				
			}
			System.out.println("upadate"+balances);
			
							
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

		/*int amt=scan.nextInt();
		deposite(amt);
		
		int amtt=scan.nextInt();
		withdraw(amtt);
		
	
		int x=scan.nextInt();
		
		int exist = 0;
		
		if(x==exist)
		{  
			System.out.println("the was end !!");
		}*/
	    
		
		
		
		
		
		
	}

}
