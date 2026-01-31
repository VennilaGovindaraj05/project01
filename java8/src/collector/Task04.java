package collector;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee01{
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
	public Employee01(String name, String dept, LocalDate joiningDate, LocalDate relevingDate) {
		super();
		this.name = name;
		this.dept = dept;
		this.joiningDate = joiningDate;
		this.relevingDate = relevingDate;
	}
	
	
	public Employee01() {
		
	}
	
	
	
}







  public class Task04 {
	 

	 public static void main(String[] args) {
		
		 
		  List<Employee01> employees = new ArrayList<>();

	        employees.add(new Employee01("Arun", "IT",
	                LocalDate.of(2020, 1, 10), LocalDate.of(2023, 3, 15)));

	        employees.add(new Employee01("Bala", "HR",
	                LocalDate.of(2019, 5, 20), LocalDate.of(2022, 7, 10)));

	        employees.add(new Employee01("Chitra", "Finance",
	                LocalDate.of(2018, 8, 1), LocalDate.of(2021, 12, 31)));

	        employees.add(new Employee01("Deepak", "IT",
	                LocalDate.of(2021, 2, 18), LocalDate.of(2022, 3, 2)));

	        employees.add(new Employee01("Ezhil", "Admin",
	                LocalDate.of(2017, 6, 5), LocalDate.of(2020, 6, 30)));

	        employees.add(new Employee01("Farooq", "HR",
	                LocalDate.of(2022, 1, 3), LocalDate.of(2029, 6, 30)));

	        employees.add(new Employee01("Gokul", "IT",
	                LocalDate.of(2016, 9, 12), LocalDate.of(2019, 4, 25)));

	        employees.add(new Employee01("Hari", "Finance",
	                LocalDate.of(2020, 11, 8), LocalDate.of(2024, 6, 30)));

	        employees.add(new Employee01("Indhu", "Admin",
	                LocalDate.of(2019, 3, 14), LocalDate.of(2022, 10, 1)));

	        employees.add(new Employee01("Jaya", "IT",
	                LocalDate.of(2023, 4, 1), LocalDate.of(2025, 6, 30)));
		 
		 
	       Long l1 =  ChronoUnit.YEARS.between(LocalDate.of(2000, 4, 1), LocalDate.of(2005, 5, 2));
	        System.out.println(l1);
	        
	        
	        //  3 - Hari,Jaya,Farooq
	        
	       Map<Long,String> map  =employees.stream()
	        .collect(Collectors.groupingBy((x) -> ChronoUnit.YEARS.between(x.getJoiningDate(), x.getRelevingDate()) , Collectors.mapping((x)-> x.getName(), Collectors.joining(",","{" , "}"))));
	        System.out.println(map);
	        
	        
	        
	        
	        
		 
		 
	}
	 
}
