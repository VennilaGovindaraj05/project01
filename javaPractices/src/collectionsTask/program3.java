 public static void sortBooks(ArrayList<Book> list) {
    	        TreeSet<Book> sorted = new TreeSet<>();
    	        sorted.addAll(list);

    	        System.out.println(" Books sorted by name:");
    	      
    	    }
    	
    	 public static void displayAllBooks(ArrayList<Book>list) {
    	        if (list.isEmpty()) 
    	        {
    	        	System.out.println("No books available!");
    	        }
    	        else {
    	           
    	        	System.out.println("--- All Books ---");
    	            
    	            for (Book b : list)
    	            {
    	                System.out.println(b);
    	            }
    	        }
    	    }package collectionsTask;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;

public static void updatingDetails()
            {
     		System.out.println("Updating book details");
         	   
     		boolean found=false;
     		System.out.println("Enter the Author name to update:");
     		String enterAuthorName =scan.next(); 
     		
     		for(Book b:list)
     		{
     			if(b.getAuthorName().trim().equalsIgnoreCase(enterAuthorName))
     			{
     				found=true;
     				System.out.println("the given AuthorName found " +b);
     				
     				System.out.println("which one you want to update ?");
     				System.out.println("1.Book name");
     				System.out.println("2.publishing year");
     				System.out.println("3.price");
     				
                     int enterOption=scan.nextInt();
     				
                    
     				if( enterOption == 1)
     				{
     					System.out.println("enter the new book name :");
     					b.setBookName(scan.nextLine());
     				}
     			
     				else if(enterOption == 2)
     				{
     					System.out.println("enter the new publishing year :");
     					b.setBookPublishingYear(scan.nextInt());
     				}
     			 
     				else if(enterOption == 3)
     				{
     					System.out.println("enter the new price :");
     				    b.setBookPrice(scan.nextDouble());
     				}
     			
     				else
     				{
     					System.out.println("enter the correct option");
     				}
     				
     			 System.out.println("updated books" +b);
     			 break;
     			
     			}       
     		}
     		
     		if(!found)
     		{
     			System.out.println("The give details not found");
     		}
            }

    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    		public static void updateBook() {

    	        System.out.print("Enter Book ID to Update: ");
    	        int id = scan.nextInt();

    	        for (Book b : list) {

    	            if (b.id == id) {

    	                System.out.println("Enter New Book Name: ");
    	                b.bookName = scan.next();

    	                System.out.println("Enter New Author Name: ");
    	                b.authorName = scan.next();

    	                System.out.println("Enter New Year: ");
    	                b.bookPublishingYear = scan.nextInt();

    	                System.out.println("Enter New Price: ");
    	                b.bookPrice = scan.nextDouble();

    	                System.out.println("Book updated!");
    	                return;
    	            }
    	        }

    	        System.out.println("Book not found!");
    	    }

    	    // ----------------------------------------------------
    	    // SORT BY BOOK NAME
    	    // ----------------------------------------------------
    	    public static void sortedByBookName() {

    	        Comparator<Book> custom = new Comparator<Book>() {
    	            @Override
    	            public int compare(Book a, Book b) {
    	                return a.bookName.compareToIgnoreCase(b.bookName);
    	            }
    	        };

    	        Collections.sort(list, custom);

    	        System.out.println("Books sorted by Book Name!");
    	        displayAll();
    	    }

    	    // ----------------------------------------------------
    	    // SEARCH BY AUTHOR
    	    // ----------------------------------------------------
    	    public static void searchByAuthor() {

    	        System.out.print("Enter Author Name: ");
    	        String author = scan.next();

    	        boolean found = false;

    	        for (Book b : list) {
    	            if (b.authorName.equalsIgnoreCase(author)) {
    	                System.out.println(b);
    	                found = true;
    	            }
    	        }

    	        if (!found)
    	            System.out.println("No books found for this author!");
    	    }

    	    // ----------------------------------------------------
    	    // DISPLAY ALL
    	    // ----------------------------------------------------
    	    public static void displayAll() {

    	        if (list.isEmpty()) {
    	            System.out.println("No books in list!");
    	            return;
    	        }

    	        System.out.println("\n--- ALL BOOKS ---");

    	        for (Book b : list) {
    	            System.out.println(b);
    	        }
    	    }
    	}
    	    
    	    
    	    
    	    

public class program3 {

	
	
	public static void updatingDetails()
    {
		System.out.println("Updating book details");
 	   
		boolean found=false;
		System.out.println("Enter the Author name to update:");
		String enterAuthorName =scan.next(); 
		
		for(Book b:list)
		{
			if(b.getAuthorName().trim().equalsIgnoreCase(enterAuthorName))
			{
				found=true;
				System.out.println("the given AuthorName found " +b);
				
				System.out.println("which one you want to update ?");
				System.out.println("1.Book name");
				System.out.println("2.publishing year");
				System.out.println("3.price");
				
             int enterOption=scan.nextInt();
				
            
				if( enterOption == 1)
				{
					System.out.println("enter the new book name :");
					b.setBookName(scan.nextLine());
				}
			
				else if(enterOption == 2)
				{
					System.out.println("enter the new publishing year :");
					b.setBookPublishingYear(scan.nextInt());
				}
			 
				else if(enterOption == 3)
				{
					System.out.println("enter the new price :");
				    b.setBookPrice(scan.nextDouble());
				}
			
				else
				{
					System.out.println("enter the correct option");
				}
				
			 System.out.println("updated books" +b);
			 break;
			
			}       
		
		
		if(!found)
		{
			System.out.println("The give details not found");
		}
    }
}
	
	public static void searchingAuthor()
	{
		System.out.println("enter author name :");
		String authorName=scan.nextLine();
		
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
	
	
	
	 //file read
	  
	  ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
	   for(Book b:list)
	   {
		   System.out.println(b);
	   }
         System.out.println("file will be read successfullyy !!");
	
	
	
	
	
         File file=new File("C:\\Users\\G.Vennila\\Desktop\\taskBook\\Book.txt");
		   file.createNewFile();
			
			//file write
	        FileOutputStream fos=new FileOutputStream(file);
	        ObjectOutputStream oos=new ObjectOutputStream(fos);
	        oos.writeObject(list);
	        fos.close();
	        oos.close();
	        System.out.println("file will be write successfully");
			
	
	
	
	
	
	    File file=new File("C:\\Users\\G.Vennila\\Desktop\\Book.ser");
		FileWriter fw=new FileWriter(file);
		for(Book b:list)
		{
			fw.write(b.toString());
			
		}
		
		fw.close();
		System.out.println("file will cretaed successfully!");
