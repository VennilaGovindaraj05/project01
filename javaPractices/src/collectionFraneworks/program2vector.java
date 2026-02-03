package collectionFraneworks;

import java.util.Vector;
	 
	class Th01 implements Runnable
	{
		Vector<Integer> obj;
		Th01(Vector<Integer> obj)
		{
			this.obj=obj;
		}

		@Override
		public void run() 
		{
			for(int i=0;i<=obj.size();i++)
			{
				for(int j=i+1;j<obj.size();j++)
				{
					if(obj.get(i)>obj.get(j))
					{
						int temp=obj.get(i);
						obj.set(i, obj.get(j));
						obj.set(j, temp);
						
						
					}
					
				}
			}	
		
		System.out.println("The given number was sorted using vector and thread");
		
		}
		
	}
	
	class Th02 implements Runnable
	{

		Vector<Integer> obj;
		 Th02(Vector<Integer> obj)
		{
			this.obj=obj;
		}
		@Override
		public void run() {
			System.out.println(obj);
		}
		
	}
	
	
	
	public class program2vector
	{
	
	public static void main(String[] args)
	{
		Vector<Integer> arr=new Vector<>();
		arr.add(19);
		arr.add(18);
		arr.add(13);
		arr.add(11);
		arr.add(15);
		arr.addElement(17);
		arr.add(12);
		arr.add(14);
		arr.addElement(16);
	
		Th01 obj=new Th01(arr);
		Thread thread1=new Thread(obj);
		thread1.start();
		
		Th02 obj1=new Th02(arr);
		Thread thread2=new Thread(obj1);
		thread2.start();
		

		
	}

}
