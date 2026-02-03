package objectClasspack;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Program1 implements Cloneable
{
	int no;
	String name;
	
	public Program1(int no, String name) {
		this.no=no;
		this.name=name;
	}

	/*public void add()
	{
		
		
	}
	
	public void displaymethod()
	{
		
	}
	
	//usig hashcode
	public int hashcode()
	{
	return 1;
	}
	
	//equals method
	@Override
	public boolean equals(Object obj)
	{
		Program1 obj1=null;
		boolean result=false;
		if(obj instanceof Program1)
		{
			obj1=(Program1)obj;
		
			if(this.no == obj1.no && this.name == obj1.name)
			{
				result=true;
			}
		}
		return result;
	}

	
   //using toString method
	
	/*public String toString()
	{
	return "Program1 class object ";
	}
	
	//manual created toString
	public String toString()
	{
		Class<?>claz=super.getClass();
		String className=claz.getName();
		int numb=super.hashCode();
		String hexnumber=Integer.toHexString(numb);
		return className+"@"+hexnumber; 
	}
	
	@Override
	protected void finalize()
	{
	System.out.println("this finalize object is destroyed!!");	
	}*/
	
	
	
	//clone method
	protected Object clone()throws CloneNotSupportedException
	{ 
		return super.clone();//it gives 5 in 2 obj
		
		//return.this;//it given shallow copy
	}
	
	@Override
	public String toString()
	{
		
		return "no=" + no+ ", name=" + name;
		
	}
	
	
	
   

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		
		
		
		Program1 obj1=new Program1(5,"jansi");
		
		Program1 obj2=(Program1)obj1.clone();
		
		
		
		//its a deep copy only change in obj1 only
		/*obj1.no=10;
		
		
		
		System.out.println(obj1);
		System.out.println(obj2);*/
		
		
		
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		
		
		
		
		
		/*Program1 obj=new Program1(101,"jansi");
		Program1 obj1=new Program1(101,"jansi");
		
	
		
		
		
		//getclass is return class name and package name
		Class<?> clas=obj.getClass();
        System.out.println(clas.getName()); ;
		
        //getdecalredMethod
        Method  methods[]=clas.getDeclaredMethods();
        for(Method method:methods)
        {        
	    System.out.println(method.getName());//it show method name 
	    System.out.println(method.getModifiers());//it show  access modifier value it created by jvm 
        }
		
		//hashcode
        
        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());
		
		//equals method
        
       System.out.println(obj==obj1); //false
		
		//System.out.println(obj.equals(obj1));//false
		
		System.out.println(obj.equals(obj1));//true
		
		//toString
		
		//System.out.println("using toString:"+obj);
		//System.out.println(obj);
		

        obj=null;
		
		System.gc();*/
		
		
		
		
		
		
		
	}

}
