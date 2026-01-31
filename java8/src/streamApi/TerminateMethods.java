package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TerminateMethods 
{
	public static void main(String[] args) 
	{
        //terminate methods
		//1.to.list()-> return list<String>
		
		//string 
		List<String>list=new ArrayList<>(List.of("hello","world","java"));
		List<String> resu = list.stream()
		.map((x)->x.toUpperCase())
		.toList();
		System.out.println(resu);
		
		
		//using integer
		List<Integer>listt=new ArrayList<>(List.of(2,6,9,10,4,5,8,1));
		
		List<Integer> result =listt.stream()//convert stream //and final tolist used get the list<Integer>
		.filter((x)->x%2==0)
		.toList();
		
		 System.out.println(result);
		
		//2.min()->pass comparator object ->rreturn optinal class
		 
		 ArrayList<Integer>arr=new ArrayList<>(List.of(8,7,5,1,10,3,2));
		 
		 Integer minvalue = arr.stream()
		 .min((a,b)->a-b)
		 .get();
		 System.out.println("get min values :"+minvalue);
		 
		 
		//3.max()->pass comparator object ->rreturn optinal class
		 
		 Integer maxvalue = arr.stream()
				 .max((a,b)->a-b)
				 .get();
				 System.out.println("get max values :"+maxvalue);
		
		
		//4.findfirst()->return first min value
				 
				 Integer findfirt=arr.stream()
						 //.sorted()->given sorted it given i
						 .findFirst()//using like this given 8 list first value return
						 .get();
						 
						 System.out.println("findFirst used find min value : "+findfirt);
		
		
		//5.findAny()
				
						 Integer findany=arr.stream()
                                 // .parallel() ->using this return random number 								
								 .findAny()//used this retuen sequential number
								 .get();
						 System.out.println("findany used used find max value :" +findany);
						 
		//6.count()
						 
						 
						Long i=list.stream()
						.map((x)->x.length()).count();
					
		System.out.println(i);//given string count
		
		
		//7.reduce()
		//sum of the the list value
		             Integer sum= listt.stream()
		              .reduce(0, (x,y)->x+y);
                    System.out.println(sum);//45
                  
         //using string :           
                    
                   String st= list.stream()
                    .reduce("", (x,y)->x+" "+y);
                    System.out.println(st);
		
		
		//8.allMathch()->and operator
                    //8,7,5,1,10,3,2
                    List<Integer>arrr=new ArrayList<>(List.of(1,3,4,6,8,9,2));
               boolean re=arrr.stream()
               .allMatch((v)->v%2==0);//ellam condition um true ah irukanum apo dhan true ilana false
               System.out.println(re);//false 
              
		
		//9.anyMatch()->or operator
               
               List<Integer>a=new ArrayList<>(List.of(1,3,4,6,8,9,2));
                boolean resultt=   a.stream()
                   
                		.anyMatch((s)->s%2==0);
                   
                      System.out.println(resultt);
            		   
                      
           //10.noneMatch()->not operator
                      
                      List<Integer>aa=new ArrayList<>(List.of(1,3,4,6,8,2));
                      boolean resulttt =    aa.stream()
		                .noneMatch((c)->c%9==0);
		                System.out.println(resulttt);
		                
		
		   //11.toArray() 
		                //sttream conver to arraylike Object[] it waas a common type
		                //so we change anychanges in string type
		         Object[] array= Stream.of("A","B","C","D","E")	
		          .toArray();
		          
		          System.out.println(Arrays.toString(array));
		          
		          //can't downcast like this
		          //String s=(String)array;
		          
		          
		          
		   //convert string []
		          
		          for(Object ob:array)
		          {
		        	      String ch=(String)ob;
		        	      String lower= ch.toLowerCase();  
		        	      System.out.println(lower);
		          }
		          System.out.println(Arrays.toString(array));  
		                
		                
		   //12.toArrays(IntFunction)
		          
		     String[] to= Stream.of("S","L","O","P","T")
		    		 .sorted()
		    		 
		      .toArray((x)->new String[x]);
		     
		     
		      System.out.println(Arrays.toString(to));
		                
		                
		                
		                
		                
		                
		                
		                
		                
		                
		                
		                
		                
		                
	}

}
