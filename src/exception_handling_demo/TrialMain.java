package exception_handling_demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TrialMain {

	public static void main(String[] args) throws Trial {
		
		File f=new File("abc.txt");
		
		try
		{
			FileInputStream fs=new FileInputStream(f);
		}
		catch(Exception e)
		{
			System.out.println("Exception " +e);
		}
		finally {
			hello();
			System.out.println("File does not exist");
		}


	}
	public static void hello()throws Trial
	{
		int b=20;
		if(b>10)
			throw new Trial("b is out of range");
	}
}
