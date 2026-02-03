package innerclasspackage;

 //interface Anonymousinnerclass 
//class Anonymousinnerclass
abstract class Anonymousinnerclass

{

	
 abstract void add();

	
	
	
	
public static void main(String args[])		
{
	
	
  String a="this is Anonymous inner class";
	Anonymousinnerclass  obj =new Anonymousinnerclass ()
	{
		@Override
		public void add()
		{
			System.out.println(a);
			System.out.println("from a child class called in main method " );
			
		}
		

    };
	obj.add();
}

}

