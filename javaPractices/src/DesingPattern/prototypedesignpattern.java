package DesingPattern;



class Empolyee implements Cloneable
{
	private String name;
	private int id;
	
	
	
	public Empolyee(String name, int id)
	{
		
		this.name = name;
		this.id = id;
	}



	@Override
	public String toString() {
		return "Empolyee [name=" + name + ", id=" + id + "]";
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}
	
	
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
		
	}
	
	
}

public class prototypedesignpattern 
{

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Empolyee obj=new Empolyee("jansi",05);
		Empolyee obj2=(Empolyee)obj.clone();
		System.out.println(obj2);
	}

}
