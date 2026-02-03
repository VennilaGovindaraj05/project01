package Wrapperclass;

class Arrayusinggeneric<R extends Number>
{
	R[]  arr;
	
	
	public Integer findTotal(R[]arr)
	{	
		int total=0;
		
		for(R i:arr)
		{
		  total+=i.intValue();
		}
		return total;
	}	
}


public class Task03 {

	public static void main(String[] args)
	{
		Integer[] arr=new Integer[]{3,5,9,6,7,3,5};
		Arrayusinggeneric<Integer> obj=new Arrayusinggeneric<>();
		Integer result =obj.findTotal(arr);
		System.out.println(result);

	}

}
