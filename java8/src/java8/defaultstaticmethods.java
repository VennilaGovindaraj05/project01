package java8;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;



//functinal interface deafult and staric methods

public class defaultstaticmethods 
{

	public static void main(String[] args) 
	{
		
		//defult 1.and();
		
		Predicate<Integer>f1=(x)-> x > 0;//5>0->true
		Predicate<Integer>f2=(x)-> x > 5;//5>4->false
		Predicate<Integer>res=f1.and(f2);//t && f
		Predicate<Integer>res1=f1.or(f2); 
		System.out.println(res.test(5));//false
	
		//2 . or()
		System.out.println(res1.test(5));

		//3.negate() 
        Predicate<Integer>v=(x)->x == 6;// 6==6
       Predicate<Integer> res2=  v.negate();
		System.out.println(res2.test(6));//given oposite answer t ->false return
		
		//static method
		//check content return trur or false
		 Predicate<String>res3=Predicate.isEqual("hello");
		 System.out.println(res3.test("hello"));
		
		
		//2.function default method
		
		 //1.andThen()
		 
		 Function<String,String> f=(x)->x +"1";
		 Function<String,String> ff=(x)->x +"2";
		
		 Function<String,String> funres=f.andThen(ff);
		 
		 Function<String,String> funres1=ff.andThen(f);
		 
		 System.out.println(funres.apply("java"));
		 System.out.println(funres1.apply("core"));
		 
		 
		 //2.compose
		 
		 Function<Integer,Integer> s=(x)-> x + 1;//7+1=8
		 Function<Integer,Integer> s1=(x)->x +2;//8+2=10
		 
		 Function<Integer, Integer> funresu= s.compose(s1);
		 System.out.println(funresu.apply(7));
		
		 //static method
		 //identity()
		 
		Function<String,String> h=Function.identity();
		System.out.println(h.apply("hello world"));
		
		
		//3.Consumer
		
		Consumer<String> con1=(x)->System.out.println(x + "1");
		Consumer<String> con2=(x)->System.out.println(x + "2");
		
		Consumer<String> result=con1.andThen(con2);
		result.accept("hello");
		
		
		//UnaryOperator
		
		UnaryOperator<String> uo=(x)->x+ "core ";
		UnaryOperator<String> uo1=(x)-> x +"java";
		
		Function<String,String> uo3=uo.andThen(uo1);
		
		System.out.println(uo3.apply("it was a subject  "));
		
		
		//BiPredicate
		
		//default methods
		BiPredicate<Integer,Integer>bp=(x,y)-> x>y ;//1>2->false
		BiPredicate<Integer,Integer>bp1=(x,y)-> x<y ;//1<2->true
		
		BiPredicate<Integer,Integer>bpres=bp.and(bp1);//false&true
		System.out.println(bpres.test(1, 2));//false
		
		//or
		BiPredicate<Integer,Integer>bpres1=bp.or(bp1);
		System.out.println(bpres1.test(1, 2));//true
		
		//negate
		BiPredicate<Integer,Integer>bp2=(x,y)-> x==y;//12==12 ->true
		BiPredicate<Integer,Integer>bpres22=bp2.negate();
		System.out.println(bpres22.test(12, 12));//false
		
		
		
		
		//BiFunction
		
		//default 
		//and then
	
		
		BiFunction<Integer,Integer,Integer>bf=(x,y)->x+y;//2+4=6
		Function<Integer,Integer>bf1=(x)->x*2;//6*2
        BiFunction<Integer,Integer,Integer> resultt=bf.andThen(bf1);
		System.out.println(resultt.apply(2, 4));//12
		
		
		
		//BiConsumer
		
		//default method
		
		//andThen
		BiConsumer<String,Integer>bicon=(x,y)->System.out.println("my name is  :" +x);
		BiConsumer<String,Integer>bicon1=(x,y)->System.out.println("my age was  :" +y);
		
		bicon.andThen(bicon1).accept("jansi",2);
		
		
		
		
		
		//BinaryOperator//static method ->minBy() ->maxBy()
		
		Comparator<Integer>com=new Comparator<Integer>()
		{

			@Override
			public int compare(Integer o1, Integer o2) {
	
				return o1-o2;
			}
			
		};
		
		
      //  minBy()
		BinaryOperator<Integer> bores=BinaryOperator.minBy(com);
		int resss=bores.apply(2, 3);
		System.out.println(resss);//min-2
		
		
		
		//maxBy()
		BinaryOperator<Integer> bores1=BinaryOperator.maxBy(com);
		int resss1=bores1.apply(2, 3);
		System.out.println(resss1);//max-3
		
		
		
		
		
		
		
	}

}
