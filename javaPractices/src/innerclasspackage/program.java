package innerclasspackage;

public class program//outer class

{
private int id;
private String name;
private String dept;
int password=123;

//local(method)Inner class
void add()
{
	class LocalInnerclass
	{
		
		int x=10;
		
		LocalInnerclass()
		{
			System.out.println("localclass constructor ");
		}
		
		void display()
		{
			System.out.println("display method in lc ");
		}
	}
	
	LocalInnerclass lc=new LocalInnerclass();
	lc.display();		

}


//instances to static created object
//static to static no need to create object

//static method
static class StaticInnerClass//inner class
{

public StaticInnerClass()//static constructor
{
	System.out.println("this is constructor");
}


void nonstaticmethod()
{
	System.out.println("this is non static(instances method) ");
}

static void staticmethod()//static method
{
	
	System.out.println("this is non static method ");
}


}


//non-static method
//instance to instance no needto created object

class InnerClass//inner class //outer class program
{
	
	void display()
	{
	System.out.println("this is non  static inner class method ");
	System.out.println("Password:"+password);
	
	}
	

	
}



	public static void main(String[] args) 
	
	{
		
		//1.static inner class
		program.StaticInnerClass obj=new program.StaticInnerClass();
		obj.nonstaticmethod();//instance calling
		
		program.StaticInnerClass.staticmethod();//static calling
		

		//2.non static inner class
		program out=new program();
		program.InnerClass OBJ=out.new InnerClass();
		OBJ.display();
		
		
		program localmethod=new program();
		localmethod.add();
		
		
		
	}

}
