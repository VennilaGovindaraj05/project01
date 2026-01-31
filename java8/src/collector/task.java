package collector;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

class Employee
{
	
	int id;
	String name;
	String department;
	int salary;
	int age;
	
	public Employee(int id, String name, String department, int salary, int age)
	{
		
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.age = age;
	}

	
	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name 
				+ ", department=" + department 
				+ ", salary=" + salary + ", age="
				+ age + "]";
	}

}



public class task 
{
	public static void main(String[] args) 
	{
		ArrayList<Employee> arr=new ArrayList<>();
		arr.add(new Employee(101,"jansi","software developer",26000,25));
		arr.add(new Employee(102,"max","testing",29000,28));
		arr.add(new Employee(103,"alice","software developer",20000,22));
		arr.add(new Employee(104,"harry","testing",35000,30));
		arr.add(new Employee(105,"dora","ai developer",30000,21));
		
		//1.convert arrayList to list
	   
		
		
		
	    List<String>list= arr.stream()
		.map((x)->x.name)
	    .collect(Collectors.toList());
		System.out.println(list);
		
		//unique department as set
	 
	       Set<String>set = arr.stream()
	      .map((x)->x.department)
	      .collect(Collectors.toSet());
			System.out.println(set);
		
		//3.store empl in a linkedList
		 LinkedList<Employee> ll=arr.stream()
	    .collect(Collectors.toCollection(()->new LinkedList()));
		 System.out.println(ll);
			
		//4.join all employee names into a single string separated by commas
		
		String s=arr.stream()
		.map((v)->v.name)
		.collect(Collectors.joining(","));
		System.out.println(s);
		
		//5.join all department name using "|"
		
		String s1=arr.stream()
		.map((x)->x.department)
		.collect(Collectors.joining("|"));
		System.out.println(s1);
		
		//6.count total numbers of employee
		long l=arr.stream()
		 .map((x)->x.salary)
		.collect(Collectors.counting());
		System.out.println(l);
		
		//7.find total salary of all empl
		
		Integer inte=arr.stream()
		.collect(Collectors.summingInt((x)->x.salary));
		System.out.println(inte);
		
		
		//8.find average age of emp
		
		Double dl=arr.stream()
		.collect(Collectors.averagingInt((x)->x.age));
		System.out.println(dl);
		
		
		
		
		
		//9.get emp age statistics(min,max,avg,count,sum)
		IntSummaryStatistics age=arr.stream()
		.collect(Collectors.summarizingInt((x)->x.age));
		System.out.println(age);
		
		
		
		//10.find emp with minimun salary
		
		Optional<Employee> minsalary=arr.stream()
		.collect(Collectors.minBy((a,b)->a.salary-b.salary));
		System.out.println(minsalary);
		
		
		
		
		//12.find emp with maximun salary
		

		Optional<Employee> maxsalary=arr.stream()
		.collect(Collectors.maxBy((a,b)->a.salary-b.salary));
		System.out.println(maxsalary);
		
		
	
	//	13. find longest empl name using reducing()
		
	   Integer longname =arr.stream()
	    .map((x)->x.name)
	    .collect(Collectors.reducing(0, (x)->x.length(), (x,y)->x+y));
	    
		System.out.println(longname);
		
		
		
		//14.group empl by department ->collect only names
		
		
		
		//15.get distinct emp department as an set
		  Set<String> setdepat =arr.stream()
		         .map((x)->x.department)
				   .distinct().collect(Collectors.toSet());
		       System.out.println(setdepat);
		
		
		
		//16.after collectiong emp as list,convert to array
		       
		      
	    Employee[] re=  list.stream()
	   //.collect(Collectors.collectingAndThen(Collectors.toList(),(x)->x.toArray(new Employee[0])));
	    		.collect(Collectors.toList())
	    		.toArray((x)->new Employee[0]);
		System.out.println(Arrays.toString(re));
		
		
		
	}

}
