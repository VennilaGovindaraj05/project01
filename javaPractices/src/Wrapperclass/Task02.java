package Wrapperclass;

class Task<T extends Number, R extends Number>
{
	
	public T method1(R x , R y)
	{
		Integer res=x.intValue()+y.intValue();	
		
		return (T)res;
	}
	//sub
	public T method2(R x,R y)
	{
	
		Double res1=x.doubleValue()-y.doubleValue();		
		
		return (T)res1;
		
	}
	
	public T method3(R x, R y)
	{
		
		Byte res2=(byte) (x.byteValue()*y.byteValue());
		return(T)res2;
	}
	
	

	//divison
	public T method4 (R x ,R y)//R->RETURN long //T->double taken
	{
		Long res3= (x.longValue()/y.longValue());
		
		return(T)res3;
	}

	




}







public class Task02 {

	public static void main(String[] args) 
	{
		
      Task<Integer,Float> obj=new Task<>();
     Integer res=obj.method1(10.0F,4.0F);//get integer
      System.out.println(res);
      
      Task<Double,Integer>obj1=new Task<>();
      Double res2=obj1.method2(10, 5); //answer get double
      System.out.println(res2);
      
      Task<Byte,Double> obj2=new Task<>();
      Byte res3=obj2.method3(20.0, 4.0);//get byte
      System.out.println(res3);
      
      
      
      Task<Long,Double>obj3=new Task<>();
      Long res1=obj3.method4(145745.0, 7.0);//get long
      System.out.println(res1);
      
     

	}

}
