package streamApi;

import java.util.stream.Stream;

/*stream static methods

*empty()
*iterate()
*generate()
*of()
*/

public class staticmethods
{
	public static void main(String[] args)
	{
		
	           Stream<String> s=	Stream.empty();
		       s.forEach(System.out::println); //create pipeline only
		
		       Stream<Integer> s1=Stream.iterate(0, (i)->i+1).limit(10);
		       s1.forEach(System.out::println);
		
		       Stream<String> s2=Stream.generate(()->"hello").limit(10);
		       s2.forEach(System.out::println);
		
		      Stream<String> s3=Stream.of("program","world","java","core");
		      s3.forEach(System.out::println);
		
		
	}

}
