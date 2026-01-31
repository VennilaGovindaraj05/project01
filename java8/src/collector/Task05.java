package collector;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee001{
	String name;
	String dept;
	
	LocalDate joiningDate;
	LocalDate relevingDate;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public LocalDate getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}
	public LocalDate getRelevingDate() {
		return relevingDate;
	}
	public void setRelevingDate(LocalDate relevingDate) {
		this.relevingDate = relevingDate;
	}
	public Employee001(String name, String dept, LocalDate joiningDate, LocalDate relevingDate) {
		super();
		this.name = name;
		this.dept = dept;
		this.joiningDate = joiningDate;
		this.relevingDate = relevingDate;
	}
	
	
	public Employee001()
	{
		
	}
	@Override
	public String toString() {
		return " [name=" + name + ", dept=" + dept + ", joiningDate=" + joiningDate + ", relevingDate="
				+ relevingDate + "]";
	}
	
	
	
}


public class Task05 
{
         public static void main(String[] args) 
         
        {
        	  List<Employee001> employees = new ArrayList<>();

  	        employees.add(new Employee001("Arun", "IT",
  	                LocalDate.of(2020, 1, 10), LocalDate.of(2023, 3, 15)));

  	        employees.add(new Employee001("Bala", "HR",
  	                LocalDate.of(2011, 5, 20), LocalDate.of(2020, 7, 10)));

  	        employees.add(new Employee001("Chitra", "Finance",
  	                LocalDate.of(2018, 8, 1), LocalDate.of(2021, 12, 31)));

  	        employees.add(new Employee001("Deepak", "IT",
  	                LocalDate.of(2021, 2, 18), LocalDate.of(2029, 3, 2)));

  	        employees.add(new Employee001("Ezhil", "Admin",
  	                LocalDate.of(2017, 6, 5), LocalDate.of(2020, 6, 30)));

  	        employees.add(new Employee001("Farooq", "HR",
  	                LocalDate.of(2022, 1, 3), LocalDate.of(2029, 6, 30)));

  	        employees.add(new Employee001("Gokul", "IT",
  	  
  	        LocalDate.of(2016, 9, 12), LocalDate.of(2019, 4, 25)));
  	     
  	        employees.add(new Employee001("Hari", "Finance",
	                LocalDate.of(2020, 11, 8), LocalDate.of(2024, 6, 30)));
	
  	        
  	        long l=ChronoUnit.YEARS.between(LocalDate.of(2000, 5, 1),LocalDate.of(2010, 5, 1));
  	        System.out.println(l);//10 years gap
  	        
  	        //using stream and chronounits
  	        System.out.println("find years gap for employees ");
  	        Map<String,Long> map= employees.stream()
  	       .collect(Collectors.toMap((x)->x.getName(),(y)->ChronoUnit.YEARS.between(y.joiningDate, y.relevingDate)));  	        
  	        System.out.println(map);
  	        
  	        //department wise find year gap
  	        
  	        Comparator<Employee001>com=new Comparator<>()
  	        		{

						
						public int compare(Employee001 o1, Employee001 o2) {
							long first=ChronoUnit.YEARS.between(o1.getJoiningDate(),o1.relevingDate);
							long sec=ChronoUnit.YEARS.between(o2.getJoiningDate(),o2.relevingDate);
							return (int) (first-sec);
						}
  	        	
  	        		};
  	        
  	        
  	         Map<Object, Object> map1=employees.stream()
//  	        .collect(Collectors.groupingBy((x)->x.getDept(),Collectors.maxBy(com)));
  	        		 .collect(Collectors.groupingBy((x)->x.getDept(),
  	        				 Collectors.collectingAndThen(Collectors.maxBy(com), (x)->x.get().getName())
  	        				 
  	        				 
  	        				 ));
  	        System.out.println(map1);
  	        
  	        
  	        
  	        
  	      //String problems
  	        
  	        //counting the words( one -2 threee -2
  	       Map<String, Long> map2= Stream.of("one","one","three","four","three","six","four","eigth","six")
  	        .collect(Collectors.groupingBy((x)->x,Collectors.counting()));
  	        System.out.println(map2);
  	        
  	        
  	        //find longest name in the  employee list
  	        //[farooq -6]
  	        
  	      Comparator<Employee001>com1=new Comparator<>()
    		{

				
				public int compare(Employee001 o1, Employee001 o2) {
					
					return o1.getName().length()-o2.getName().length();
				}
    	
    		};
    

  	       Map<String, Optional<Employee001>> map3= employees.stream()
  	        .collect(Collectors.groupingBy((x)->x.getName(),Collectors.maxBy(com1)));
  	      // .collect(Collectors.groupingBy((x)->x.dept, Collectors.mapping((x)->x.getName(), Collectors.max))
  	    		   System.out.print(map3);
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
  	        
		}
}
