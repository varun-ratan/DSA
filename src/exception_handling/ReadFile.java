package exception_handling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//File f=new File()
		try {
			Scanner sc=new Scanner(new File("a.txt"));    //I have saved this file in the root directory of DSA project
			while(sc.hasNext())
			{
				System.out.println(sc.nextLine());
			}
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}

	}

}
