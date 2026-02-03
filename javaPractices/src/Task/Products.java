package Task;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;




public class Products  implements Serializable
{
	
	private static final long serialVersionUID = 101;
	
	 int id;
	 String name;
	 String category;
	 double price;
 
	 
	
	Products(int id,String name,String category,double price)
	{
		this.id=id;
		this.name=name;
		this.category=category;
		this.price=price;
	}
	
	



	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
	}
	
	
	public void displayProductdetails()
	{
		
		System.out.println("Product id :" +id);
		System.out.println("Product name :" +name);
		System.out.println("Product category :" +category);
		System.out.println("Product price :" +price);
		
		
	}


	public static void main(String[] args) {
        
		Scanner scan=new Scanner(System.in);
		ArrayList<Products> products = new ArrayList<>();

       System.out.println("Enter the products detail ");
       int n=scan.nextInt();       
       
      // boolean isContinue;
       for(int i=0;i<n;i++)
       {
    	   
    	System.out.println("Enter the product ID :");
  		int id=scan.nextInt();
   		System.out.println("Enter the product NAME :");
   		String name=scan.next();
   		System.out.println("Enter the product CATEGORY :");
   		String category=scan.next();
   		System.out.println("Enter the product PRICE :");
   		double price=scan.nextDouble();
         scan.nextLine(); 
         
         products.add(new Products(id,name,category,price));
       }

       
    
        
        // Write products to file
       File file=new File("C:\\Users\\G.Vennila\\Desktop\\product-list.ser");
		
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file)))
        {
          
        	oos.writeObject(products);
            System.out.println("Products were saved successfully!");
        } 
        catch (IOException e) 
        {
            System.out.println("Error writing file: " + e.getMessage());
        }

    
      
	
	
	}
	}
