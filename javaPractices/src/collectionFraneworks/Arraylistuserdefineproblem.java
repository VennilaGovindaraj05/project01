package collectionFraneworks;

import java.util.ArrayList;
import java.util.List;


class Empolye
{
	String name;
	int age;
	String department;
	Integer salary;
	
	public Empolye(String name, int age, String department, Integer salary) {
		super();
		this.name = name;
		this.age = age;
		this.department = department;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return " [name=" + name + ", age=" + age + ", department=" + department + ", salary=" + salary + "]";
	}
	
	
	
	
	
}


public class Arraylistuserdefineproblem 
{
	public static void main(String[] args) 
	
	{
		 List<Empolye>user=new ArrayList<>();
			
		 user.add(new Empolye("A",26,"HR",30000));
		 user.add(new Empolye("G",29,"testing",38000));
		 user.add(new Empolye("V",24,"HR",21000));
		 user.add(new Empolye("J",30,"HR",25000));
		 user.add(new Empolye("E",25,"testing",31000));
		 user.add(new Empolye("P",27,"HR",20000));
		 
		 System.out.println(user);
		
		 //get name and age only print
		 
		 for(Empolye e :user)
		 {
			 System.out.println(e.getName() + "  " + e.getAge());
		 }
		 
		//get high salary
		 
		 Empolye max=user.get(0);//
		
		 for(Empolye e :user)
		 {
			 if(e.salary > max)
			 {
				 max=e;
			 }
		 }
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
