package TaskPack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

class Employee
{
	int id;
	String name;
	int age;
	double salary;
	
	public Employee(int id, String name, int age, double salary) 
	{
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	   }
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	
	
	
}








@WebServlet("/Task")+

public class TypeContentTask1 extends HttpServlet
{
	
     public  void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
     {
    	 
    	     res.setContentType("application/xml");
    	     PrintWriter out=res.getWriter();
    	    
   
    	     ArrayList<Employee>obj=new ArrayList<>();
    	     obj.add(new Employee(101,"sri",25,30000.00));
    	     obj.add(new Employee(102,"swe",22,25000.00));
    	     obj.add(new Employee(103,"kar",26,21000.00));
    	     obj.add(new Employee(104,"sub",29,31000.00));
    	     obj.add(new Employee(105,"ven",23,32000.00));
    	     obj.add(new Employee(106,"jan",25,40000.00));
    	     obj.add(new Employee(107,"somu",29,50000.00));

    	     out.println("<Employees>");
    	     
    	     for(Employee e :obj)
    	     {
    	    	 out.println("<Employee>");
    	    	    out.println("<id>"+e.id +"</id>");
    	    	    out.println("<name>"+e.name +"</name>");
    	    	    out.println("<age>"+e.age+"</age>");
    	    	    out.println("<salary>"+e.salary +"</salary>");
    	    	    out.println("</Employee>");
    	     }
          out.println("</Employees>");
     }
	

}
