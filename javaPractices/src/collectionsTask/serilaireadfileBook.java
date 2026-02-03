package collectionsTask;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class serilaireadfileBook {

	public static void main(String[] args) throws Exception
	{
		
		ArrayList<Book>list=new ArrayList<>();
		
		File file =new File("C:\\Users\\G.Vennila\\Desktop\\Book.ser");
		ArrayList<Book> readfile=new ArrayList<>();
		
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file)))
		{
			readfile = (ArrayList<Book>)ois.readObject();
			System.out.println("Book was Deserialzed ");
			
		    for(Book b:list)
		    {
		    	System.out.println(b);
		    }
		
		
		}
		

	}

}
