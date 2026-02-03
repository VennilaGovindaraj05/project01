package Wrapperclass;


//converting primitive to non primitive datatype
// its called boxing it have 2 type(1. manual 2. autoboxing)
//UNBOXING (converting non-primitive to primitive)(its have 1.manual 2.autoboxing)

public class program01
{

	public static void main(String[] args) 
	{
	//boxing
	
	//1.manuval	
	int a=05;
	Integer b=Integer.valueOf(a);
	System.out.println(a+"converting primitive to non-primitive using manual");
		
			
		
	//2.auto boxing
	 int x=10;
	 Integer y=x;
	 System.out.println(y  +"converting primitive to non-primitive using auto boxing");
	 
	 
	 //unboxing
	 //1.manual
	 Integer s=25;
	 int v=s.intValue();
	 System.out.println(v  +"converting non-primitive to primitive using unboxing 1.manual type");
	 
	 //2.autotype
	 
	 Integer c=30;
	 int d=c;
	 System.out.println(d  +"converting non-primitive to primitive using unboxing 2.autoboxing type");
	 
	 
	//constant value
	
	 System.out.println(Integer.MIN_VALUE);
	 
	 
	 
	 

	}

}
