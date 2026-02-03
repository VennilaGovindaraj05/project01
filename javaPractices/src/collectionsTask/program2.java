package collectionsTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;



     public class program2 
      {
    	static ArrayList<Book> list=new ArrayList<>();
    	  
		static Scanner scan=new Scanner(System.in);
	
		
		public static void DisplayALlDetails() throws InterruptedException
		{
			 System.out.println(" Book Details ");
	         System.out.println("1. Add Book ");
	         System.out.println("2.Delete Book (by Using ID or Name)");
	         System.out.println("3.Sorting  by BookName");
	         System.out.println("4.Update Book Details");
	         System.out.println("5.Search by Author or Year");
	      
	         
	         
	         System.out.println("Please enter the option:");
	         int ch=scan.nextInt();
	      
	    	   switch(ch)
	    	   {
	    	   case 1: 
	    		    CreateaBook(list); 
	    	   break;
	    	   
	    	   case 2: 
	    		  deleting(list);
	    		   break;
	    		   
	    	   case 3:
	    		sortedbyBookname(list);
	    		   break;
	    	   
	    	   case 4:
	    		   updatingBookDetails(list);
	    		   break;
	    	   case 5:
	    		   searchingAuthor();
	    		   break;
	    		
	    		 
	    		   
	    	   }
		
	      }
		
         public static void CreateaBook(ArrayList<Book> list)
    		{
    		     System.out.println("How many books you want to add?");
    		     int n=scan.nextInt();
    	    
    		     for(int i=0;i<n;i++)
    		
          		{
 
    	          System.out.println(" --- BOOK DETAILS --- ");

    	          System.out.println("Enter the id :");
    	          int id=scan.nextInt();

    	          System.out.println("Enter the Book Name :");
    	          String bookName=scan.next();

    	          System.out.println("Enter the Author Name :  ");
    	          String authorName=scan.next();

    	          System.out.println("Enter the Book publishing year :");
    	          int bookPublishingYear=scan.nextInt();

    	          System.out.println("Enter the Book Price :");
    	          double bookPrice=scan.nextDouble();
    		
    	       
    	         list.add(new Book(id,bookName,authorName,bookPublishingYear,bookPrice));

    		
    		}	
    			System.out.println(list);	
    		}
    	 
  
    	 
    	 public static void deleting(ArrayList<Book> list)  throws InterruptedException
    	 {
    		 
    		 System.out.println("deleting book using id :");
    		 
    		 int id=scan.nextInt();
    		 
    		 ListIterator<Book> it=list.listIterator();
    		 
    		 boolean found =false;
    		
    		 while(it.hasNext())
    		 {
    			 Book x=it.next();
    			 
    		 
				 if(x.getId() == id)
				 { 			 
    				 it.remove();
    				 
    				 System.out.println("book was deleted successfully");
    				 found=true;
    				  System.out.println(list);
			        break;
				 }
				
    		 }	 
    	    
    	 }
    	 
    	public static void sortedbyBookname(ArrayList<Book>list)
        {
        Comparator<Book> custom =new Comparator<Book>()
         {
             @Override
             public int compare(Book o1, Book o2)
              {
     		return o1.getBookName().compareToIgnoreCase(o2.getBookName());
     		  }
    	    };
              Collections.sort(list, custom);
//               System.out.println(list);
//               System.out.println("Book was sorted successfully!!");
               
    	      for(Book b:list)
    	      {
    	    	  System.out.println(b);
    	      }
    	      System.out.println("Book was sorted successfully!!");
        }
      
    	
    	
    	
    	public static void updatingBookDetails(ArrayList<Book> list)
    	{
    		System.out.println("Enter the Book price to update :");
    	    double bookPrice=scan.nextDouble();
    	
    	    for(Book b:list)
    	    {
    	    	if(b.getBookPrice() == bookPrice)
    	    	{
    	    		System.out.println("Enter the new BookPrice:");
    	    		b.setBookPrice(scan.nextDouble());
    	    		System.out.println(b);
    	    		System.out.println("Book was update succesfully!!");
    	    	}
    	     
    	    	
    	    }
    	
    	
    	}
    	
    	public static void searchingAuthor()
    	{
    		System.out.println("enter author name :");
    		String authorName=scan.next();
    		
    		boolean found=false;
    		
    		for(Book b:list)
    		{
    			if(b.getAuthorName().equalsIgnoreCase(authorName))
    			{
    				System.out.println(b);
    				found =true;
    				
    			}
    		}
    		
    		if(!found)
    		{
    			System.out.println("NO BOOKS FOUND FOR THIS AUTHOR Try Again");
    		}
    	
    	}

		
      
      }
          
      
      
      
      
      
      
      
      
     
    	 
    	 
                 
				 
    	 
    		
    	 
    	 
    	 
    	 
    	 
    	 
      
    	
    	
		 
    	 



	
      

	
	
	
	
	
	
	
	

