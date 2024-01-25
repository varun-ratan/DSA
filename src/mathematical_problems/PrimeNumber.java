package mathematical_problems;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		int num=sc.nextInt();
		boolean res=prime(num);
		System.out.println("Given number is prime : " +res);

	}
	public static boolean prime(int num)
	{
		if(num==1)
		{
			return false;																		
		}
		int n=(int) Math.sqrt(num);
		for(int i=2;i<=n;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}

}
