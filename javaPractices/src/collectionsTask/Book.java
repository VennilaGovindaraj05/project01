package collectionsTask;

import java.util.ArrayList;
import java.util.Scanner;

public class Book 
{
     private int id;
	 private  String bookName;
	 private String authorName;
	 private int bookPublishingYear;
	 private  double bookPrice;
	 
	  static Scanner scan=new Scanner(System.in);
	  static ArrayList<Book>list=new ArrayList<>();
	
	  Book()
	  {
		  
	  }
	  
	  public Book(int id, String bookName, String authorName, int bookPublishingYear, double bookPrice) 
	{
		this.id=id;
		this.bookName=bookName;
		this.authorName=authorName;
		this.bookPublishingYear=bookPublishingYear;
		this.bookPrice=bookPrice;
		
		
	}


	public int getId() {
		return id;
	}

	  public void setId(int id) {
		  this.id = id;
	  }

	  public  String getBookName() {
		  return bookName;
	  }

	  public  void setBookName(String bookName) {
		  this.bookName = bookName;
	  }

	  public String getAuthorName() {
		  return authorName;
	  }

	  public void setAuthorName(String authorName) {
		  this.authorName = authorName;
	  }

	  public int getBookPublishingYear() {
		  return bookPublishingYear;
	  }

	  public void setBookPublishingYear(int bookPublishingYear) {
		  this.bookPublishingYear = bookPublishingYear;
	  }

	  public double getBookPrice() {
		  return bookPrice;
	  }

	  public void setBookPrice(double bookPrice) {
		  this.bookPrice = bookPrice;
	  }
	  
	

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", authorName=" + authorName + ", bookPublishingYear="
				+ bookPublishingYear + ", bookPrice=" + bookPrice + "]";
	}

  
}

	