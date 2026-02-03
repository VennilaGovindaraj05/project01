package Wrapperclass;


class Calculator<T extends Number>
{
	
	public T add(T x,T y)
	{
		Integer a= x.intValue();
		Integer b= y.intValue();
		Integer res=a+b;
		
		return (T)res;
	}
	
	
	public T sub(T x ,T y)
	{
		Integer a=x.intValue();
		Integer b=y.intValue();
		Integer res1=a-b;
		return (T)res1;
		
	}
	
   public Float mul(T x,T y)
   {

		Float a=x.floatValue();
		Float b=y.floatValue();
		Float res2=a*b;
		return res2;   
	  
   }

   public Double div(T x ,T y)
   {
	   Double a=x.doubleValue();
	   Double b=y.doubleValue();
	   Double res3=a/b;
	  return res3;  
   }

}




public class Task01 {

	public static void main(String[] args)
	{
		Calculator<Integer> obj=new Calculator<>();
		System.out.println("---Generic Calculator ---");
		
		Integer res=obj.add(101, 50);
        System.out.println("1. Addition: "  +res);
      
        Integer res1=obj.sub(50, 18);
        System.out.println("2. Subtraction :"+res1);
      
        Float res2=obj.mul(10,5);
        System.out.println("3. Multiplication :"+ res2);
        
        Double res3=obj.div(12345, 2);
        System.out.println("4. Division :" +res3);
        
        
        
	}

}
