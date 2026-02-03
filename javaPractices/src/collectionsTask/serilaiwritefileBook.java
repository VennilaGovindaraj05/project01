package collectionsTask;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class serilaiwritefileBook {

	public static void main(String[] args)
	{
		File file =new File("C:\\Users\\G.Vennila\\Desktop\\Book.ser");
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file))
		{
			
		}
		

	}

}
