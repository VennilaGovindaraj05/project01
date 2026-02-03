package collectionsTask;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class bookmainclass implements Serializable

 {
	
	  private static final long serialVersionUID = 101;
	 
	  
	  static Scanner scan=new Scanner(System.in);
	  static ArrayList<Book>list=new ArrayList<>();
	 
	
	public static void main(String[] args) throws Exception
	{
		
		   boolean isContinue=false;
		   do
		   {
			   
			   program2.DisplayALlDetails();
			  
			   System.out.println("Do you want (Continue ? 1 /0) ");
			   int x=scan.nextInt();
			  
			   isContinue=(x==1)?true:false;
		   
		   }while(isContinue);
		
		 
		   
		   
	
	
	
	
	
	
	
	
	
	}

}
