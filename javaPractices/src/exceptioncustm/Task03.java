package Mypractices;
//import package exceptioncustm;
//package exceptioncustm;
import java.util.Scanner;

public class Task03 

{
	String Subj1;
	String Subj2;
	String Subj3;
	String Subj4;
	String Subj5;
	String Subj6;
	
	
	Scanner scan=new Scanner(System.in);
	String[] arr = {Subj1,Subj2,Subj3,Subj4,Subj5};
	

	 
	 Task03(String Subj1,String Subj2,String Subj3,String Subj4,String Subj5)
	 {
		 this.Subj1=Subj1;
		 this.Subj2=Subj2;
		 this.Subj3=Subj3;
		 this.Subj4=Subj4;
		 this.Subj5=Subj5;
		 //this.Subj6=Subj6;
	 }
	 
	 
	 
	 
	
	public void subjectDetails()
	{
		System.out.println("Enter the 1subject name :");
	    String Subj1=scan.next();
	    
	    System.out.println("Enter the 2subject name :");
	    String Subj2=scan.next();
	    
	    System.out.println("Enter the 3subject name :");
	    String Subj3=scan.next();
	    
	    System.out.println("Enter the 4subject name :");
	    String Subj4=scan.next();
	    
	    System.out.println("Enter the 5subject name :");
	    String Subj5=scan.next();
	
	}
	
	public void addSubjectName()
	{	
	    if(arr == Subj6)
	    {   	
	    	try {
	    		
	    	System.out.println("Enter the 6subject name :");
		    String Subj6=scan.next();
	    	}
	    	catch(Exception e)
	    	{
	    		e.getMessage();
	    	}
			
	    }
	   
	}
	
	
	
	

	public static void main(String[] args)

	{
	  Task03 obj=new Task03("Tamil","English","Maths","Sciences","Social");
      obj.subjectDetails();
	  obj.addSubjectName();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
