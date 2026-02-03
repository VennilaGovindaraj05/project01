package comparablecomparator;

import java.util.PriorityQueue;


class Employee implements Comparable<Employee>
{

	private int id;
	private String name;
	private double salary;
	
	Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	


	@Override
	public int compareTo(Employee o)
	{
		if(this.salary > o.salary)
		{
			return -1;
		}
		else if(this.salary < o.salary)
		{
			return 1;
		}
		return 0;
}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}





}

public class comparable
{
	public static void main(String[] args) 
	{
		PriorityQueue<Employee> pq=new PriorityQueue<Employee>();//priorityqueue maintain min heap by default
	    pq.add(new Employee(109,"sun", 5000.00));
	    pq.add(new Employee(102,"moon", 3000.00));
	    pq.add(new Employee(112,"earth", 2000.00));
	    pq.add(new Employee(104,"mars", 7000.00));
	    
	   
		System.out.println(pq);//->ascending order maintain //poll get max value 7000.00
	
		
		
	}	
		
	}


