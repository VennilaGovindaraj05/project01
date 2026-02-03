package Wrapperclass;


// where to  use generics ?
//1.class level -> used instance 

//bound->use this <t> and given that type<Integer>

class Program <T>
{
	

public T method1(T x,T y)
{
	Integer res;
	return T;
	
	
}



}

//2.method level ->used static 

class Program1 
{
	public static <T extends Number> void printvalues(T t)
	{
		System.out.println(t);
	}
	
	
	
	
}


//upper bound -> extends AND given specific type was  


class program2 <T extends Number>
{
	
	public Float add(T x,T y)
	{
		Float a= x.floatValue();
		Float b= y.floatValue();
		Float res=a+b;
		return res;
		
	}
	
	
	
}


class program3
{
	
	public static Object addd(Integer x,Integer y)
	{
		Integer res1=x+y;
		
		return res1;
		
	}
	
}







public class Program03 
{
	public static void main(String[] args) 
	{
		Program<Integer> obj=new Program<>();
		 Integer  x=obj.method1(1,2);
	  System.out.println(x);

	  
	 // method level ->static method used
	  
	  Program1.printvalues(1234);
	  
	  
	  
	  
	  //upperbound
	  
	  //return float value and value assing was integer
	  
	program2<Integer> obj2=new program2<>();
      Float res =  obj2.add(12,5);
	System.out.println(res);
	
	
	
	//object 
	
	program3 obj3=new program3();
	/*Object obj4=obj3.add(4, 2);
	Object obj5=obj3.add(2, 1);
	//System.out.println(obj4+obj5);*/
	
	
	Integer res2=(Integer)obj3.addd(2, 5);
//	Integer res1=(Integer)obj3.add(5, 5);
	System.out.println(res);
	
	}

}
