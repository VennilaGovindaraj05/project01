package collector;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

class Employee03
{
	 String name;
	   Integer age;
	   Long salary;
	   List<String>skills;
	   LocalDate joningDate;
	   LocalDate revlivingDate;
	   public Employee03(String name, Integer age, Long salary, List<String> skills, LocalDate joningDate,
			LocalDate revlivingDate) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.skills = skills;
		this.joningDate = joningDate;
		this.revlivingDate = revlivingDate;
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
	   @Override
	   public String toString() {
		return "[name=" + name + ", age=" + age + ", salary=" + salary + ", skills=" + skills
				+ ", joningDate=" + joningDate + ", revlivingDate=" + revlivingDate + "]";
	   }
	
	   
	   
}










public class Task07 
{
	public static void main(String[] args)
	{
		List<Employee03> employees = List.of(

			    new Employee03(
			        "Arun", 25, 45000L,
			        List.of("Java", "Spring", "MySQL"),
			        LocalDate.of(2021, 1, 10),
			        LocalDate.of(2023, 6, 30)
			    ),

			    new Employee03(
			        "Divya", 28, 50000L,
			        List.of("Python", "Django", "PostgreSQL"),
			        LocalDate.of(2020, 3, 15),
			        LocalDate.of(2024, 2, 20)
			    ),

			    new Employee03(
			        "Karthik", 30, 20000L,
			        List.of("Java", "Microservices", "AWS"),
			        LocalDate.of(2019, 7, 1),
			        LocalDate.of(2025, 1, 31)
			    ),

			    new Employee03(
			        "Meena", 24, 30000L,
			        List.of("HTML", "CSS", "JavaScript"),
			        LocalDate.of(2022, 8, 5),
			        LocalDate.of(2024, 5, 15)
			    ),

			    new Employee03(
			        "Suresh", 35, 32000L,
			        List.of("Java", "Spring Boot", "HTML"),
			        LocalDate.of(2016, 11, 20),
			        LocalDate.of(2025, 12, 31)
			    ),

			    new Employee03(
			        "Priya", 27, 25000L,
			        List.of("HTML", "css", "Python"),
			        LocalDate.of(2021, 4, 12),
			        LocalDate.of(2023, 9, 30)
			    ),

			    new Employee03(
			        "Vijay", 32, 35000L,
			        List.of("React", "NodeJS", "MongoDB"),
			        LocalDate.of(2018, 6, 18),
			        LocalDate.of(2024, 11, 10)
			    ),

			    new Employee03(
			        "Anitha", 29, 49000L,
			        List.of("Angular", "TypeScript", "Java"),
			        LocalDate.of(2020, 2, 1),
			        LocalDate.of(2024, 7, 25)
			    ),

			    new Employee03(
			        "Rahul", 26, 38000L,
			        List.of("Java", "Springboot", "Oracle"),
			        LocalDate.of(2022, 1, 10),
			        LocalDate.of(2023, 12, 31)
			    ),

			    new Employee03(
			        "Sneha", 34, 41000L,
			        List.of("Data Science", "Python", "ML"),
			        LocalDate.of(2017, 9, 5),
			        LocalDate.of(2025, 6, 30)
			    )
			);

		employees.stream()
		.collect(Collectors.groupingBy((x)->x.getSkills(), null))
		
	}

}
