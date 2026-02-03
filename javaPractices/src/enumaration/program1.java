package enumaration;

import java.io.PrintStream;
import java.util.Arrays;

public class program1 
{

	public static void main(String[] args) 
	{
		System.out.println(connectons.CONTINUE.getstatuscode());//it return getstatuscode like continue value rturn
		
		
		System.out.println(connectons.INTERNALSEVERERROR);
		System.out.println(connectons.PAGENOTFOUND.getstatuscode());
		
		//methods used enum
		
	    //sample.METHOD.add();	
		
		//ENUM METHODS
		
		program[] arr=program.A.values();
		System.out.println(Arrays.toString(arr));
		
		System.out.println(program.valueOf("B"));
		
		System.out.println(program.D.ordinal());
		System.out.println(program.B.name());
		
		System.out.println(program.A.equals(program.B));
		System.out.println(program.B.compareTo(program.D));
		
		Class<program> claz=program.A.getDeclaringClass();
		System.out.println(claz);
		
		

	}

}
