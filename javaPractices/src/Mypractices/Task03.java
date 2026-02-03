package Mypractices;
import java.util.Scanner;


 class InvaliduserinputException extends Exception
{

	public InvaliduserinputException(String msg)
	{
		super(msg);
	}
	
	
}







public class Task03 extends Exception

{
	/*String Subj1;
	String Subj2;
	String Subj3;
	String Subj4;
	String Subj5;
	String Subj6;*/
	
	
	Scanner scan=new Scanner(System.in);
	
	
	
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
	
	/*public void FindDuplicate(String dulpicate) throws InvaliduserinputException
	{
		if(subjects.contains(dulpicate))
		{
			System.out.println("its dulpicate value ");
		}
	}*/
	
	
	
	
	public void addSubjectName()
	{	
	   
		boolean add =false;
		
		while(!add)
		{
	    		
	    	System.out.println("Enter the 6subject name :");
		    String Subj6=scan.next();
		    
		    try 
		    {
		    	 FindDuplicate(Subj6);
		    	// subjects.add(Subj6);
		    	 add=true;
		    	
		    }
		    catch(InvaliduserinputException e)
		    {
		    System.out.println(e.getMessage());
		     System.out.println("invalid try again");
		    }
		   finally
		   {
			   System.out.println("it was created successfully!!");
		   }
		}
			
	    }
	   
	

	public static void main(String[] args)

	{
	  Task03 obj=new Task03();
      obj.subjectDetails();
	  obj.addSubjectName();
		
	  String[] subjects =new String[6];
		for(int i=0;i<=5;i++)
		{
			System.out.println("add 6th subject "+(i+1));
			subjects[i]=s.next();
					}
		  
		
		
		
		

		
		
		
	}

}
