package collector;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

class Emplyoyee02
   {
	   String name;
	   Integer age;
	   Long salary;
	   String department;
	   List<String>skills;
	   LocalDate joningDate;
	   LocalDate revlivingDate;
	
	   
	   
	   
	   
	   public Emplyoyee02(String name, Integer age,String department, Long salary, List<String> skills, LocalDate joningDate,
			LocalDate revlivingDate) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.skills = skills;
		this.joningDate = joningDate;
		this.revlivingDate = revlivingDate;
		this.department = department;
	   }
	

	   @Override
	public String toString() {
		return "Emplyoyee02 [name=" + name + ", age=" + age + ", salary=" + salary + ", department=" + department
				+ ", skills=" + skills + ", joningDate=" + joningDate + ", revlivingDate=" + revlivingDate + "]";
	}


	   public String getName() {
		   return name;
	   }


	   public void setName(String name) {
		   this.name = name;
	   }


	   public Integer getAge() {
		   return age;
	   }


	   public void setAge(Integer age) {
		   this.age = age;
	   }


	   public Long getSalary() {
		   return salary;
	   }


	   public void setSalary(Long salary) {
		   this.salary = salary;
	   }


	   public String getDepartment() {
		   return department;
	   }


	   public void setDepartment(String department) {
		   this.department = department;
	   }


	   public List<String> getSkills() {
		   return skills;
	   }


	   public void setSkills(List<String> skills) {
		   this.skills = skills;
	   }


	   public LocalDate getJoningDate() {
		   return joningDate;
	   }


	   public void setJoningDate(LocalDate joningDate) {
		   this.joningDate = joningDate;
	   }


	   public LocalDate getRevlivingDate() {
		   return revlivingDate;
	   }


	   public void setRevlivingDate(LocalDate revlivingDate) {
		   this.revlivingDate = revlivingDate;
	   }






//	   @Override
//	   public int hashCode() {
//		
//		return Objects.hash(this.name,this.age,this.salary,this.joningDate,this.revlivingDate,this.skills);
//	   }
//
//
//
//	   @Override
//	   public boolean equals(Object obj)
//	   {
//	      
//		  if(obj instanceof Emplyoyee02)
//		  {
//			  Emplyoyee02 emp=(Emplyoyee02)obj;
//			  if(this.hashCode()==obj.hashCode())
//			  {
//				  return true;
//			  }
//		  }
//		   
//		   
//		return false;
//	   }
//	   
	   
	   
   }


public class Task06 
{
	public static void main(String[] args) 
	{
		
		
		List<Emplyoyee02> employees = List.of(

			    new Emplyoyee02(
			        "Arun", 25, "softwaredeveloper",45000L,
			        List.of("Java", "Spring", "MySQL"),
			        LocalDate.of(2021, 1, 10),
			        LocalDate.of(2023, 6, 30)
			    ),

			    new Emplyoyee02(
			        "Divya", 28,"testing", 30000L,
			        List.of("Python", "Django", "PostgreSQL"),
			        LocalDate.of(2020, 3, 15),
			        LocalDate.of(2024, 2, 20)
			    ),

			    new Emplyoyee02(
			        "Karthik", 30,"softwaredeveloper", 20000L,
			        List.of("Java", "Microservices", "AWS"),
			        LocalDate.of(2019, 7, 1),
			        LocalDate.of(2025, 1, 31)
			    ),

			    new Emplyoyee02(
			        "Meena", 24,"frontend", 25000L,
			        List.of("HTML", "CSS", "JavaScript"),
			        LocalDate.of(2022, 8, 5),
			        LocalDate.of(2024, 5, 15)
			    ),

			    new Emplyoyee02(
			        "Suresh", 35, "testing",32000L,
			        List.of("Java", "Spring Boot", "HTML"),
			        LocalDate.of(2016, 11, 20),
			        LocalDate.of(2025, 12, 31)
			    ),

			    new Emplyoyee02(
			        "Priya", 27, "frontend",29000L,
			        List.of("HTML", "css", "Python"),
			        LocalDate.of(2021, 4, 12),
			        LocalDate.of(2023, 9, 30)
			    ),

			    new Emplyoyee02(
			        "Vijay", 32, "backend",25000L,
			        List.of("React", "NodeJS", "MongoDB"),
			        LocalDate.of(2018, 6, 18),
			        LocalDate.of(2024, 11, 10)
			    ),

			    new Emplyoyee02(
			        "Anitha", 29, "softwaredeveloper",49000L,
			        List.of("Angular", "TypeScript", "Java"),
			        LocalDate.of(2020, 2, 1),
			        LocalDate.of(2024, 7, 25)
			    ),

			    new Emplyoyee02(
			        "Rahul", 26, "backend",38000L,
			        List.of("Java", "Springboot", "Oracle"),
			        LocalDate.of(2022, 1, 10),
			        LocalDate.of(2023, 12, 31)
			    ),

			    new Emplyoyee02(
			        "Sneha", 34, "ai",50000L,
			        List.of("Data Science", "Python", "ML"),
			        LocalDate.of(2017, 9, 5),
			        LocalDate.of(2025, 6, 30)
			    ),
			    
			    new Emplyoyee02(
				        "Anitha", 29, "frontend",30000L,
				        List.of("Angular", "TypeScript", "Java"),
				        LocalDate.of(2020, 2, 1),
				        LocalDate.of(2024, 7, 25)
				    )
				
				);

		
		
		//TASK
		
		
		//1.department wise highest salary member name print 
		
		Comparator<Emplyoyee02>com=new Comparator<>()
				{

					@Override
					public int compare(Emplyoyee02 o1, Emplyoyee02 o2) {
						
						return (int) (o1.salary-o2.salary);
					}
			
				};
		//[40-vijay]
		
		Map<Object, Object> res1=employees.stream()
        .collect(Collectors.groupingBy((x)->x.getDepartment(),Collectors.collectingAndThen(Collectors.maxBy(com), (x)->x.get().getName())));
		System.out.println(res1);
		
		
		//2.highest age in the overall department
		Comparator<Emplyoyee02>com1=new Comparator<>()
		{

			@Override
			public int compare(Emplyoyee02 o1, Emplyoyee02 o2) {
				
				return o1.age-o2.age;
			}
	
		};
	
		
		 String map2=employees.stream()
	     .collect(Collectors.collectingAndThen(Collectors.maxBy(com1), (x)->x.get().getName()));   
		 System.out.println(map2);
		
		
		 
		 
		 

		     	//remove duplicates in list 	
				Set<Emplyoyee02> res=employees.stream()
				.distinct().collect(Collectors.toSet());
				System.out.println(res);
			
				
				//emplyyoee name length
				
				System.out.println("Employee name using length print :");
				Map<Object, List<Emplyoyee02>> list=employees.stream()
				.collect(Collectors.groupingBy((x)->x.getName().length(), Collectors.toList()));	
				System.out.println(list);
				
		 
		 
		 
		        //salray based 
				
				 Map<Boolean, List<String>> resu3=employees.stream()
				.collect(Collectors.partitioningBy((x)->x.getSalary() > 40000, Collectors.mapping((x)->x.getName(), Collectors.toList())));
		         System.out.println(resu3);
		 
		        //skills only stored in list
		        List<String> resu4= employees.stream()
		         .collect(Collectors.flatMapping((x)->x.getSkills().stream(),Collectors.toList()));
		     // String//  .collect(Collectors.flatMapping((x)->x.getSkills().stream(),Collectors.joining(",", "{", "}")));

		         System.out.println(resu4);
		 
		 
		      //skills all re print in uppercase
		         employees.stream()
		        .flatMap((x)->x.getSkills().stream()).map((x)->x.toUpperCase())
		        .forEach((x)->System.out.println(x));
		         
		        
		 
		 
		 
		 
		 
		 
		 
		 
		
		
	}

}
