package exception_handling;

public class Demio {
	public static void main(String[] args)
	{
		try
		{
			int x=0;
			int a=1;
			
			int n[]=new int[10];
			for(int i=0;i<=10;i++)
			{
				n[i]=i;
				if(i==n.length)
				{
					x=a/x;
				}
			}
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Hello, I am just trying to check how Exception Handling works");
		}
	}

}
