package localdatetime_api;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;


public class EmpTask
{
	
		 static Scanner scan=new Scanner(System.in);
		 static ArrayList<Emplyoee>list=new ArrayList<>();
		
		
		  public static void empcreation(ArrayList<Emplyoee>list)
		   {
			   
			   System.out.println("How many details you want to add  ? :");
			   int n=scan.nextInt();
			   
			   for(int i=0;i<n;i++)
			   {
			   
			   System.out.println("Enter the emplyoe Name:");
			   String name=scan.next();
			   
			   System.out.println("Enter the emplyoee Department Name:");
			   String deptnam=scan.next();
			   
			   System.out.println("Enter the joning date of the emplyoee :");
			   int joindate=scan.nextInt();
			   
			   list.add(new Emplyoee(name,deptnam,joindate));
		   
			   System.out.println("emplyoe was added sucessfully!!");
			   
			   }
		     
		   System.out.println(list);
		   }

		    
		  
		  public static void printDepartmentSenior(ArrayList<Emplyoee>list)
		  {
			  
			 System.out.println("Department Wise print Senoirs:"); 
	        ArrayList<String>emp=new ArrayList<>();
	       
	        for(Emplyoee e : list)
	        {
	        	       if(!emp.contains(e.getDeptName()))
	        	       {
	        	    	     emp.add(e.getDeptName());
        	    	   }
             }  
		      
	        for(String dept:emp)
	        {
	        	     Emplyoee senior=null;
	        	   
	        	     for(Emplyoee e:list)
	        	     {
	        	    	    if(e.getDeptName().equals(dept))
	        	    	    {
	        	    	    	    if(senior == null || e.getJoningDate()<senior.getJoningDate())
	        	    	    	    {
	        	    	    	    	    senior=e;
	        	    	    	    }
	        	    	    }
	        	     }
	       
	        
	        System.out.println("Department :" +dept);
	        System.out.println("Senior Employee :" + senior.getEmpName() + " Joined :" + senior.getJoningDate());
	        
	        
	        }
		  
		  }
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	}



