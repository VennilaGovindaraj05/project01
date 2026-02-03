package TaskPack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

class Employe
{
	int id;
	String name;
	int age;
	
	
	public Employe(int id, String name, int age) 
	{
		
		this.id = id;
		this.name = name;
		this.age = age;
		
	   }
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	
	
	
}




@WebServlet("/task2")              
public class TypeContentJSON extends HttpServlet
{
	private ArrayList<Employe>emp=new ArrayList<>();
	
	public void load()
	{
		this.emp=new ArrayList<>(Arrays.asList(new Employe(101,"raja",28),
				new Employe(102,"jasni",21),
				new Employe(103,"jamuna",24),
				new Employe(104,"yamuna",29),
				new Employe(105,"kaveri",22)

				));

	}
	
	
	
	public void doGet(HttpServletRequest req ,HttpServletResponse res) throws IOException
	{
		load();//method called
		
		StringBuilder jsonres=new StringBuilder("employe : [ ");
		
		int last =emp.size()-1;
		
		for(int i=0;i<emp.size();i++)
		{
			Employe em=emp.get(i);
		String line=String.format("{\"id\" :\"%d\" , \"name\" : \"%s\" ,\"age\" : \"%d\"   }" ,em.getId(),em.getName(),em.getAge());
		
		
		
		if(i == last)
		{
			jsonres.append(line);
			
		}
		else {
			
			jsonres.append(line).append(",");
			
		}
		
		
		}
		
		String response=jsonres.toString();
		res.setContentType("application/json");
		PrintWriter out =res.getWriter();
		out.println(response);
	}


	
	
	
	
	
	
	
	
	
	
	
	
	z
	
	
	
	

}
