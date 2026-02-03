package Mypractices;

import java.util.Scanner;
import java.util.Arrays;

//array


public class Task01 
{
	static String empName;
	static int empId;
	static int basicSalary;
	static int bonus;
	
 Scanner scan=new Scanner(System.in);
	
	
	
	 void calculateTotalSalary()
	{
		//System.out.println("add basic salary and bonus");
		int resu= basicSalary += bonus;
		
		System.out.println("Total amount :"+(double) resu);//typecasting int-double
	}
	
	   void empDetails()
	{
		System.out.println("--Empolye details--");
		System.out.println("Enter emp name :");
		empName= scan.next();
		
		System.out.println("Enter the emp id :");
		empId=scan.nextInt();
		
		System.out.println("Enter basic salaryamount:");
		basicSalary=scan.nextInt();
		
		System.out.println("Enter bonus amount :");
		bonus=scan.nextInt();
		
	}
	

	public static void main(String[] args)
	{
		Task01 list[]=new Task01[3];
		
		for(int i=0;i<list.length;i++)
		{
			list[i]=new Task01();
		
		 list[i].empDetails();
		 list[i].calculateTotalSalary();
		}
		
	}

}

