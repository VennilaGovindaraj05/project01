package streamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

/* 1.filter even number
 * 2.convert string to uppercase
 * 3.print unique values
 * 4.print top3 smallest number
 * 5.skip first 2 names and print remaning
 * 6.print number > 5 after doubling
 * 7.sort names by length
 * 8.extract first character of each word
 * 9.convert list of integer to their square,then emove dupliates
 * 10.print employee sorted by salary
 * 11.print student sorted by student name
 * 12.find number divisible by 3or5
 */
public class task01
{
	
	private String name;
    private 	int salary;
    private String departmentName;
	
	task01(String name,int salary,String departmentName)
	{
		this.name=name;
		this.salary=salary;
		this.departmentName=departmentName;
	}
	
   public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

   public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


   @Override
	public String toString() {
		return " [name=" + name + ", salary=" + salary + ", departmentName=" + departmentName + "]";
	}

   public static void main(String[] args) 
{
	   
	 // 1. 
	   System.out.println("1.filter even number");
	   Stream.of(1,4,5,2,8,12,20,24,36,14,13,19).filter((v)->v%2==0).forEach(System.out::println);
	   
	   
	   
	   
	   System.out.println("2.convert string to uppercase");
	   Stream.of("java introduced in 1998 .").map((t)->t.toUpperCase()).forEach(System.out::println);	   
	   

	   
	   System.out.println("3.print unique values");
	   
	   Stream.of(1,4,5,8,1,4,9,2,6,8,1,10).distinct().forEach(System.out::println);	
	   
	   
	   
	   
	   System.out.println("4.print top3 smallest number");
	   Stream.of(1,29,8,4,37,56,12).sorted().limit(3).forEach(System.out::println);	
	
	   
	   
	   
	   
	   System.out.println("5.skip first 2 names and print remaning");
	   Stream.of("burger","pizza","cake","brownie","chocolate").skip(2).forEach(System.out::println);	
	   
	   
	   
	   
	   System.out.println("6.print number > 5 after doubling");
	   Stream.of(1,2,3,7,8,9,4,10).map((y)->y*2).filter((y)->y>5).forEach(System.out::println);	
	   
	   
	   
	   
	   System.out.println(" 7.sort names by length");
	   Stream.of("janis","alice","sri","thendral").sorted((a,b)->a.length() - b.length()).forEach(System.out::println);	   
	   
	   
	   
	   
	   System.out.println("8.extract first character of each word");
	   Stream.of("java","program").map((name)->name.charAt(0)).forEach(System.out::println);
	 
	   
	   
	   
	   System.out.println("9.convert list of integer to their square,then remove dupliates");
	   Stream.of(1,3,2,1,3,5,6,6).map((n)->n*n).distinct().forEach(System.out::println);	
	   
	  
	   
	   
	   System.out.println("10.print employee sorted by salary");
	    ArrayList<task01>arr=new ArrayList<>();
        arr.add(new task01("jansi",25000,"developer"));
	    arr.add(new task01("kokiee",45000,"testing"));
	    arr.add(new task01("cocoo",15000,"developer"));
	    arr.add(new task01("brownie",32000,"testing"));
		
	    arr.stream().sorted((e1,e2)->e1.getSalary()-e2.getSalary()).forEach(System.out::println);
	 
	   
	   
	   
	    System.out.println("11.print student sorted by student name");
	   	Stream.of("sam","john","alice","max","harry").sorted().forEach(System.out::println);
	   
	   
	   	
	   	
	   	System.out.println("12.find number divisible by 3or5");
	    Stream.of(15,2,10,4,6,7,8,9,24).filter((n)->n%3==0 &&  n%5==0).forEach(System.out::println);//n%3
	   
	   
	   
	   
}

  
}
