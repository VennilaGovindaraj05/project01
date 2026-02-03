package Task;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

class program1
{
	

	public static void Sortingproducts(ArrayList<Products> pro)
	{
		
		for(int i=0;i<pro.size();i++)
		{
			for(int j=i+1;j<pro.size();j++)
			{
				if(pro.get(i).price >pro.get(j).price)
				{
					Products temp=pro.get(i);
					pro.set(i, pro.get(j));
					pro.set(j, temp);
					
					
				}
				
			}
		}
		
	}
	
	
	public static void main(String[] args) throws Exception 
	{
		ArrayList<Products> obj=new ArrayList<>();
		
		File file=new File("C:\\Users\\G.Vennila\\Desktop\\product-list.ser");
		
		 try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file)))
	        {
	          
	        	obj=(ArrayList<Products>) ois.readObject();
	        	
	            System.out.println("readed successfully!");
	            
	            
	            System.out.println("befor sorting ");
	            for(Products prod : obj)
	            {
	            	
	            	prod.displayProductdetails();
	            }
	            
	            Sortingproducts(obj);
	            
	            System.out.println("after sorting");
	        } 
	        catch (IOException e) 
	        {
	            System.out.println("Error reading file: " + e.getMessage());
	        }

		
	}
}