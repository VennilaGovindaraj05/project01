package java8;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator
java.util.function.Predicate;


//1 generics 

//interface C<T>
//{
//	void add();
//}
//
//interface D<T> extends C<Integer>
//{
//	void add();
//}
//
//class Prog implements D<String>
//{
//
//	@Override
//	public void add() {
//		
//		
//	}
//	
//}




//2 generics used :
//@FunctionalInterface
//interface A<T,R>
//{
//     R add(T t);
//}
//
//@FunctionalInterface
//interface B<T,R>extends A<T,R>
//{
//      R add(T t);
//}
//
//class imple implements B<String,Integer>
//{
//
//	@Override
//	public Integer add(String t) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//}









//PRE-DEFINE (FUNCTONAL INTERFACE)

//1.predicate

//interface Predicate<T >
//{
//	boolean test(T t);
//	
//}
//
//interface Consumer<T>
//{
//	void accept(T t);
//
//	void accept(Object t);
//
//	
//}


public  class FUNINTERpredefinemethods 
{

//predicate
	
//	public static boolean filter(Predicate<String>obj)
//	{
//		//return obj.test("vennilA"); true
//		return obj.test("START");//false	
//	}
//	
//	
//	public static void accept(Consumer<Integer> consumer)
//	{
//		consumer.accept();
//	}
//	
	
	
	public static void main(String[] args) 
	{
		
//		Predicate<String> obj=new Predicate<>()
//		{
//
//			@Override
//			public boolean test(String t) 
//			{
//				
//				return t.endsWith("w");
//			}
//		};
		
//	 System.out.println(filter(obj));
		
		
		
//		
//		Predicate<Integer> obj=new Predicate<>()
//		{
//
//			@Override
//			public boolean test(Integer t) {
//				
//				return t % 2 == 0;
//			}		
//				};
//	
//	
//	 Consumer<Integer> consumer=new Consumer<>()
//	  {
//
//		@Override
//		public void accept(Integer t) 
//		{
//			System.out.println(t);	
//		}
//	  };
//	  
//	
//	Arrays.asList(1,3,5,6,2,8,10)
//	.stream()
//	.filter(obj)
//	.forEach(consumer);
	  
	  
	  
	 Supplier<String> supply=new Supplier<String>()
	 {

		@Override
		public String get() {
			
			return "hello";
		}
	    };
	    System.out.println(supply.get());
	  
	  //Stream.generate()
	  //forEach(consumer);
	  
	  Function<Integer,String> fun=new Function<Integer,String>()
	  {

		@Override
		public String apply(Integer t) {
			String st="the value is:"+t;
			return st;
		}
		  
	  };
	  
	  System.out.println(fun.apply(15));
	  
	  UnaryOperator<Integer>uo=new UnaryOperator<Integer>()
	  {

		@Override
		public Integer apply(Integer t) 
		{
			
			return null;
		}
		  
	 };
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	}
	

}
