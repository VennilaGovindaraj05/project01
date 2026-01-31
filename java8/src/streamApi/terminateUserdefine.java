package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

class Students
{
	String name;
	int regno;
	String deptName;
	int schlFees;
	public Students(String name, int regno, String deptName, int schlFees) {
		super();
		this.name = name;
		this.regno = regno;
		this.deptName = deptName;
		this.schlFees = schlFees;
	}
	@Override
	public String toString()
	{
		return " [name=" + name + ", regno=" + regno 
				+ ", deptName=" + deptName 
				+ ", schlFees=" + schlFees
				+ "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getSchlFees() {
		return schlFees;
	}
	public void setSchlFees(int schlFees) {
		this.schlFees = schlFees;
	}

	
	
}




public class terminateUserdefine
{ 
	public static void main(String[] args)
	{
		
		ArrayList<Students>arr=new ArrayList<>();
		arr.add(new Students("max",101,"computersciences",25000));
		arr.add(new Students("harry",102,"computersciences",25000));
		arr.add(new Students("dora",103,"freeclass",10000));
		arr.add(new Students("alice",104,"computersciences",25000));
		arr.add(new Students("park",105,"arts",17000));
		arr.add(new Students("jk",106,"arts",20000));
		arr.add(new Students("v",107,"arts",18000));
		
		//sorted by min() using orelsethrow
		
//		try {
//		Students minvalues=arr.stream()
//		.min((x,y)->x.getSchlFees()-y.getSchlFees())
//		.orElseThrow(()->{throw new RuntimeException("Runtime Exception try again!!");});
//		
//		System.out.println(minvalues);
//		}
//		catch(RuntimeException e)
//		{
//			System.out.println(e.getMessage());
//		}
		
		//sorted by min
		
		Optional<Students> minvalues = arr.stream()
				
		.min((x,y)->x.getSchlFees()-y.getSchlFees());
		
		System.out.println(minvalues);
		
		
		//students count
		long l=arr.stream()
		.map((x)->x.getName())
		.count();
		System.out.println("students count :"+l);
		
		
		System.out.println("numbers using array");
	
		ArrayList<Integer>list1=new ArrayList<>(List.of(1,2,3,4,5));
		ArrayList<Integer>list2=new ArrayList<>(List.of(6,7,8,9,10));
		
		ArrayList<ArrayList<Integer>>list3=new ArrayList<>();
		
		list3.add(list1);
		list3.add(list2);
		
		System.out.println(list3);
		
		
		//reversed the value
	      list3.stream()
	        
	     .map((x)->x.reversed())
	    .flatMap((x)->x.stream())
	    .forEach(System.out::println);
	   //.toList();
	
	  //System.out.println(result);
	
		
		
		ArrayList[]list =Stream.of(1,3,5,6,8,2,10)
		
		.toArray((x)->new ArrayList[x]);
		System.out.println(Arrays.toString(list));
		
		
	}

}
